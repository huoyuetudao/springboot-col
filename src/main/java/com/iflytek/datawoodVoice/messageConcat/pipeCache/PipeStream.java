package com.iflytek.datawoodVoice.messageConcat.pipeCache;

import java.io.PipedReader;
import java.io.PipedWriter;

public class PipeStream {

    private PipedReader pipedReader;

    private PipedWriter pipedWriter;

    private int flag;

    public PipedReader getPipedReader() {
        return pipedReader;
    }

    public void setPipedReader(PipedReader pipedReader) {
        this.pipedReader = pipedReader;
    }

    public PipedWriter getPipedWriter() {
        return pipedWriter;
    }

    public void setPipedWriter(PipedWriter pipedWriter) {
        this.pipedWriter = pipedWriter;
    }

    public int getFlag() {
        return flag;
    }

    public void setFlag(int flag) {
        this.flag = flag;
    }
}
