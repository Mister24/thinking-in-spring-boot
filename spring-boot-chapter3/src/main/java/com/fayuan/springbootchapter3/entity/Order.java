/**
 * @Company Mister24.com Inc.
 * @Copyright Copyright (c) 2016-2019 All Rights Reserved.
 */
package com.fayuan.springbootchapter3.entity;

import java.io.Serializable;

/**
 * 订单类
 *
 * @author mr.24
 * @version Id: Order, v 1.0 2019-04-11 16:02 Exp $$
 */
public class Order implements Serializable {

    /** serialVersionUID */
    private static final long serialVersionUID = 1343561782705124279L;

    /** 订单id */
    Long id;

    /** 订单名称 */
    String name;

    public Order() {
    }

    public Order(Long id, String name) {
        this.id = id;
        this.name = name;
    }

    /**
     * Getter method for property <tt>serialVersionUID</tt>.
     *
     * @return property value of serialVersionUID
     */
    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    /**
     * Getter method for property <tt>id</tt>.
     *
     * @return property value of id
     */
    public Long getId() {
        return id;
    }

    /**
     * Setter method for property <tt>id</tt>.
     *
     * @param id value to be assigned to property id
     */
    public void setId(Long id) {
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

    @Override
    public String toString() {
        return "Order{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
