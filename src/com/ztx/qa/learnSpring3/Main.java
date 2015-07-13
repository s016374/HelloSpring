package com.ztx.qa.learnSpring3;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by s016374 on 15/7/13.
 */
public class Main {
    public static void main(String args[]) {
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext3.xml");
        Car car = (Car) applicationContext.getBean("car");
        System.out.println(car);
        applicationContext.close();
    }
}
