package com.soft.aop;

import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.aop.AfterReturningAdvice;
import org.springframework.aop.BeforeAdvice;
import org.springframework.aop.MethodBeforeAdvice;
import org.springframework.stereotype.Component;

import java.lang.reflect.Method;

public class SleepHelper implements MethodBeforeAdvice, AfterReturningAdvice {


    @Override
    public void afterReturning(Object o, Method method, Object[] objects, Object o1) throws Throwable {
        System.out.println("睡觉二");
    }

    @Override
    public void before(Method method, Object[] objects, Object o) throws Throwable {
        System.out.println("睡觉一");
    }
}
