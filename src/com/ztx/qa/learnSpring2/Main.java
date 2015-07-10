package com.ztx.qa.learnSpring2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by s016374 on 15/7/10.
 */
public class Main {
    public static void main(String args[]) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext2.xml");

        Person person = (Person) applicationContext.getBean("person");
        System.out.println(person);

        DataSource dataSource = applicationContext.getBean(DataSource.class);
        System.out.println(dataSource);
    }
}
