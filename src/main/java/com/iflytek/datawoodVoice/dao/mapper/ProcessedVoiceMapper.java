package com.iflytek.datawoodVoice.dao.mapper;

import com.iflytek.datawoodVoice.dao.domain.ProcessedVoice;

public interface ProcessedVoiceMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(ProcessedVoice record);

    int insertSelective(ProcessedVoice record);

    ProcessedVoice selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(ProcessedVoice record);

    int updateByPrimaryKey(ProcessedVoice record);
}