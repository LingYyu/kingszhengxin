package com.newtouch.fbf.dao;

import com.newtouch.fbf.entity.TUserBaseinfo;
import com.newtouch.fbf.entity.TUserBaseinfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TUserBaseinfoMapper {
    int countByExample(TUserBaseinfoExample example);

    int deleteByExample(TUserBaseinfoExample example);

    int deleteByPrimaryKey(String id);

    int insert(TUserBaseinfo record);

    int insertSelective(TUserBaseinfo record);

    List<TUserBaseinfo> selectByExample(TUserBaseinfoExample example);

    TUserBaseinfo selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") TUserBaseinfo record, @Param("example") TUserBaseinfoExample example);

    int updateByExample(@Param("record") TUserBaseinfo record, @Param("example") TUserBaseinfoExample example);

    int updateByPrimaryKeySelective(TUserBaseinfo record);

    int updateByPrimaryKey(TUserBaseinfo record);
}