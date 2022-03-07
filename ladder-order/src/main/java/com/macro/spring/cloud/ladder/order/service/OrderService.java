package com.macro.spring.cloud.ladder.order.service;

import com.macro.spring.cloud.ladder.order.domain.Order;

/**
 * <p>Title: OrderService</p>
 * <p>Description: </p>
 *
 * @author ：macroshen
 * @version ：1.0.0
 * @date ：Created in 2022-02-23 9:31 p.m.
 */
public interface OrderService {
    public Order queryOrderById(Long orderId);
}
