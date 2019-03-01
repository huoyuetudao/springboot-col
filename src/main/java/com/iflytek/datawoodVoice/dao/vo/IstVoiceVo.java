package com.iflytek.datawoodVoice.dao.vo;

/**
 * 描述:记录返回转写接口参数信息
 * @version
 * @author:  yangxiao2
 */
public class IstVoiceVo {

    /**
     * 语音文件名
     */
    private String voiceName;

    /**
     * 进行转写的语音文件地址，是voicePath,voicePurePath,voiceTrainPath中的一个（后者不为空，取后者，否则取前者）
     */
    private String istVoicePath;

    /**
     * 转写片段开始时间
     */
    private Double istBegin;

    /**
     * 转写片段结束时间
     */
    private Double istEnd;

    /**
     * 转写片段得分值
     */
    private Double istScore;

    /**
     * 转写片段文本内容
     */
    private String istText;

    public String getVoiceName() {
        return voiceName;
    }

    public void setVoiceName(String voiceName) {
        this.voiceName = voiceName;
    }

    public String getIstVoicePath() {
        return istVoicePath;
    }

    public void setIstVoicePath(String istVoicePath) {
        this.istVoicePath = istVoicePath;
    }

    public Double getIstBegin() {
        return istBegin;
    }

    public void setIstBegin(Double istBegin) {
        this.istBegin = istBegin;
    }

    public Double getIstEnd() {
        return istEnd;
    }

    public void setIstEnd(Double istEnd) {
        this.istEnd = istEnd;
    }

    public Double getIstScore() {
        return istScore;
    }

    public void setIstScore(Double istScore) {
        this.istScore = istScore;
    }

    public String getIstText() {
        return istText;
    }

    public void setIstText(String istText) {
        this.istText = istText;
    }
}
