/**
 * @Company Mister24.com Inc.
 * @Copyright Copyright (c) 2016-2019 All Rights Reserved.
 */
package com.fayuan.thinkinginspringboot.ch1.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * controller
 *
 * @author mr.24
 * @version Id: HelloController, v 1.0 2019-04-09 22:29 Exp $$
 */
@RestController
public class HelloController {
    @RequestMapping(value = "/user/{id}")
    public @ResponseBody String say(@PathVariable String id) {
        return "hello" + id;
    }
}
