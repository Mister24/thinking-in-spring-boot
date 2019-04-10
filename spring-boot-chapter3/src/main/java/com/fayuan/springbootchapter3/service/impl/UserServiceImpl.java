/**
 * @Company Mister24.com Inc.
 * @Copyright Copyright (c) 2016-2019 All Rights Reserved.
 */
package com.fayuan.springbootchapter3.service.impl;

import com.fayuan.springbootchapter3.entity.User;
import com.fayuan.springbootchapter3.service.UserService;
import lombok.Data;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * 用户实现类
 *
 * @author mr.24
 * @version Id: UserServiceImpl, v 1.0 2019-04-10 10:27 Exp $$
 */
@Service
public class UserServiceImpl implements UserService {
    @Override
    public List<User> getAllUser() {
        return sampleUser(5);
    }

    @Override
    public User getUserById(Long id) {
        User user = sampleUser(1).get(0);
        user.setId(id);
        return user;
    }

    @Override
    public void updateUser(Long id, Integer type) {
        // TODO
    }

    /**
     * 产生实例
     *
     * @param num 用户数量
     *
     * @return    用户
     * */
    private List<User> sampleUser(int num) {
        List<User> list = new ArrayList<>(num);
        for(int i = 0; i < num; i++) {
            User user = new User();
            user.setId((long)i);
            user.setName("name" + i);
            list.add(user);
        }
        return list;
    }
}
