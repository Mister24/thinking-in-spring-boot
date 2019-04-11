/**
 * @Company Mister24.com Inc.
 * @Copyright Copyright (c) 2016-2019 All Rights Reserved.
 */
package com.fayuan.springbootchapter3.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * javabean类型的controller
 *
 * @author mr.24
 * @version Id: JavaBeanController, v 1.0 2019-04-11 15:46 Exp $$
 */
@Controller
@RequestMapping("/javabean")
public class JavaBeanController {
    @GetMapping(path = "/update2.json")
    @ResponseBody
    public String getUser2(Long id, String name) {
        return "success";
    }
}
