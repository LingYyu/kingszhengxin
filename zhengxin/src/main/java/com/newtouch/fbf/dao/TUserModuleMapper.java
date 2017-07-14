package com.newtouch.fbf.dao;

import com.newtouch.fbf.entity.TUserModule;
import com.newtouch.fbf.entity.TUserModuleExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TUserModuleMapper {
    int countByExample(TUserModuleExample example);

    int deleteByExample(TUserModuleExample example);

    int deleteByPrimaryKey(String id);

    int insert(TUserModule record);

    int insertSelective(TUserModule record);

    List<TUserModule> selectByExample(TUserModuleExample example);

    TUserModule selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") TUserModule record, @Param("example") TUserModuleExample example);

    int updateByExample(@Param("record") TUserModule record, @Param("example") TUserModuleExample example);

    int updateByPrimaryKeySelective(TUserModule record);

    int updateByPrimaryKey(TUserModule record);
}