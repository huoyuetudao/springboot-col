package com.iflytek.datawoodVoice.messageConcat.pipeCache;

import java.util.List;
import java.util.concurrent.BlockingQueue;

public class PipePool {
    private BlockingQueue<Integer> unUse;

    private int poolSize;

    private List<PipeStream> pipeStreamList;


    public int getPoolSize() {
        return poolSize;
    }

    public void setPoolSize(int poolSize) {
        this.poolSize = poolSize;
    }


    public BlockingQueue<Integer> getUnUse() {
        return unUse;
    }

    public void setUnUse(BlockingQueue<Integer> unUse) {
        this.unUse = unUse;
    }

    public List<PipeStream> getPipeStreamList() {
        return pipeStreamList;
    }

    public void setPipeStreamList(List<PipeStream> pipeStreamList) {
        this.pipeStreamList = pipeStreamList;
    }
}
