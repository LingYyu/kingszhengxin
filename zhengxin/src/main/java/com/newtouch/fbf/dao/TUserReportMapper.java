package com.newtouch.fbf.dao;

import com.newtouch.fbf.entity.TUserReport;
import com.newtouch.fbf.entity.TUserReportExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TUserReportMapper {
    int countByExample(TUserReportExample example);

    int deleteByExample(TUserReportExample example);

    int deleteByPrimaryKey(String id);

    int insert(TUserReport record);

    int insertSelective(TUserReport record);

    List<TUserReport> selectByExample(TUserReportExample example);

    TUserReport selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") TUserReport record, @Param("example") TUserReportExample example);

    int updateByExample(@Param("record") TUserReport record, @Param("example") TUserReportExample example);

    int updateByPrimaryKeySelective(TUserReport record);

    int updateByPrimaryKey(TUserReport record);
    
//    根据报告编码查询TUserReport表的数据
    TUserReport selectByCode(String code);
}