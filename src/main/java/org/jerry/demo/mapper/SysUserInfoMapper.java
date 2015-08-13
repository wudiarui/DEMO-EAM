package org.jerry.demo.mapper;

import org.jerry.demo.model.SysUserInfo;

public interface SysUserInfoMapper {
    int deleteByPrimaryKey(Integer userId);

    int insert(SysUserInfo record);

    int insertSelective(SysUserInfo record);

    SysUserInfo selectByPrimaryKey(Integer userId);

    int updateByPrimaryKeySelective(SysUserInfo record);

    int updateByPrimaryKey(SysUserInfo record);
}