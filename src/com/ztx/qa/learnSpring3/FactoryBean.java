package com.ztx.qa.learnSpring3;

/**
 * Created by s016374 on 15/7/14.
 */
public class FactoryBean implements org.springframework.beans.factory.FactoryBean<Phone> {
    private String brand;
    private double price;

    @Override
    public Phone getObject() throws Exception {
        return new Phone(brand, price);
    }

    @Override
    public Class<?> getObjectType() {
        return Phone.class;
    }

    @Override
    public boolean isSingleton() {
        return true;
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
}
