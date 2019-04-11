/**
 * @Company Mister24.com Inc.
 * @Copyright Copyright (c) 2016-2019 All Rights Reserved.
 */
package com.fayuan.springbootchapter3.controller;

import org.springframework.format.datetime.DateFormatter;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Date;

/**
 * InitBinder属性
 *
 * @author mr.24
 * @version Id: DataBindingController, v 1.0 2019-04-11 22:39 Exp $$
 */
@Controller
@RequestMapping("/databind")
public class DataBindingController {

    /**
     * InitBinder生效规则
     *
     * @param binder 绑定规则
     *
     * */
    @InitBinder
    protected void initBinder(WebDataBinder binder) {
        binder.addCustomFormatter(new DateFormatter("yyyy-MM-dd"));

    }

    /**
     * 时间打印
     *
     * @param date 时间
     *
     * */
    @RequestMapping("/data")
    @ResponseBody
    public void printDate(Date date) {
        System.out.println(date);
    }
}
