package com.soft.aop;

import com.soft.web.AdminlistAction;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class Test {

    public static void main(String[] args) {
        ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
//        Sleepable lina1 =  (Sleepable)ac.getBean("linaProxy");
//        Sleepable lina2 =  (Sleepable)ac.getBean("lina");
//        lina1.sleep();
//        lina2.sleep();
        AdminlistAction adminlistAction= ac.getBean("adminlistAction", AdminlistAction.class);
        adminlistAction.find();
    }
}
