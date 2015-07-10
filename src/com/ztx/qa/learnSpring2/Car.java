package com.ztx.qa.learnSpring2;

/**
 * Created by s016374 on 15/7/10.
 */
public class Car {
    private String brand;
    private double price;

    public Car() {
    }

    public Car(double price, String brand) {
        this.price = price;
        this.brand = brand;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", price=" + price +
                '}';
    }
}
