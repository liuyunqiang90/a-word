package com.yun.service;

import com.yun.dynamicagent.agent.ProxyTest;
import com.yun.dynamicagent.inter.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

//@Component
public class YunService {


    private UserDao userDao;
//
//    public void setUserDao(UserDao userDao) {
//        this.userDao = userDao;
//    }


    public YunService(UserDao userDao) {
        this.userDao = userDao;
    }

    public void get(){
        System.out.println(userDao + "####");
    }

}
