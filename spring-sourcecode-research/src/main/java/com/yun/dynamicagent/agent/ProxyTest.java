package com.yun.dynamicagent.agent;

import com.yun.dynamicagent.inter.UserDao;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class ProxyTest implements InvocationHandler {

    private UserDao userDao;

    public UserDao createProxy(){
        UserDao dao = (UserDao)Proxy.newProxyInstance(userDao.getClass().getClassLoader(), userDao.getClass().getInterfaces(), this);

        return dao;
    }

    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        return null;
    }
}
