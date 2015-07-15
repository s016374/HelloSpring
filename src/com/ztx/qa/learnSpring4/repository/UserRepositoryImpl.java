package com.ztx.qa.learnSpring4.repository;

import com.ztx.qa.learnSpring4.TestObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 * Created by s016374 on 15/7/14.
 */
@Repository
public class UserRepositoryImpl implements UserRepository {
    @Autowired
    private TestObject testObject;

    @Override
    public void save() {
        System.out.println("UserRepository Save...");
        System.out.println(testObject);
    }
}
