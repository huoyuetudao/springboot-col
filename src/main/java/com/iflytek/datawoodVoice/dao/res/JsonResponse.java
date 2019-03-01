package com.iflytek.datawoodVoice.dao.res;

import java.io.Serializable;

public class JsonResponse<T> implements Serializable {
    
    /**
     * serialVersionUID
     */
    private static final long serialVersionUID = -4679481109462643045L;
    
    /**
     * 数据头部
     */
    private JsonHead head;
    
    public JsonResponse() {
        this.head = new JsonHead();
    }
    
    /**
     * 数据内容
     */
    private T data;
    
    public JsonHead getHead() {
        return head;
    }
    
    public void setHead(JsonHead head) {
        this.head = head;
    }
    
    public T getData() {
        return data;
    }
    
    public void setData(T data) {
        this.data = data;
    }
    
    @Override
    public String toString() {
        String ret = "{head:" + this.head.toString() + ",data:{";
        if (this.data != null) {
            ret += this.data.toString();
        }
        ret += "}";
        return ret;
    }
    
}
