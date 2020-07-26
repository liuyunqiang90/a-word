package com.yun.app;

import org.springframework.context.annotation.*;

@ComponentScan("com.yun")
@Configuration
@EnableAspectJAutoProxy(proxyTargetClass = true)//加上(proxyTargetClass = true)强制使用cglib代理
public class AppConfig {


}
