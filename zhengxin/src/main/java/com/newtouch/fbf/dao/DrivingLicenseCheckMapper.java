package com.newtouch.fbf.dao;

import com.newtouch.fbf.entity.DrivingLicenseCheck;
import com.newtouch.fbf.entity.DrivingLicenseCheckExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DrivingLicenseCheckMapper {
    int countByExample(DrivingLicenseCheckExample example);

    int deleteByExample(DrivingLicenseCheckExample example);

    int deleteByPrimaryKey(String id);

    int insert(DrivingLicenseCheck record);

    int insertSelective(DrivingLicenseCheck record);

    List<DrivingLicenseCheck> selectByExample(DrivingLicenseCheckExample example);

    DrivingLicenseCheck selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") DrivingLicenseCheck record, @Param("example") DrivingLicenseCheckExample example);

    int updateByExample(@Param("record") DrivingLicenseCheck record, @Param("example") DrivingLicenseCheckExample example);

    int updateByPrimaryKeySelective(DrivingLicenseCheck record);

    int updateByPrimaryKey(DrivingLicenseCheck record);
}