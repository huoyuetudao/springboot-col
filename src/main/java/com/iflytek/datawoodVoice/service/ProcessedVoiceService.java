package com.iflytek.datawoodVoice.service;

import com.iflytek.datawoodVoice.dao.domain.ProcessedVoice;
import com.iflytek.datawoodVoice.dao.vo.VsppVoiceVo;

import java.io.IOException;

/**
 * 描述:语音文件预处理接口定义
 * @version
 * @author:  yangxiao2
 */
public interface ProcessedVoiceService {

    /**
     * 描述:语音文件进行预处理接口
     * @version
     * @param voicePath：语音文件路径
     * @param voiceName：语音文件名
     * （voiceName,voicePath）
     * @author:  yangxiao2
     */
    VsppVoiceVo doVsppVoice(String voicePath, String voiceName) throws IOException;

}
