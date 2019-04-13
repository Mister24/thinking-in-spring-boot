/**
 * @Company Mister24.com Inc.
 * @Copyright Copyright (c) 2016-2019 All Rights Reserved.
 */
package com.fayuan.springbootchapter3.controller;

import com.fayuan.springbootchapter3.entity.User;
import com.fayuan.springbootchapter3.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * 使用jackson
 *
 * @author mr.24
 * @version Id: JacksonController, v 1.0 2019-04-12 16:13 Exp $$
 */
@Controller
@RequestMapping("/jackson")
public class JacksonController {

    @Autowired
    UserService userService;

    /**
     * 获取此时时间
     *
     * @return 结果map
     * */
    @GetMapping("/now.json")
    public @ResponseBody
    Map now() {
        Map map = new HashMap();
        map.put("date", new Date());

        return map;
    }
}
