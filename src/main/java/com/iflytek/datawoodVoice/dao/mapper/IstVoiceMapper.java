package com.iflytek.datawoodVoice.dao.mapper;

import com.iflytek.datawoodVoice.dao.domain.IstVoice;

public interface IstVoiceMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(IstVoice record);

    int insertSelective(IstVoice record);

    IstVoice selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(IstVoice record);

    int updateByPrimaryKey(IstVoice record);
}