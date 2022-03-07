package com.macro.spring.cloud.user.test;

import com.macro.spring.cloud.ladder.user.UserApplication;
import com.macro.spring.cloud.ladder.user.mapper.UserMapper;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;

/**
 * <p>Title: UserTest</p>
 * <p>Description: </p>
 *
 * @author ：macroshen
 * @version ：1.0.0
 * @date ：Created in 2022-02-24 1:37 p.m.
 */
@RunWith(SpringRunner.class)
@SpringBootTest(classes = UserApplication.class)
public class UserTest {
    @Resource
    private UserMapper userMapper;

    @Test
    public void testConnection() {
        userMapper.findById(1L);
    }
}
