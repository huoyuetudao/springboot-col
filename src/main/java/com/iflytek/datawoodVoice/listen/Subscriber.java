package com.iflytek.datawoodVoice.listen;

import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisPool;
import redis.clients.jedis.JedisPoolConfig;

public class Subscriber {

    public static void main(String[] args) {
        JedisPool pool = new JedisPool(new JedisPoolConfig(), "10.1.181.105",6379,1000,"123456",0);

        Jedis jedis = pool.getResource();

        jedis.psubscribe(new KeyExpiredListener(), "__key*@0__:expired");

    }

}