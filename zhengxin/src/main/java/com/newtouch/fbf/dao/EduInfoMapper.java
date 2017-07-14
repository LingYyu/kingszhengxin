package com.newtouch.fbf.dao;

import com.newtouch.fbf.entity.EduInfo;
import com.newtouch.fbf.entity.EduInfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface EduInfoMapper {
    int countByExample(EduInfoExample example);

    int deleteByExample(EduInfoExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(EduInfo record);

    int insertSelective(EduInfo record);

    List<EduInfo> selectByExample(EduInfoExample example);

    EduInfo selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") EduInfo record, @Param("example") EduInfoExample example);

    int updateByExample(@Param("record") EduInfo record, @Param("example") EduInfoExample example);

    int updateByPrimaryKeySelective(EduInfo record);

    int updateByPrimaryKey(EduInfo record);
}