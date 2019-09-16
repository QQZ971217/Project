package com.soft.aop;

import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;


public class SleepHelper04 {

    public void beforeSleep(){
        System.out.println("睡觉一");
    }

    public void afterSleep() {
        System.out.println("睡觉二");
    }
}
