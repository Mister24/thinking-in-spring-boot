/**
 * @Company Mister24.com Inc.
 * @Copyright Copyright (c) 2016-2019 All Rights Reserved.
 */
package com.fayuan.springbootchapter5.service;

import com.fayuan.springbootchapter5.entity.User;

import java.util.List;

/**
 * 用户服务接口
 *
 * @author mr.24
 * @version Id: UserService, v 1.0 2019-04-13 15:56 Exp $$
 */
public interface UserService {

    /**
     * 根据id获取用户
     *
     * @param  id 用户id
     *
     * @return    用户
     */
    public User getUserById(Long id);
}
