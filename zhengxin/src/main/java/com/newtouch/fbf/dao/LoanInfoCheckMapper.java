package com.newtouch.fbf.dao;

import com.newtouch.fbf.entity.LoanInfoCheck;
import com.newtouch.fbf.entity.LoanInfoCheckExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface LoanInfoCheckMapper {
    int countByExample(LoanInfoCheckExample example);

    int deleteByExample(LoanInfoCheckExample example);

    int deleteByPrimaryKey(String id);

    int insert(LoanInfoCheck record);

    int insertSelective(LoanInfoCheck record);

    List<LoanInfoCheck> selectByExample(LoanInfoCheckExample example);

    LoanInfoCheck selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") LoanInfoCheck record, @Param("example") LoanInfoCheckExample example);

    int updateByExample(@Param("record") LoanInfoCheck record, @Param("example") LoanInfoCheckExample example);

    int updateByPrimaryKeySelective(LoanInfoCheck record);

    int updateByPrimaryKey(LoanInfoCheck record);
    
    
    
    /**
     * 根据code查找
     * @param code
     * @return
     */
    LoanInfoCheck selectBycode(String reportCode);
    
}