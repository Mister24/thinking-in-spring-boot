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
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
/**
 * 视图controller
 *
 * @author mr.24
 * @version Id: ModelAndViewController, v 1.0 2019-04-10 10:18 Exp $$
 */
@Controller
@RequestMapping("/model")
public class ModelAndViewController {
    @Autowired
    UserService userService;

    @GetMapping(path = "/{userId}/get.html")
    public String getUser(@PathVariable Long userId, Model model) {
        User user = userService.getUserById(userId);
        model.addAttribute("user", user);
        return "/userInfo.btl";
    }

    @GetMapping(path = "/{userId}/get2.html")
    public ModelAndView getUserByGet(@PathVariable Long userId, ModelAndView modelAndView) {
        User userInfo = userService.getUserById(userId);
        modelAndView.addObject("user", userInfo);
        modelAndView.setViewName("/userInfo");

        return modelAndView;
    }

    @GetMapping(path = "/{userId}/get22.html")
    public ModelAndView getUser2(@PathVariable Long userId,ModelAndView view) {
        User userInfo =  userService.getUserById(userId);
        //model.addAttribute(userInfo);
        view.addObject("user", userInfo);
        view.setViewName("/userInfo.ftl");
        return view;
    }
}
