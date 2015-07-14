package com.ztx.qa.learnSpring4;

import com.ztx.qa.learnSpring4.controller.UserController;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by s016374 on 15/7/14.
 */
public class Main {
    public static void main(String args[]) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext4.xml");

//        TestObject testObject = (TestObject) applicationContext.getBean("testObject");
//        System.out.println(testObject);

        UserController userController = (UserController) applicationContext.getBean("userController");
        System.out.println(userController);

//        UserRepositoryImpl userRepository = (UserRepositoryImpl) applicationContext.getBean("userRepository");
//        System.out.println(userRepository);

//        UserService userService = (UserService) applicationContext.getBean("userService");
//        System.out.println(userService);
    }
}
