package com.newtouch.fbf.dao;

import com.newtouch.fbf.entity.CarInformation;
import com.newtouch.fbf.entity.CarInformationExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CarInformationMapper {
    int countByExample(CarInformationExample example);

    int deleteByExample(CarInformationExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(CarInformation record);

    int insertSelective(CarInformation record);

    List<CarInformation> selectByExample(CarInformationExample example);

    CarInformation selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") CarInformation record, @Param("example") CarInformationExample example);

    int updateByExample(@Param("record") CarInformation record, @Param("example") CarInformationExample example);

    int updateByPrimaryKeySelective(CarInformation record);

    int updateByPrimaryKey(CarInformation record);
}