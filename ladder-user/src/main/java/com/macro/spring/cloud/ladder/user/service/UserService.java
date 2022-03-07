package com.macro.spring.cloud.ladder.user.service;

import com.macro.spring.cloud.ladder.user.domain.User;

/**
 * <p>Title: UserService</p>
 * <p>Description: </p>
 *
 * @author ：macroshen
 * @version ：1.0.0
 * @date ：Created in 2022-02-23 9:54 p.m.
 */
public interface UserService {
    public User queryById(Long id);
}
