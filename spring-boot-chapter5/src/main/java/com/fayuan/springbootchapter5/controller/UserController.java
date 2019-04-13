/**
 * @Company Mister24.com Inc.
 * @Copyright Copyright (c) 2016-2019 All Rights Reserved.
 */
package com.fayuan.springbootchapter5.controller;

import com.fayuan.springbootchapter3.entity.User;
import com.fayuan.springbootchapter3.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author mr.24
 * @version Id: UserController, v 1.0 2019-04-13 15:11 Exp $$
 */
@Controller
public class UserController {
    @Autowired
    UserService userService;

    @RequestMapping("/user/{id}")
    public @ResponseBody
    User say(@PathVariable Long id){
        User user= userService.getUserById(id);
        return user;
    }
}
