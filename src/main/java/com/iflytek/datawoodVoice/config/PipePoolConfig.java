package com.iflytek.datawoodVoice.config;

import com.iflytek.datawoodVoice.messageConcat.pipeCache.PipePool;
import com.iflytek.datawoodVoice.messageConcat.pipeCache.PipeStream;
import org.springframework.beans.factory.annotation.Autowire;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.Scope;

import java.io.PipedReader;
import java.io.PipedWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingDeque;
import java.util.concurrent.BlockingQueue;

@Configuration
@PropertySource(value = "classpath:config/datawoodVoice.properties", encoding = "UTF-8")
public class PipePoolConfig {

    /**
     * 发送预处理队列名称
     */
    @Value("${pipepool.size}")
    private String poolSize;

    @Bean(name="pipePool")
    public PipePool initPipePool(){
        PipePool pipePool = new PipePool();
        int size = Integer.parseInt(poolSize);
        List<PipeStream> pipeStreamList = new ArrayList<PipeStream>();
        BlockingQueue<Integer> unUse = new ArrayBlockingQueue<Integer>(size);
        for(int i=0;i<size;i++){
            unUse.add(i);

            PipeStream pipeStream = new PipeStream();
            pipeStream.setFlag(i);
            pipeStream.setPipedReader(new PipedReader());
            pipeStream.setPipedWriter(new PipedWriter());
            pipeStreamList.add(pipeStream);
        }
        pipePool.setPoolSize(size);
        pipePool.setUnUse(unUse);
        pipePool.setPipeStreamList(pipeStreamList);
        return pipePool;
    }


    public String getPoolSize() {
        return poolSize;
    }

    public void setPoolSize(String poolSize) {
        this.poolSize = poolSize;
    }
}
