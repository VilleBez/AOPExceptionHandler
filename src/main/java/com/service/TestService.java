package com.service;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestService {
    private static ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
    
    public Object runTest() {
        throw new IllegalArgumentException("這是測試");
    }

    public static void main(String[] args) {
        TestService ts = ac.getBean("testService", TestService.class);
        ts.runTest();
    }
}
