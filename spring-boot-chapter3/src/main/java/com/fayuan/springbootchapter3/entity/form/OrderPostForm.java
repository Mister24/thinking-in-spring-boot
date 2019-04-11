/**
 * @Company Mister24.com Inc.
 * @Copyright Copyright (c) 2016-2019 All Rights Reserved.
 */
package com.fayuan.springbootchapter3.entity.form;

import com.fayuan.springbootchapter3.entity.Order;
import com.fayuan.springbootchapter3.entity.OrderDetail;

import java.io.Serializable;
import java.util.List;

/**
 * 订单post表单
 *
 * @author mr.24
 * @version Id: OrderPostForm, v 1.0 2019-04-11 16:02 Exp $$
 */
public class OrderPostForm implements Serializable {

    /** serialVersionUID */
    private static final long serialVersionUID = -8669023040197596980L;

    /** 订单 */
    public Order              order;

    /** 订单详情 */
    public List<OrderDetail>  details;
}
