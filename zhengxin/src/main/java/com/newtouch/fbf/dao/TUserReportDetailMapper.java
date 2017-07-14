package com.newtouch.fbf.dao;

import com.newtouch.fbf.entity.TUserReportDetail;
import com.newtouch.fbf.entity.TUserReportDetailExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TUserReportDetailMapper {
    int countByExample(TUserReportDetailExample example);

    int deleteByExample(TUserReportDetailExample example);

    int deleteByPrimaryKey(String id);

    int insert(TUserReportDetail record);

    int insertSelective(TUserReportDetail record);

    List<TUserReportDetail> selectByExample(TUserReportDetailExample example);

    TUserReportDetail selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") TUserReportDetail record, @Param("example") TUserReportDetailExample example);

    int updateByExample(@Param("record") TUserReportDetail record, @Param("example") TUserReportDetailExample example);

    int updateByPrimaryKeySelective(TUserReportDetail record);

    int updateByPrimaryKey(TUserReportDetail record);
}