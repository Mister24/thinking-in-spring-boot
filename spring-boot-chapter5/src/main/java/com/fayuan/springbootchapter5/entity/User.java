/**
 * @Company Mister24.com Inc.
 * @Copyright Copyright (c) 2016-2019 All Rights Reserved.
 */
package com.fayuan.springbootchapter5.entity;

import java.io.Serializable;
import java.util.Date;

/**
 * 用户
 *
 * @author mr.24
 * @version Id: User, v 1.0 2019-04-13 11:41 Exp $$
 */
public class User implements Serializable {

    /** serialVersionUID */
    private static final long serialVersionUID = 3471961399691260696L;

    /** 用户id */
    private Integer  id;

    /** 部门 */
    private Integer  departmentId ;

    /** 名称 */
    private String   name ;

    /** 创建时间 */
    private Date     createTime ;

    public User() {
    }

    public User(Integer id, Integer departmentId, String name, Date createTime) {
        this.id = id;
        this.departmentId = departmentId;
        this.name = name;
        this.createTime = createTime;
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
     * Getter method for property <tt>departmentId</tt>.
     *
     * @return property value of departmentId
     */
    public Integer getDepartmentId() {
        return departmentId;
    }

    /**
     * Setter method for property <tt>departmentId</tt>.
     *
     * @param departmentId value to be assigned to property departmentId
     */
    public void setDepartmentId(Integer departmentId) {
        this.departmentId = departmentId;
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
     * Getter method for property <tt>createTime</tt>.
     *
     * @return property value of createTime
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * Setter method for property <tt>createTime</tt>.
     *
     * @param createTime value to be assigned to property createTime
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", departmentId=" + departmentId +
                ", name='" + name + '\'' +
                ", createTime=" + createTime +
                '}';
    }
}
