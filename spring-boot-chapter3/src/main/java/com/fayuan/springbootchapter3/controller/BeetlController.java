/**
 * @Company Mister24.com Inc.
 * @Copyright Copyright (c) 2016-2019 All Rights Reserved.
 */
package com.fayuan.springbootchapter3.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author mr.24
 * @version Id: HelloController, v 1.0 2019-04-09 22:52 Exp $$
 */
@Controller
@RequestMapping("/test")
public class BeetlController {
    @RequestMapping("/index.html")
    public String say(Model model) {
        model.addAttribute("name", "hello");
        return "/index.btl";
    }
}
