package com.iflytek.datawoodVoice.messageConcat.msgThread;


import java.io.IOException;
import java.io.PipedOutputStream;
import java.io.PipedWriter;

/**
 * 描述:发送管道流信息线程
 * @version
 * @author:  yangxiao2
 */
public class SendMsgThread extends Thread{

    /**
     * 存放要发送的信息
     */
    private String msg;

    /**
     * 管道字节输出流
     */
    private PipedOutputStream pipedOutputStream;

    /**
     * 管道字符输出流
     */
    private PipedWriter pipedWriter;

    @Override
    public void run() {
        try {
            //写入绑定的管道流的信息
            pipedWriter.write(msg);
            pipedWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public PipedOutputStream getPipedOutputStream() {
        return pipedOutputStream;
    }

    public void setPipedOutputStream(PipedOutputStream pipedOutputStream) {
        this.pipedOutputStream = pipedOutputStream;
    }

    public PipedWriter getPipedWriter() {
        return pipedWriter;
    }

    public void setPipedWriter(PipedWriter pipedWriter) {
        this.pipedWriter = pipedWriter;
    }
}
