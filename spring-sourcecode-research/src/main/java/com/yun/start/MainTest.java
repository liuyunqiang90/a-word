package com.yun.start;

import com.yun.app.AppConfig;
import com.yun.service.YunService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainTest {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext aac = new AnnotationConfigApplicationContext(AppConfig.class);
        YunService bean = aac.getBean(YunService.class);
        bean.get();
        System.out.println(bean);

    }
}
