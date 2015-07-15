package com.ztx.qa.learnSpring6;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by s016374 on 15/7/15.
 */
public class Main {
    public static void main(String args[]) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext6.xml");
        Calculator calculator = (Calculator) applicationContext.getBean("calculatorImpl");

        int result = calculator.add(3, 6);
        System.out.println("Result: " + result);

        result = calculator.sub(2, 1);
        System.out.println("Result: " + result);

        result = calculator.mul(2, 3);
        System.out.println("Result: " + result);

        result = calculator.div(4, 2);
        System.out.println("Result: " + result);
    }
}
