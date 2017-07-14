package com.newtouch.fbf.dao;

import com.newtouch.fbf.entity.TUserLoanInfo;
import com.newtouch.fbf.entity.TUserLoanInfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TUserLoanInfoMapper {
    int countByExample(TUserLoanInfoExample example);

    int deleteByExample(TUserLoanInfoExample example);

    int deleteByPrimaryKey(String id);

    int insert(TUserLoanInfo record);

    int insertSelective(TUserLoanInfo record);

    List<TUserLoanInfo> selectByExample(TUserLoanInfoExample example);

    TUserLoanInfo selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") TUserLoanInfo record, @Param("example") TUserLoanInfoExample example);

    int updateByExample(@Param("record") TUserLoanInfo record, @Param("example") TUserLoanInfoExample example);

    int updateByPrimaryKeySelective(TUserLoanInfo record);

    int updateByPrimaryKey(TUserLoanInfo record);
}