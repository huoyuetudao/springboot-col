package com.iflytek.datawoodVoice.activemq;

import com.alibaba.fastjson.JSONObject;
import com.iflytek.datawoodVoice.messageConcat.pipeCache.PipePool;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.PropertySource;
import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

import java.io.IOException;
import java.io.PipedReader;
import java.io.PipedWriter;

/**
 * 描述:activemq消息消费者类
 *
 * @author: yangxiao2
 */
@Component
@PropertySource(value = "classpath:config/datawoodVoice.properties", encoding = "UTF-8")
public class JMSConsumer {

    @Autowired
    private PipePool pipePool;

    private final static Logger logger = LoggerFactory.getLogger(JMSConsumer.class);

    @JmsListener(destination = "${activemq.vsppRes}")
    public void receiveVsppRes(String msg) {
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        //对接收的信息进行处理
        JSONObject mqRecieveJson = JSONObject.parseObject(msg);
        Integer pipeFlag = mqRecieveJson.getInteger("pipeFlag");
        PipedWriter pipedWriter = pipePool.getPipeStreamList().get(pipeFlag).getPipedWriter();
        //接收到引擎处理信息后通知接口返回
        try {

            pipedWriter.write(msg);
            //需要关闭write流
            pipedWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
//        SendMsgThread sendMsgThread = new SendMsgThread();
        logger.info("接收到消息: " + msg);
    }

    @JmsListener(destination = "${activemq.istRes}")
    public void receiveIstRes(String msg) {
        logger.info("接收到消息：" + msg);
    }
}
