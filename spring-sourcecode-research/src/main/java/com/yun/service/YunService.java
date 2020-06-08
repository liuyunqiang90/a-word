package com.yun.service;

import com.yun.dynamicagent.agent.ProxyTest;
import com.yun.dynamicagent.inter.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class YunService {

//    @Autowired
    private UserDao userDao;

    public void get(){
        ProxyTest proxyTest = new ProxyTest();
        UserDao proxy = proxyTest.createProxy();
        proxy.query();
    }

}
