package com.ztx.qa.learnSpring3;

/**
 * Created by s016374 on 15/7/13.
 */
public class Car {
    private String brand;

    public Car() {
        System.out.println("constructor......");
    }


    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
        System.out.println("setValue......");
    }

    public void init(){
        System.out.println("init......");
    }

    public void destroy(){
        System.out.println("destroy......");
    }

    @Override
    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                '}';
    }
}
