package com.iflytek.datawoodVoice.dao.res;

public class JsonHead {
    
    /** 调用结果 */
    private ReturnCode code;
    
    /** 异常信息描述 */
    private String msg;
    
    public JsonHead() {
        this.code = ReturnCode.OK;
        this.msg = "";
    }
    
    public ReturnCode getCode() {
        return code;
    }
    
    public void setCode(ReturnCode code) {
        this.code = code;
    }
    
    public String getMsg() {
        return msg;
    }
    
    public void setMsg(String msg) {
        this.msg = msg;
    }
    
    @Override
    public String toString() {
        return "{code:" + this.code + ",msg:" + this.msg + "}";
    }
    
}
