package com.macro.spring.cloud.ladder.feign.pojo;

import lombok.Data;

import java.time.LocalDateTime;

/**
 * <p>Title: User</p>
 * <p>Description: </p>
 *
 * @author ：macroshen
 * @version ：1.0.0
 * @date ：Created in 2022-02-23 9:02 p.m.
 */
@Data
public class User {
    private Long id;
    private String userName;
    private String address;
    private LocalDateTime createTime;
    private LocalDateTime updateTime;
}
