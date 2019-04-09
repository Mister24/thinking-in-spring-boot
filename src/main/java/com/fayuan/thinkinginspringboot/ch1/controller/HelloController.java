/**
 * @Company Mister24.com Inc.
 * @Copyright Copyright (c) 2016-2019 All Rights Reserved.
 */
package com.fayuan.thinkinginspringboot.ch1.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author mr.24
 * @version Id: HelloController, v 1.0 2019-04-09 22:29 Exp $$
 */
@Controller
public class HelloController {
    @RequestMapping("/say.htm")
    public @ResponseBody String say() {
        return "hello";
    }
}
