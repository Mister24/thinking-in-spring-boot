/**
 * @Company Mister24.com Inc.
 * @Copyright Copyright (c) 2016-2019 All Rights Reserved.
 */
package com.fayuan.springbootchapter5.dao;
import java.sql.ResultSet;
import java.util.Date;

import com.fayuan.springbootchapter5.entity.User;
import com.mysql.cj.protocol.Resultset;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Repository;

import java.sql.SQLException;


/**
 * @author mr.24
 * @version Id: UserDao, v 1.0 2019-04-13 11:43 Exp $$
 */
@Repository
public class UserDao {
    @Autowired
    JdbcTemplate jdbcTemplate;
    @Autowired
    NamedParameterJdbcTemplate namedParameterJdbcTemplate;

    /**
     * 查询部门员工总数
     *
     * @param departmentId 部门id
     *
     * @return             员工总数
     * */
    public Integer totalUserInDepartment(Long departmentId) {
        String sql = "select count(1) from user where department_id=?";
        Integer count = jdbcTemplate.queryForObject(sql, Integer.class, departmentId);
        return count;
    }

    /**
     * 获取用户对象
     *
     * @param userId 用户id
     * @return       用户对象
     */
    public User getUser(Long userId) {
        String sql = "select * from user where user_id=?";
        User user = jdbcTemplate.queryForObject(sql, new RowMapper<User>() {
            @Override
            public User mapRow(ResultSet resultset, int rowNum) throws SQLException {
                User user1 = new User();
                user1.setId(resultset.getInt("id"));
                user1.setDepartmentId(resultset.getInt("department_id"));
                user1.setName(resultset.getString("name"));

                return user1;
            }
        }, userId);

        return user;
    }



}
