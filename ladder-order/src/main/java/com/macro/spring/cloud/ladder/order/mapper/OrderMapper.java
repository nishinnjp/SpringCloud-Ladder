package com.macro.spring.cloud.ladder.order.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.macro.spring.cloud.ladder.order.domain.Order;
import org.springframework.stereotype.Repository;

/**
 * <p>Title: OrderMapper</p>
 * <p>Description: </p>
 *
 * @author ：macroshen
 * @version ：1.0.0
 * @date ：Created in 2022-02-23 5:17 p.m.
 */
@Repository
public interface OrderMapper extends BaseMapper<Order> {
    Order queryOrderById(Long id);
}
