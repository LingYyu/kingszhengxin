package com.newtouch.fbf.dao;

import com.newtouch.fbf.entity.TUserReportCount;
import com.newtouch.fbf.entity.TUserReportCountExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TUserReportCountMapper {
    int countByExample(TUserReportCountExample example);

    int deleteByExample(TUserReportCountExample example);

    int deleteByPrimaryKey(String id);

    int insert(TUserReportCount record);

    int insertSelective(TUserReportCount record);

    List<TUserReportCount> selectByExample(TUserReportCountExample example);

    TUserReportCount selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") TUserReportCount record, @Param("example") TUserReportCountExample example);

    int updateByExample(@Param("record") TUserReportCount record, @Param("example") TUserReportCountExample example);

    int updateByPrimaryKeySelective(TUserReportCount record);

    int updateByPrimaryKey(TUserReportCount record);
    
    /*
     * 根据身份证号查询出生成报告数
     */
    TUserReportCount selectByIdCard(String idCard);
}