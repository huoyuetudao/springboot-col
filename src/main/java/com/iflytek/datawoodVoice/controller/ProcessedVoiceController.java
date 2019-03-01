package com.iflytek.datawoodVoice.controller;

import com.iflytek.datawoodVoice.activemq.JMSProducer;
import com.iflytek.datawoodVoice.dao.domain.ProcessedVoice;
import com.iflytek.datawoodVoice.dao.res.JsonResponse;
import com.iflytek.datawoodVoice.dao.res.ReturnCode;
import com.iflytek.datawoodVoice.dao.vo.VsppVoiceVo;
import com.iflytek.datawoodVoice.service.ProcessedVoiceService;
import com.iflytek.datawoodVoice.util.Constants;
import org.apache.activemq.command.ActiveMQQueue;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.i18n.LocaleContextHolder;
import org.springframework.context.support.ResourceBundleMessageSource;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * 描述:语音文件预处理控制器
 *
 * @author: yangxiao2
 */
@Controller
@RequestMapping(value = "/processedVoice")
public class ProcessedVoiceController {

    @Autowired
    private JMSProducer jmsProducer;

    @Autowired
    private ProcessedVoiceService processedVoiceService;

    @Autowired
    private ResourceBundleMessageSource messageSource;

    private Logger logger = LoggerFactory.getLogger(this.getClass());


    /**
     * doVsppVoice:(语音预处理接口). <br/>
     *
     * @param voicePath：语音文件路径
     * @param voiceName：语音文件名
     * @return JsonResponse<Boolean>
     * @author yangxiao2
     * @since JDK 1.8
     */
    @ResponseBody
    @RequestMapping(value = "/doVsppVoice", produces = {"application/json;charset=UTF-8"}, method = RequestMethod.POST)
    public JsonResponse<VsppVoiceVo> doVsppVoice(String voicePath, String voiceName) {
//        jmsProducer.sendMessage(new ActiveMQQueue("ist-result"),"ist-result");
//        jmsProducer.sendMessage(new ActiveMQQueue("vspp-result"),"vspp-result");
        JsonResponse<VsppVoiceVo> result = new JsonResponse<VsppVoiceVo>();
        try {
            VsppVoiceVo res = processedVoiceService.doVsppVoice(voicePath, voiceName);
            if (res != null) {
                result.getHead().setCode(ReturnCode.OK);
                result.getHead().setMsg(Constants.LOAD_SUCCESS);
                result.setData(res);
            } else {
                result.getHead().setCode(ReturnCode.ERROR);
                result.getHead().setMsg(Constants.LOAD_ERROR);
            }
        } catch (Exception e) {
            logger.error(messageSource.getMessage(Constants.EXCEPTION_MESSAGE_KEY,
                    null,
                    LocaleContextHolder.getLocale()),
                    e);
            result.getHead().setCode(ReturnCode.ERROR);
            result.getHead().setMsg(Constants.LOAD_ERROR);
        }
        return result;
    }

}
