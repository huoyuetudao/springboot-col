package com.iflytek.datawoodVoice.activemq;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.stereotype.Component;

import javax.jms.Destination;

/**
 * 描述:activemq消息生产类
 *
 * @author: yangxiao2
 */
@Component
public class JMSProducer {
    @Autowired
    private JmsTemplate jmsTemplate;

    /**
     * 描述:发送消息方法
     * @param destination
     * @param message
     */
    public void sendMessage(Destination destination, String message){
        this.jmsTemplate.convertAndSend(destination,message);
    }
}
