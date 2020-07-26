package com.yun.service;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class IndexService {

// execution(modifiers-pattern? ret-type-pattern declaring-type-pattern?name-pattern(param-pattern)
//                throws-pattern?),第一个*代表service下的子包,第二个*是子包下的所有类,(..)不管有几个参数，不管参数类型
    @Pointcut("execution(public void com.yun.service.*.*(..))")
    private void pointCutWith(){

        System.out.println("11111111");
    }

    @Before("pointCutWith()")
    public void testAop(){
        System.out.println("test AOP............");
    }


}
