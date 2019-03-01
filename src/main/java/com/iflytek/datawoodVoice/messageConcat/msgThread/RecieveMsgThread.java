package com.iflytek.datawoodVoice.messageConcat.msgThread;

import java.io.IOException;
import java.io.PipedInputStream;
import java.io.PipedReader;


/**
 * 描述:接收管道流信息线程
 * @version
 * @author:  yangxiao2
 */
public class RecieveMsgThread extends Thread {

    /**
     * 存放接收信息
     */
    private String msg;

    /**
     * 管道字节输入流
     */
    private PipedInputStream pipedInputStream;

    /**
     * 管道字符输入流
     */
    private PipedReader pipedReader;

    @Override
    public void run() {
        try {
            StringBuffer buffer = new StringBuffer();
            char res[] = new char[1024];
            //读取绑定的管道流的信息
            int length = pipedReader.read(res);
            while (length != -1) {
                buffer.append(res);
                length = pipedReader.read(res);
            }
            msg = buffer.toString();
            //需要关闭read流
            pipedReader.close();
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

    public PipedInputStream getPipedInputStream() {
        return pipedInputStream;
    }

    public void setPipedInputStream(PipedInputStream pipedInputStream) {
        this.pipedInputStream = pipedInputStream;
    }

    public PipedReader getPipedReader() {
        return pipedReader;
    }

    public void setPipedReader(PipedReader pipedReader) {
        this.pipedReader = pipedReader;
    }
}
