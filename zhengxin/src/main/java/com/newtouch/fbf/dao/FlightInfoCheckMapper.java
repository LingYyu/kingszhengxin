package com.newtouch.fbf.dao;

import com.newtouch.fbf.entity.FlightInfoCheck;
import com.newtouch.fbf.entity.FlightInfoCheckExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface FlightInfoCheckMapper {
    int countByExample(FlightInfoCheckExample example);

    int deleteByExample(FlightInfoCheckExample example);

    int deleteByPrimaryKey(String id);

    int insert(FlightInfoCheck record);

    int insertSelective(FlightInfoCheck record);

    List<FlightInfoCheck> selectByExample(FlightInfoCheckExample example);

    FlightInfoCheck selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") FlightInfoCheck record, @Param("example") FlightInfoCheckExample example);

    int updateByExample(@Param("record") FlightInfoCheck record, @Param("example") FlightInfoCheckExample example);

    int updateByPrimaryKeySelective(FlightInfoCheck record);

    int updateByPrimaryKey(FlightInfoCheck record);
}