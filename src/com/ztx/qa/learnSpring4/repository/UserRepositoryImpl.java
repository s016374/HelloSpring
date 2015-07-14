package com.ztx.qa.learnSpring4.repository;

import org.springframework.stereotype.Repository;

/**
 * Created by s016374 on 15/7/14.
 */
@Repository("userRepository")
public class UserRepositoryImpl implements UserRepository {
    @Override
    public void save() {
        System.out.println("UserRepository Save...");
    }
}
