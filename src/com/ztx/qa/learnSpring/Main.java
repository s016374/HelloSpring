package com.ztx.qa.learnSpring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by s016374 on 15/7/9.
 */
public class Main {
    public static void main(String args[]){
        /*
        HelloWorld helloWorld = new HelloWorld();
        helloWorld.setName("CcC");
        helloWorld.getName();
        */

        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");

        HelloWorld helloWorld = (HelloWorld) applicationContext.getBean("helloWorld");
        helloWorld.getName();

        Car car = (Car) applicationContext.getBean("car");
        System.out.println(car);

        car = (Car) applicationContext.getBean("car2");
        System.out.println(car);

        Person person = (Person) applicationContext.getBean("person");
        System.out.println(person);

        person = (Person) applicationContext.getBean("person2");
        System.out.println(person);

        person = (Person) applicationContext.getBean("person3");
        System.out.println(person);

        People people = (People) applicationContext.getBean("people");
        System.out.println(people);

        people = (People) applicationContext.getBean("people2");
        System.out.println(people);

        DataSource dataSource = applicationContext.getBean(DataSource.class);
        System.out.println(dataSource);

        people = (People) applicationContext.getBean("people3");
        System.out.println(people);
    }
}
