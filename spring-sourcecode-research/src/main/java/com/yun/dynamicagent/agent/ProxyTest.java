package com.yun.dynamicagent.agent;

import com.yun.dynamicagent.inter.UserDao;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class ProxyTest implements InvocationHandler {

    private UserDao userDao;

    public ProxyTest(UserDao userDao) {
        this.userDao = userDao;
    }

    public UserDao createProxy(){
        UserDao dao = (UserDao)Proxy.newProxyInstance(userDao.getClass().getClassLoader(), userDao.getClass().getInterfaces(), this);

        return dao;
    }

    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

        System.out.println("1111111");
        return method.invoke(userDao,null);
    }
}
