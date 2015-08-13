package org.jerry.demo.dao.impl;

import org.apache.ibatis.annotations.Param;
import org.jerry.demo.mapper.SysAccountMapper;
import org.jerry.demo.model.SysAccount;
import org.springframework.stereotype.Repository;

/**
 * Created by jerry on 15-5-12.
 */
@Repository
public class SysAccountMapperImpl implements SysAccountMapper {
    @Override
    public int deleteByPrimaryKey(Integer accountId) {
        return 0;
    }

    @Override
    public int insert(SysAccount record) {
        return 0;
    }

    @Override
    public int insertSelective(SysAccount record) {
        return 0;
    }

    @Override
    public SysAccount selectByPrimaryKey(Integer accountId) {
        return null;
    }

    @Override
    public int updateByPrimaryKeySelective(SysAccount record) {
        return 0;
    }

    @Override
    public int updateByPrimaryKey(SysAccount record) {
        return 0;
    }

    @Override
    public SysAccount getAccountByName(@Param("accountName") String uName) {
        return null;
    }
}
