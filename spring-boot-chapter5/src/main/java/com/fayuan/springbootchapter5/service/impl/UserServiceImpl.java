/**
 * @Company Mister24.com Inc.
 * @Copyright Copyright (c) 2016-2019 All Rights Reserved.
 */
package com.fayuan.springbootchapter5.service.impl;

import com.fayuan.springbootchapter5.dao.UserDao;
import com.fayuan.springbootchapter5.entity.User;
import com.fayuan.springbootchapter5.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * 用户服务
 *
 * @author mr.24
 * @version Id: UserServiceImpl, v 1.0 2019-04-13 15:55 Exp $$
 */

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserDao userDao;

    @Override
    public User getUserById(Long id) {
        User user = userDao.getUserById(id);

        return user;
    }
}
