package com.newtouch.fbf.dao;

import com.newtouch.fbf.entity.TUserBillingInformation;
import com.newtouch.fbf.entity.TUserBillingInformationExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TUserBillingInformationMapper {
    int countByExample(TUserBillingInformationExample example);

    int deleteByExample(TUserBillingInformationExample example);

    int deleteByPrimaryKey(String id);

    int insert(TUserBillingInformation record);

    int insertSelective(TUserBillingInformation record);

    List<TUserBillingInformation> selectByExample(TUserBillingInformationExample example);

    TUserBillingInformation selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") TUserBillingInformation record, @Param("example") TUserBillingInformationExample example);

    int updateByExample(@Param("record") TUserBillingInformation record, @Param("example") TUserBillingInformationExample example);

    int updateByPrimaryKeySelective(TUserBillingInformation record);

    int updateByPrimaryKey(TUserBillingInformation record);
}