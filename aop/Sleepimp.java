package com.soft.aop;

public class Sleepimp implements Sleepable {
    @Override
    public void sleep() {
        System.out.println("睡觉");
    }
}
