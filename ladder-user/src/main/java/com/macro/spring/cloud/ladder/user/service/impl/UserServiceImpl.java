package com.macro.spring.cloud.ladder.user.service.impl;

import com.macro.spring.cloud.ladder.user.domain.User;
import com.macro.spring.cloud.ladder.user.mapper.UserMapper;
import com.macro.spring.cloud.ladder.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * <p>Title: UserService</p>
 * <p>Description: </p>
 *
 * @author ：macroshen
 * @version ：1.0.0
 * @date ：Created in 2022-02-23 9:02 p.m.
 */
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper userMapper;

    public User queryById(Long id) {
        return userMapper.findById(id);
    }
}
