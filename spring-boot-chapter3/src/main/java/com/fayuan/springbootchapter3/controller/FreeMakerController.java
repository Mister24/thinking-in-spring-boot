/**
 * @Company Mister24.com Inc.
 * @Copyright Copyright (c) 2016-2019 All Rights Reserved.
 */
package com.fayuan.springbootchapter3.controller;

import com.fayuan.springbootchapter3.entity.User;
import com.fayuan.springbootchapter3.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
/**
 * 使用freemaker视图模板
 *
 * @author mr.24
 * @version Id: FreeMakerController, v 1.0 2019-04-12 15:52 Exp $$
 */
@Controller
@RequestMapping("/freemaker")
public class FreeMakerController {
    @Autowired
    UserService userService;

    /**
     * 展示用户信息
     * http://127.0.0.1:8080/freemaker/showuser.html?id=1
     *
     * @param id 用户id
     *
     * @return   视图
     * */
    public ModelAndView showUserInfo(Long id) {
        ModelAndView modelAndView = new ModelAndView();
        User user = userService.getUserById(id);
        modelAndView.addObject("user", user);
        modelAndView.setViewName("/userInfo");

        return modelAndView;
    }
}
