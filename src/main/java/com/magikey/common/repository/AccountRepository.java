package com.magikey.common.repository;

import com.magikey.common.entity.TbSysAccountEntity;

/**
 * Created by dingyan on 15/8/18.
 */

public interface AccountRepository extends BaseRepository<TbSysAccountEntity, Integer> {
    TbSysAccountEntity findByAccountName(String accountName);
}
