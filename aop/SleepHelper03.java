package com.soft.aop;

import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.aop.AfterAdvice;
import org.springframework.aop.AfterReturningAdvice;
import org.springframework.aop.MethodBeforeAdvice;
import org.springframework.stereotype.Component;

import java.lang.reflect.Method;
@Aspect
@Component
public class SleepHelper03 {
    @Pointcut("execution(* *.sleep(..))")
    public void sleeps(){}

    @Before("sleeps()")
    public void before(){
        System.out.println("睡觉一");
    }

@AfterReturning("sleeps()")
    public void afterReturning() {
        System.out.println("睡觉二");
    }
}
