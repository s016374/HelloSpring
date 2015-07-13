package com.ztx.qa.learnSpring3;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

/**
 * Created by s016374 on 15/7/13.
 */
public class MyBeanPostProcessor implements BeanPostProcessor {
    Car car = new Car();
    @Override
    public Object postProcessBeforeInitialization(Object o, String s) throws BeansException {
        System.out.println("postProcessBeforeInitialization\t" + o + "\t" + s);
        car.setBrand("BMW");
        return car;
    }

    @Override
    public Object postProcessAfterInitialization(Object o, String s) throws BeansException {
        System.out.println("postProcessAfterInitialization\t" + o + "\t" + s);
        car.setBrand("Audi");
        return car;
    }
}
