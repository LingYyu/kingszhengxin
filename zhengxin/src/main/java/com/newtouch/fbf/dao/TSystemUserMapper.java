package com.newtouch.fbf.dao;

import com.newtouch.fbf.entity.TSystemUser;
import com.newtouch.fbf.entity.TSystemUserExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TSystemUserMapper {
    int countByExample(TSystemUserExample example);

    int deleteByExample(TSystemUserExample example);

    int deleteByPrimaryKey(String id);

    int insert(TSystemUser record);

    int insertSelective(TSystemUser record);

    List<TSystemUser> selectByExample(TSystemUserExample example);

    TSystemUser selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") TSystemUser record, @Param("example") TSystemUserExample example);

    int updateByExample(@Param("record") TSystemUser record, @Param("example") TSystemUserExample example);

    int updateByPrimaryKeySelective(TSystemUser record);

    int updateByPrimaryKey(TSystemUser record);
}