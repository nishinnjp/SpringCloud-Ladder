package com.macro.spring.cloud.ladder.user.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.macro.spring.cloud.ladder.user.domain.User;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

/**
 * <p>Title: UserMapper</p>
 * <p>Description: </p>
 *
 * @author ：macroshen
 * @version ：1.0.0
 * @date ：Created in 2022-02-23 9:02 p.m.
 */
@Repository
public interface UserMapper extends BaseMapper<User> {
    User findById(@Param("id") Long id);
}

