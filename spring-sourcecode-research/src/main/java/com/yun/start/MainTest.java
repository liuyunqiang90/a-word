package com.yun.start;

import com.yun.app.AppConfig;
import com.yun.postprocess.LiuBeanFactoryPostprocessor;
import com.yun.service.E;
import com.yun.service.IndexService;
import com.yun.service.YunService;
import com.yun.service.ZhaoService;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.support.GenericBeanDefinition;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainTest {

    public static void main(String[] args) {
//        /**
//         * 如何手动将一个ZhaoService放到beanDefinitionMap中
//         * 1、首先肯定得new 一个BeanDefinition但是用哪个实现类呢？
//         */
        AnnotationConfigApplicationContext aac = new AnnotationConfigApplicationContext(AppConfig.class);
        IndexService bean = aac.getBean(IndexService.class);
        YunService yun = aac.getBean(YunService.class);
        yun.get();
        System.out.println(bean);
//        bean.testAop();
//        System.out.println(aac.getBean(E.class));
//        aac.register(AppConfig.class);
//        aac.addBeanFactoryPostProcessor(new LiuBeanFactoryPostprocessor());
//        aac.refresh();
//        GenericBeanDefinition gb = new GenericBeanDefinition();
//        gb.setBeanClass(ZhaoService.class);
//        gb.setAbstract(true);
//        aac.registerBean("zhaoService",ZhaoService.class);
//        aac.refresh();
//        System.out.println(aac.getBean(ZhaoService.class));

//        ApplicationContext app = new ClassPathXmlApplicationContext("spring.xml");
//        YunService yunService = app.getBean(YunService.class);
//        yunService.get();
    }
}
