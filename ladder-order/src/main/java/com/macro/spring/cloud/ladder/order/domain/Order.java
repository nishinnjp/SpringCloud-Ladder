package com.macro.spring.cloud.ladder.order.domain;

import lombok.Data;
import org.springframework.stereotype.Repository;

import com.macro.spring.cloud.ladder.feign.pojo.User;
import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * <p>Title: Order</p>
 * <p>Description: </p>
 *
 * @author ：macroshen
 * @version ：1.0.0
 * @date ：Created in 2022-02-23 5:16 p.m.
 */
@Data
@Repository
public class Order implements Serializable {
    private Long id;
    private Long userId;
    private Long price;
    private String name;
    private Integer num;
    private LocalDateTime createTime;
    private LocalDateTime updateTime;
    private User user;
}
