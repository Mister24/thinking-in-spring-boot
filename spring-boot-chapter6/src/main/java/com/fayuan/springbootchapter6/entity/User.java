/**
 * @Company Mister24.com Inc.
 * @Copyright Copyright (c) 2016-2019 All Rights Reserved.
 */
package com.fayuan.springbootchapter6.entity;

import javax.persistence.*;
import java.util.Date;

/**
 * 用户类
 *
 * @author mr.24
 * @version Id: User, v 1.0 2019-04-17 22:42 Exp $$
 */
@Entity
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column
    private String name;

    @Column(name = "create_time")
    private Date date;

    @ManyToOne
    @JoinColumn(name = "department_id")
    Department department;

    public User() {
        // JPA要求实体必须有一个空的构造函数
    }

    /**
     * Getter method for property <tt>id</tt>.
     *
     * @return property value of id
     */
    public Integer getId() {
        return id;
    }

    /**
     * Setter method for property <tt>id</tt>.
     *
     * @param id value to be assigned to property id
     */
    public void setId(Integer id) {
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
     * Getter method for property <tt>date</tt>.
     *
     * @return property value of date
     */
    public Date getDate() {
        return date;
    }

    /**
     * Setter method for property <tt>date</tt>.
     *
     * @param date value to be assigned to property date
     */
    public void setDate(Date date) {
        this.date = date;
    }
}
