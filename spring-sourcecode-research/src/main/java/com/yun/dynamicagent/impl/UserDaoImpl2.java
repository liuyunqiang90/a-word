package com.yun.dynamicagent.impl;

import com.yun.dynamicagent.inter.UserDao;
import org.springframework.stereotype.Component;

public class UserDaoImpl2 implements UserDao {
    @Override
    public void query() {
        System.out.println("query impl2..........");
    }
}
