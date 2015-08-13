package org.jerry.demo.biz;

/**
 * Created by jerry on 15-3-31.
 */
public interface AccountProccesBIZ {
    /**
     * Account Be in system of login method.
     * @param accountName 接收用户输入账户名
     * @param password    接收用户输入密码.注意密码为SHA-2密报
     * @return Value: 0,1
     * @throws Exception
     */
    public int accountLogin(String accountName, String password) throws Exception;

}
