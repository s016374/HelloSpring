package com.ztx.qa.learnSpring4.repository;

import org.springframework.stereotype.Repository;

/**
 * Created by s016374 on 15/7/15.
 */
@Repository
public class UserJdbcRepositoryImpl implements UserRepository {
    @Override
    public void save() {
        System.out.println("UserJdbcRepository Save...");
    }
}
