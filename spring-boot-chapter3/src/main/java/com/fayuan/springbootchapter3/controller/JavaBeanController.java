/**
 * @Company Mister24.com Inc.
 * @Copyright Copyright (c) 2016-2019 All Rights Reserved.
 */
package com.fayuan.springbootchapter3.controller;

import com.fayuan.springbootchapter3.entity.User;
import com.fayuan.springbootchapter3.entity.form.OrderPostForm;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
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

    /**
     * 使用入参数据拼接
     * 访问地址：http://127.0.0.1:8080/javabean/update.json?name=123&id=1
     *
     * @param id   用户id
     * @param name 用户名称
     *
     * @return     结果
     * */
    @GetMapping(path = "/update2.json")
    @ResponseBody
    public String getUser2(Long id, String name) {
        return "success";
    }

    /**
     * 使用pojo作为入参
     * 访问地址：http://127.0.0.1:8080/javabean/update.json
     *
     * @param user 用户对象实例
     *
     * @return     结果
     * */
    @GetMapping(path = "/update.json")
    @ResponseBody
    public String update(User user) {
        return "success";
    }

    /**
     * 使用pojo作为入参
     * 使用post请求，访问地址：http://127.0.0.1:8080/javabean/saveOrder.json
     *
     * @param form post表单对象
     *
     * @return     结果
     * */
    @PostMapping(path = "/saveOrder.json")
    @ResponseBody
    public String saveOrder(OrderPostForm form) {
        return "success";
    }
}
