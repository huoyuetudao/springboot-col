package com.iflytek.datawoodVoice.dao.domain;

/**
 * 描述:processed_voice表的实体类，用来记录语音预处理和转码的信息
 * @version
 * @author:  yangxiao2
 */
public class ProcessedVoice {
    /**
     * ProcessedVoice表主键（自增长）
     */
    private Integer id;

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
     * 语音文件提纯后地址
     */
    private String voicePurePath;

    /**
     * 语音文件时长
     */
    private Double voiceLength;

    /**
     * 语音文件大小
     */
    private Double voiceSize;

    /**
     * 语音文件比特率
     */
    private Integer voiceBit;

    /**
     * 语音文件采样率
     */
    private Integer voiceRate;

    /**
     * 语音文件声道数
     */
    private Byte voiceChannel;

    /**
     * 语音文件语种
     */
    private String voiceLang;

    /**
     * 语音文件预处理状态
     */
    private Byte voiceProcessStatus;

    /**
     * 语音文件转写状态
     */
    private Byte voiceIstStatus;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getVoiceName() {
        return voiceName;
    }

    public void setVoiceName(String voiceName) {
        this.voiceName = voiceName == null ? null : voiceName.trim();
    }

    public String getVoicePath() {
        return voicePath;
    }

    public void setVoicePath(String voicePath) {
        this.voicePath = voicePath == null ? null : voicePath.trim();
    }

    public String getVoiceTrainPath() {
        return voiceTrainPath;
    }

    public void setVoiceTrainPath(String voiceTrainPath) {
        this.voiceTrainPath = voiceTrainPath == null ? null : voiceTrainPath.trim();
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

    public Integer getVoiceBit() {
        return voiceBit;
    }

    public void setVoiceBit(Integer voiceBit) {
        this.voiceBit = voiceBit;
    }

    public Integer getVoiceRate() {
        return voiceRate;
    }

    public void setVoiceRate(Integer voiceRate) {
        this.voiceRate = voiceRate;
    }

    public Byte getVoiceChannel() {
        return voiceChannel;
    }

    public void setVoiceChannel(Byte voiceChannel) {
        this.voiceChannel = voiceChannel;
    }

    public Byte getVoiceProcessStatus() {
        return voiceProcessStatus;
    }

    public void setVoiceProcessStatus(Byte voiceProcessStatus) {
        this.voiceProcessStatus = voiceProcessStatus;
    }

    public Byte getVoiceIstStatus() {
        return voiceIstStatus;
    }

    public void setVoiceIstStatus(Byte voiceIstStatus) {
        this.voiceIstStatus = voiceIstStatus;
    }

    public String getVoiceLang() {
        return voiceLang;
    }

    public void setVoiceLang(String voiceLang) {
        this.voiceLang = voiceLang;
    }

    public String getVoicePurePath() {
        return voicePurePath;
    }

    public void setVoicePurePath(String voicePurePath) {
        this.voicePurePath = voicePurePath;
    }
}