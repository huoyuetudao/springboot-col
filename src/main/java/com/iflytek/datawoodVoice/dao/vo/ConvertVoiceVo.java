package com.iflytek.datawoodVoice.dao.vo;

/**
 * 描述:记录返回语音转码接口参数信息
 * @version
 * @author:  yangxiao2
 */
public class ConvertVoiceVo {
    /**
     * 语音文件名
     */
    private String voiceName;

    /**
     * 语音文件地址
     */
    private String voicePath;

    /**
     * 语音文件转码后地址
     */
    private String voiceTrainPath;

    /**
     * 语音文件时长
     */
    private Double voiceLength;

    /**
     * 语音文件大小
     */
    private Double voiceSize;

    public String getVoiceName() {
        return voiceName;
    }

    public void setVoiceName(String voiceName) {
        this.voiceName = voiceName;
    }

    public String getVoicePath() {
        return voicePath;
    }

    public void setVoicePath(String voicePath) {
        this.voicePath = voicePath;
    }

    public String getVoiceTrainPath() {
        return voiceTrainPath;
    }

    public void setVoiceTrainPath(String voiceTrainPath) {
        this.voiceTrainPath = voiceTrainPath;
    }

    public Double getVoiceLength() {
        return voiceLength;
    }

    public void setVoiceLength(Double voiceLength) {
        this.voiceLength = voiceLength;
    }

    public Double getVoiceSize() {
        return voiceSize;
    }

    public void setVoiceSize(Double voiceSize) {
        this.voiceSize = voiceSize;
    }
}
