package com.macro.spring.cloud.order.test;

import com.macro.spring.cloud.ladder.order.OrderApplication;
import com.macro.spring.cloud.ladder.order.mapper.OrderMapper;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;

/**
 * <p>Title: OrderTest</p>
 * <p>Description: </p>
 *
 * @author ：macroshen
 * @version ：1.0.0
 * @date ：Created in 2022-02-24 1:26 p.m.
 */
@RunWith(SpringRunner.class)
@SpringBootTest(classes = OrderApplication.class)
public class OrderTest {
    @Resource
    private OrderMapper orderMapper;

    @Test
    public void testConnection() {
        orderMapper.queryOrderById(101L);
    }
}
