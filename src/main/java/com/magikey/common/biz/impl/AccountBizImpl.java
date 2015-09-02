package com.magikey.common.biz.impl;

import com.magikey.common.biz.AccountBiz;
import com.magikey.common.entity.TbSysAccountEntity;
import com.magikey.common.repository.AccountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.StringUtils;

/**
 * Created by dingyan on 15/8/20.
 */
@Component
@Transactional
public class AccountBizImpl implements AccountBiz {

    @Autowired
    private AccountRepository accountDao;

    @Override
    public boolean login(String account, String password) {
        if(StringUtils.isEmpty(account) || StringUtils.isEmpty(password)) {return false;}

        TbSysAccountEntity accountEntity = (TbSysAccountEntity) accountDao.findByAccountName(account);
        if(null != accountEntity && accountEntity.getAccountId() > 0) {
            if(null != accountEntity.getAccountPassword() && password.equals(accountEntity.getAccountPassword())) {
                return true;
            }
        }
        return false;
    }
}
