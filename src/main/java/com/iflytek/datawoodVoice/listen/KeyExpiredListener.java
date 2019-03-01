package com.iflytek.datawoodVoice.listen;

import redis.clients.jedis.JedisPubSub;

public class KeyExpiredListener extends JedisPubSub {

    @Override
    public void onPSubscribe(String pattern, int subscribedChannels) {
        System.out.println("onPSubscribe "
                + pattern + " " + subscribedChannels);
        System.out.println("subscribedChannels="+ subscribedChannels);

    }

    @Override
    public void onPMessage(String pattern, String channel, String message) {

        System.out.println("onPMessage pattern "
                + pattern + " " + channel + " " + message+"111");
    }
}
 
 
 

