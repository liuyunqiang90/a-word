package com.yun.postprocess;

import com.yun.service.ZhaoService;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.beans.factory.support.GenericBeanDefinition;
import org.springframework.stereotype.Component;

/**
 * 扫描之后 parse将beanDefinition放到map中之后执行postProcessBeanFactory
 * 如下：可以将yunService的beanDefinition从容器直接替换成ZhaoServicr.class
 */
//@Component
public class YunBeanFactoryPostprocessor implements BeanFactoryPostProcessor {
    @Override
    public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {
//        BeanDefinition yunService = beanFactory.getBeanDefinition("yunService");
//        GenericBeanDefinition gb = (GenericBeanDefinition) beanFactory.getBeanDefinition("yunService");
//        gb.setBeanClass(ZhaoService.class);
//        Class<?> type = beanFactory.getType("");
//        Object bean = beanFactory.getBean("");


    }
}
