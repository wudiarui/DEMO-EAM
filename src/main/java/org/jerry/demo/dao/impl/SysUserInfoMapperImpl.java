package org.jerry.demo.dao.impl;

import org.jerry.demo.mapper.SysUserInfoMapper;
import org.jerry.demo.model.SysUserInfo;
import org.springframework.stereotype.Repository;

/**
 * Created by jerry on 15-5-12.
 */
@Repository
public class SysUserInfoMapperImpl implements SysUserInfoMapper {
    @Override
    public int deleteByPrimaryKey(Integer userId) {
        return 0;
    }

    @Override
    public int insert(SysUserInfo record) {
        return 0;
    }

    @Override
    public int insertSelective(SysUserInfo record) {
        return 0;
    }

    @Override
    public SysUserInfo selectByPrimaryKey(Integer userId) {
        return null;
    }

    @Override
    public int updateByPrimaryKeySelective(SysUserInfo record) {
        return 0;
    }

    @Override
    public int updateByPrimaryKey(SysUserInfo record) {
        return 0;
    }
}
