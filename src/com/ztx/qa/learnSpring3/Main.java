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

        Phone phone = (Phone) applicationContext.getBean("phone1");
        System.out.println(phone);
        phone = (Phone) applicationContext.getBean("phone2");
        System.out.println(phone);

        phone = (Phone) applicationContext.getBean("phone3");
        System.out.println(phone);
        phone = (Phone) applicationContext.getBean("phone4");
        System.out.println(phone);

        applicationContext.close();
    }
}
