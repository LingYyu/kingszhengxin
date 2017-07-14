package com.newtouch.fbf.dao;

import com.newtouch.fbf.entity.LegalPersonCheck;
import com.newtouch.fbf.entity.LegalPersonCheckExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface LegalPersonCheckMapper {
    int countByExample(LegalPersonCheckExample example);

    int deleteByExample(LegalPersonCheckExample example);

    int deleteByPrimaryKey(String id);

    int insert(LegalPersonCheck record);

    int insertSelective(LegalPersonCheck record);

    List<LegalPersonCheck> selectByExample(LegalPersonCheckExample example);

    LegalPersonCheck selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") LegalPersonCheck record, @Param("example") LegalPersonCheckExample example);

    int updateByExample(@Param("record") LegalPersonCheck record, @Param("example") LegalPersonCheckExample example);

    int updateByPrimaryKeySelective(LegalPersonCheck record);

    int updateByPrimaryKey(LegalPersonCheck record);
}