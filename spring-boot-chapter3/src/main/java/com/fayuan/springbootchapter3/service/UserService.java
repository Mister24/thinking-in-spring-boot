/**
 * @Company Mister24.com Inc.
 * @Copyright Copyright (c) 2016-2019 All Rights Reserved.
 */
package com.fayuan.springbootchapter3.service;

import com.fayuan.springbootchapter3.entity.User;

import java.util.List;

/**
 * 用户服务
 *
 * @author mr.24
 * @version Id: UserService, v 1.0 2019-04-10 10:23 Exp $$
 */
public interface UserService {

    /**
     * 获取所有用户
     *
     * @return 用户集合
     * */
    public List<User> getAllUser();

    /**
     * 通过id查找用户
     *
     * @param id 用户id
     *
     * @return   用户
     * */
    public User getUserById(Long id);

    /**
     * 更新用户信息
     *
     * @param id    用户id
     * @param type  用户类型
     *
     * */
    public void updateUser(Long id, Integer type);
}
