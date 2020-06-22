package com.yun.app;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@ComponentScan("com.yun")
@Configuration
@MapperScan
public class AppConfig {
}
