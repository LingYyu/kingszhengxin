package com.newtouch.fbf.dao;

import com.newtouch.fbf.entity.IllegalInfoCheck;
import com.newtouch.fbf.entity.IllegalInfoCheckExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface IllegalInfoCheckMapper {
    int countByExample(IllegalInfoCheckExample example);

    int deleteByExample(IllegalInfoCheckExample example);

    int deleteByPrimaryKey(String id);

    int insert(IllegalInfoCheck record);

    int insertSelective(IllegalInfoCheck record);

    List<IllegalInfoCheck> selectByExample(IllegalInfoCheckExample example);

    IllegalInfoCheck selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") IllegalInfoCheck record, @Param("example") IllegalInfoCheckExample example);

    int updateByExample(@Param("record") IllegalInfoCheck record, @Param("example") IllegalInfoCheckExample example);

    int updateByPrimaryKeySelective(IllegalInfoCheck record);

    int updateByPrimaryKey(IllegalInfoCheck record);
}