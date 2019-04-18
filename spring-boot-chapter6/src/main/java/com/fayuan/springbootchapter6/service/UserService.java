/**
 * @Company Mister24.com Inc.
 * @Copyright Copyright (c) 2016-2019 All Rights Reserved.
 */
package com.fayuan.springbootchapter6.service;

import com.fayuan.springbootchapter6.entity.User;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

/**
 * 用户服务接口
 *
 * @author mr.24
 * @version Id: UserService, v 1.0 2019-04-18 16:58 Exp $$
 */
public interface UserService {
    public User findUser(int id);
    public Integer addUser(User user);
    public List<User> getAllUser(int start, int end);
    public User getUser(String name);
    public User getUser(String name,Integer departmentId);
    public Page<User> queryUser(Integer departmentId, Pageable page);
    public Page<User> queryUser2(Integer departmentId,Pageable page);
    public List<User> getByExample(String name) ;
    public void updateUser();
}
