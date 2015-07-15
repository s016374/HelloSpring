package com.ztx.qa.learnSpring5;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by s016374 on 15/7/15.
 */
public class Main {
    public static void main(String args[]) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext5.xml");

        UserService userService = (UserService) applicationContext.getBean("userService");
        userService.add();
    }
}
