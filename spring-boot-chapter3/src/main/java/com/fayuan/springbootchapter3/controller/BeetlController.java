/**
 * @Company Mister24.com Inc.
 * @Copyright Copyright (c) 2016-2019 All Rights Reserved.
 */
package com.fayuan.springbootchapter3.controller;

import com.fayuan.springbootchapter3.entity.User;
import com.fayuan.springbootchapter3.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.View;

/**
 * @author mr.24
 * @version Id: HelloController, v 1.0 2019-04-09 22:52 Exp $$
 */
@Controller
@RequestMapping("/test")
public class BeetlController {

    @Autowired
    UserService userService;

    @RequestMapping("/index.html")
    public String say(Model model) {
        model.addAttribute("name", "hello");
        return "/index.btl";
    }

    @GetMapping("/showuser.html")
    public ModelAndView showUserInfo(Long id) {
        ModelAndView modelAndView = new ModelAndView();
        User user = userService.getUserById(id);
        modelAndView.addObject("user", user);
        modelAndView.setViewName("/userInfo.btl");

        return modelAndView;
    }
}
