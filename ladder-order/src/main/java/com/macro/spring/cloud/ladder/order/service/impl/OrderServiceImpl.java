package com.macro.spring.cloud.ladder.order.service.impl;

import com.macro.spring.cloud.ladder.order.domain.Order;
import com.macro.spring.cloud.ladder.order.mapper.OrderMapper;
import com.macro.spring.cloud.ladder.order.service.OrderService;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.macro.spring.cloud.ladder.feign.client.UserClient;
import com.macro.spring.cloud.ladder.feign.pojo.User;
/**
 * <p>Title: OrderService</p>
 * <p>Description: </p>
 *
 * @author ：macroshen
 * @version ：1.0.0
 * @date ：Created in 2022-02-23 5:18 p.m.
 */
@Service
public class OrderServiceImpl implements OrderService {
    @Autowired
    private OrderMapper orderMapper;

    @Autowired
    UserClient userClient;

    public Order myCallBack(Long orderId) {
        return null;
    }

    @HystrixCommand(fallbackMethod = "myCallBack")
    @Override
    public Order queryOrderById(Long orderId) {
        // 1.order query
        Order order = orderMapper.queryOrderById(orderId);

        // 2.using feign to do RPC
        User user = userClient.findById(order.getUserId());

        // 3.set user object to Order
        order.setUser(user);

        // 4.return
        return order;
    }
/*
    @Autowired
    private RestTemplate restTemplate;

    @Override
    public Order queryOrderById(Long orderId) {
        // 1.order query
        Order order = orderMapper.queryOrderById(orderId);

        // 2.using RestTemplate to send http request(user query)
        // 2.1.url
        //String url = "http://localhost:8082/user/" + order.getUserId();
        String url = "http://userService/user/" + order.getUserId();
        // 2.2.http request，PRC call
        User user = restTemplate.getForObject(url, User.class);

        // 3.set user object to Order
        order.setUser(user);

        // 4.return
        return order;
    }
*/
}
