/**
 * @Company Mister24.com Inc.
 * @Copyright Copyright (c) 2016-2019 All Rights Reserved.
 */
package com.fayuan.springbootchapter6.entity;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

/**
 * 部门类
 *
 * @author mr.24
 * @version Id: Department, v 1.0 2019-04-18 09:42 Exp $$
 */
public class Department {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String id;

    @Column
    private String name;

    @OneToMany(mappedBy = "department")
    private Set<User> users = new HashSet<>();

    /**
     * Getter method for property <tt>id</tt>.
     *
     * @return property value of id
     */
    public String getId() {
        return id;
    }

    /**
     * Setter method for property <tt>id</tt>.
     *
     * @param id value to be assigned to property id
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * Getter method for property <tt>name</tt>.
     *
     * @return property value of name
     */
    public String getName() {
        return name;
    }

    /**
     * Setter method for property <tt>name</tt>.
     *
     * @param name value to be assigned to property name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Getter method for property <tt>users</tt>.
     *
     * @return property value of users
     */
    public Set<User> getUsers() {
        return users;
    }

    /**
     * Setter method for property <tt>users</tt>.
     *
     * @param users value to be assigned to property users
     */
    public void setUsers(Set<User> users) {
        this.users = users;
    }
}
