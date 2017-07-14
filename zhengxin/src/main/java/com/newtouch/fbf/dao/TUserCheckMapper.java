package com.newtouch.fbf.dao;

import com.newtouch.fbf.entity.TUserCheck;
import com.newtouch.fbf.entity.TUserCheckExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TUserCheckMapper {
    int countByExample(TUserCheckExample example);

    int deleteByExample(TUserCheckExample example);

    int deleteByPrimaryKey(String idCard);

    int insert(TUserCheck record);

    int insertSelective(TUserCheck record);

    List<TUserCheck> selectByExample(TUserCheckExample example);

    TUserCheck selectByPrimaryKey(String idCard);

    int updateByExampleSelective(@Param("record") TUserCheck record, @Param("example") TUserCheckExample example);

    int updateByExample(@Param("record") TUserCheck record, @Param("example") TUserCheckExample example);

    int updateByPrimaryKeySelective(TUserCheck record);

    int updateByPrimaryKey(TUserCheck record);
}