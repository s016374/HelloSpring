package com.ztx.qa.learnSpring;

import java.util.List;
import java.util.Map;

/**
 * Created by s016374 on 15/7/9.
 */
public class People {
    private String name;
    private int age;
    private List<Car> cars;
    private Map<String, Car> stringCarMap;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public List<Car> getCars() {
        return cars;
    }

    public void setCars(List<Car> cars) {
        this.cars = cars;
    }

    public People() {
    }

    public People(String name, int age, List<Car> cars) {
        this.name = name;
        this.age = age;
        this.cars = cars;
    }

    public Map<String, Car> getStringCarMap() {
        return stringCarMap;
    }

    public void setStringCarMap(Map<String, Car> stringCarMap) {
        this.stringCarMap = stringCarMap;
    }

    public People(String name, int age, List<Car> cars, Map<String, Car> stringCarMap) {
        this.name = name;
        this.age = age;
        this.cars = cars;
        this.stringCarMap = stringCarMap;
    }

    public People(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "People{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", cars=" + cars +
                ", stringCarMap=" + stringCarMap +
                '}';
    }
}
