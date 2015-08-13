package org.jerry.demo.mapper;

import org.apache.ibatis.annotations.Param;
import org.jerry.demo.model.SysAccount;

public interface SysAccountMapper {
    int deleteByPrimaryKey(Integer accountId);

    int insert(SysAccount record);

    int insertSelective(SysAccount record);

    SysAccount selectByPrimaryKey(Integer accountId);

    int updateByPrimaryKeySelective(SysAccount record);

    int updateByPrimaryKey(SysAccount record);

    /**
     * 通过账户名获取账户信息
     * @param uName
     * @return
     */
    SysAccount getAccountByName(@Param("accountName")String uName);
}