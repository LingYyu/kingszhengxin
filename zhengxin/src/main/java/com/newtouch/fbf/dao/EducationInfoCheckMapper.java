package com.newtouch.fbf.dao;

import com.newtouch.fbf.entity.EducationInfoCheck;
import com.newtouch.fbf.entity.EducationInfoCheckExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface EducationInfoCheckMapper {
    int countByExample(EducationInfoCheckExample example);

    int deleteByExample(EducationInfoCheckExample example);

    int deleteByPrimaryKey(String id);

    int insert(EducationInfoCheck record);

    int insertSelective(EducationInfoCheck record);

    List<EducationInfoCheck> selectByExample(EducationInfoCheckExample example);

    EducationInfoCheck selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") EducationInfoCheck record, @Param("example") EducationInfoCheckExample example);

    int updateByExample(@Param("record") EducationInfoCheck record, @Param("example") EducationInfoCheckExample example);

    int updateByPrimaryKeySelective(EducationInfoCheck record);

    int updateByPrimaryKey(EducationInfoCheck record);

    /*
     * 根据编码查找学历信息
     */
	EducationInfoCheck selectByCode(String code);
}