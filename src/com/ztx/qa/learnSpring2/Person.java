package com.ztx.qa.learnSpring2;

/**
 * Created by s016374 on 15/7/10.
 */
public class Person {
    private String name;
    private Address address;
    private Car car;
    private String info;

    public Person() {
    }

    public Person(String name, Address address, Car car) {
        this.name = name;
        this.address = address;
        this.car = car;
    }

    public Person(String name, Address address, Car car, String info) {
        this.name = name;
        this.address = address;
        this.car = car;
        this.info = info;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public Car getCar() {
        return car;
    }

    public void setCar(Car car) {
        this.car = car;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", address=" + address +
                ", car=" + car +
                ", info='" + info + '\'' +
                '}';
    }
}
