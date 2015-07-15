package com.ztx.qa.learnSpring5;

import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by s016374 on 15/7/15.
 */
public class BaseService<T> {
    @Autowired
    protected BaseRepository<User> baseRepository;

    public void add() {
        System.out.println("add...");
        System.out.println(baseRepository);
    }
}
