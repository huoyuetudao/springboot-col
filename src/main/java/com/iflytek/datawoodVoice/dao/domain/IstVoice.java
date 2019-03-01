package com.iflytek.datawoodVoice.dao.domain;

public class IstVoice {
    private Integer id;

    private Integer processedVoiceId;

    private Double istBegin;

    private Double istEnd;

    private Double istScore;

    private String istText;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getProcessedVoiceId() {
        return processedVoiceId;
    }

    public void setProcessedVoiceId(Integer processedVoiceId) {
        this.processedVoiceId = processedVoiceId;
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
        this.istText = istText == null ? null : istText.trim();
    }
}