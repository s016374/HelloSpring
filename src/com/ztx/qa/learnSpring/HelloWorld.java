package com.ztx.qa.learnSpring;

/**
 * Created by s016374 on 15/7/9.
 */
public class HelloWorld {
    private String name;

    public void getName() {
        System.out.println("Hello World: " + this.name);
    }

    public void setName(String name) {
        this.name = name;
        System.out.println("do setName()...");
    }

    public HelloWorld() {
        System.out.println("do HelloWorld()...");
    }
}
