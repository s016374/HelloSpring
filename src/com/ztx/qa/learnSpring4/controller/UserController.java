package com.ztx.qa.learnSpring4.controller;

import com.ztx.qa.learnSpring4.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

/**
 * Created by s016374 on 15/7/14.
 */
@Controller
public class UserController {
    @Autowired
    private UserService userService;

    @Autowired
    public void execute() {
        System.out.println("UserController execute...");
        userService.add();
    }
}
