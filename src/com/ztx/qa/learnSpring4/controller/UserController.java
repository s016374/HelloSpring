package com.ztx.qa.learnSpring4.controller;

import com.ztx.qa.learnSpring4.service.UserService;
import org.springframework.stereotype.Controller;

/**
 * Created by s016374 on 15/7/14.
 */
@Controller
public class UserController {
    private UserService userService;

    public void execute() {
        System.out.println("UserController execute...");
        userService.add();
    }
}
