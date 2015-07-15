package com.ztx.qa.learnSpring4.service;

import com.ztx.qa.learnSpring4.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

/**
 * Created by s016374 on 15/7/14.
 */
@Service
public class UserService {
    private UserRepository userRepository;

    @Autowired
    @Qualifier("userRepositoryImpl")
    public void setUserRepository(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public void add() {
        System.out.println("UserService add...");
        userRepository.save();
    }
}
