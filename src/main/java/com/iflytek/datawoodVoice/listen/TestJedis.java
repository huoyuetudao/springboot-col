package com.iflytek.datawoodVoice.listen;

import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisPool;
import redis.clients.jedis.JedisPoolConfig;

public class TestJedis {
 
    public static void main(String[] args) {
        JedisPool pool = new JedisPool(new JedisPoolConfig(), "10.1.181.105",6379,60000,"123456",1);
 
        Jedis jedis = pool.getResource();
        jedis.select(0);
        jedis.set("notify", "新浪微博：小叶子一点也不逗");
        jedis.expire("notify", 10);
        jedis.select(1);
        jedis.set("notify1", "新浪微博：小叶子一点也不逗");
        jedis.expire("notify1", 10);
 
    }
}
