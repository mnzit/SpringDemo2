package com.anup.springdemo.controller;

import com.anup.springdemo.response.GenericResponseWrapper;
import com.anup.springdemo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Manjit Shakya <manjit.shakya@f1soft.com>
 */
@RestController
@RequestMapping("user")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping
    public GenericResponseWrapper getAll(){
        return userService.getAll();
    }
}
