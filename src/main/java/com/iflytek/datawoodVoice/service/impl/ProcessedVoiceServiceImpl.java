package com.iflytek.datawoodVoice.service.impl;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.iflytek.datawoodVoice.activemq.JMSConsumer;
import com.iflytek.datawoodVoice.activemq.JMSProducer;
import com.iflytek.datawoodVoice.dao.domain.ProcessedVoice;
import com.iflytek.datawoodVoice.dao.mapper.ProcessedVoiceMapper;
import com.iflytek.datawoodVoice.dao.vo.VsppVoiceVo;
import com.iflytek.datawoodVoice.messageConcat.msgThread.RecieveMsgThread;
import com.iflytek.datawoodVoice.messageConcat.pipeCache.PipePool;
import com.iflytek.datawoodVoice.service.ProcessedVoiceService;
import org.apache.activemq.command.ActiveMQQueue;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.io.PipedReader;
import java.io.PipedWriter;

/**
 * 描述:语音文件预处理接口实现
 *
 * @author: yangxiao2
 */
@Service(value = "processedVoiceService")
@PropertySource(value = "classpath:config/datawoodVoice.properties", encoding = "UTF-8")
public class ProcessedVoiceServiceImpl implements ProcessedVoiceService {

    private final static Logger logger = LoggerFactory.getLogger(ProcessedVoiceService.class);

    /**
     * 发送预处理队列名称
     */
    @Value("${activemq.vsppRes}")
    private String doVsppMq;

    /**
     * 预处理超时时长
     */
    @Value("${timelimit.dovspp}")
    private String vsppTimeLimit;

    @Autowired
    private ProcessedVoiceMapper processedVoiceMapper;

    @Autowired
    private PipePool pipePool;

    @Autowired
    private JMSProducer jmsProducer;

    /**
     * 描述:语音文件进行预处理接口
     *
     * @param voicePath：语音文件路径
     * @param voiceName：语音文件名  （voiceName,voicePath）
     * @version
     * @author: yangxiao2
     */
    @Override
    public VsppVoiceVo doVsppVoice(String voicePath, String voiceName) throws IOException {
        Integer pipeFlag = pipePool.getUnUse().poll();
        //构造vspp处理结果返回
        VsppVoiceVo vsppVoiceVo = new VsppVoiceVo();
        if (pipeFlag == null) {
            logger.error("当前通信管道使用比例为:" + pipePool.getPoolSize() + "/" + 0 + "，稍后再试");
            vsppVoiceVo = null;
        } else {

            ProcessedVoice processedVoice = new ProcessedVoice();
            processedVoice.setVoicePath(voicePath);
            processedVoice.setVoiceName(voiceName);
            JSONObject mqSendJson = new JSONObject();
            mqSendJson.put("pipeFlag", pipeFlag);
            mqSendJson.put("processedVoice", processedVoice);
            //发送mq队列给datawoodVoice-skynet
            jmsProducer.sendMessage(new ActiveMQQueue(doVsppMq), JSON.toJSONString(mqSendJson));

            //接口阻塞直到引擎返回结果或者处理超时
            RecieveMsgThread recieveMsgThread = new RecieveMsgThread();
            PipedWriter pipedWriter = pipePool.getPipeStreamList().get(pipeFlag).getPipedWriter();
            PipedReader pipedReader = pipePool.getPipeStreamList().get(pipeFlag).getPipedReader();

            try {
                pipedWriter.connect(pipedReader);
            } catch (IOException e) {
                pipedWriter = new PipedWriter();
                pipedReader = new PipedReader();
                pipePool.getPipeStreamList().get(pipeFlag).setPipedWriter(pipedWriter);
                pipePool.getPipeStreamList().get(pipeFlag).setPipedReader(pipedReader);
                pipedReader.connect(pipedWriter);
            }
            recieveMsgThread.setPipedReader(pipedReader);
            recieveMsgThread.start();
            try {
                recieveMsgThread.join(Integer.parseInt(vsppTimeLimit));
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            String res = recieveMsgThread.getMsg();
            pipePool.getUnUse().offer(pipeFlag);
            if (res == null) {
                logger.error("引擎处理超时");
                //如果处理超时返回空值
                vsppVoiceVo = null;
            }
        }

//        processedVoiceMapper.insert(processedVoice);
        return vsppVoiceVo;
    }
}
