package com.nanda.spring.di.demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AppMain {

    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring.xml");
        TestContext testContext = (TestContext) applicationContext.getBean("test");

        System.out.println(testContext.getBrowserContext());
    }
}
