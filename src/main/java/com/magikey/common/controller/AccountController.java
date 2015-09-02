package com.magikey.common.controller;

import com.magikey.common.biz.AccountBiz;
import com.magikey.common.exception.BaseError;
import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by dingyan on 15/8/21.
 */
@Controller
public class AccountController {
    @Autowired
    private AccountBiz accountBiz;

    @RequestMapping("/userLogin")
    @ResponseBody
    public Map<String, Object> login(String accName, String accPwd) {
        Map<String, Object> viewMap = new HashMap<String, Object>();
        BaseError error = new BaseError();
        String md5Password = null;

        if(StringUtils.isNotBlank(accPwd)) {
            // MD5 encoding
        }

        if(StringUtils.isBlank(accName)) {
            error.setErrorName("传参失败");
            error.setErrorMessage("账号名为空，或不可识别.");
            viewMap.clear();
            viewMap.put("errors", error);
            return viewMap;
        }

        if (accountBiz.login(accName, md5Password)) {
            viewMap.clear();
            viewMap.put("success", true);
            viewMap.put("forward", "/main");
            viewMap.put("message", "Account sign-in is success!");
            return viewMap;
        } else {
            error.setErrorName("服务器404");
            error.setErrorMessage("请查看后台控制台.");
            viewMap.clear();
            viewMap.put("errors", error);
            return viewMap;
        }
    }

    @RequestMapping(value = "/login", method = RequestMethod.GET)
    public String login2(HttpServletRequest request) {
        String username = request.getParameter("username").trim();
        System.out.println(username);
        return "login2";
    }
}
