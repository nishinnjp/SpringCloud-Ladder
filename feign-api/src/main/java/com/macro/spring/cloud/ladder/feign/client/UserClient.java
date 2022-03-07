package com.macro.spring.cloud.ladder.feign.client;

import com.macro.spring.cloud.ladder.feign.pojo.User;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * <p>Title: UserClient</p>
 * <p>Description: </p>
 *
 * @author ：macroshen
 * @version ：1.0.0
 * @date ：Created in 2022-02-25 3:49 p.m.
 */
@FeignClient("userservice")
public interface UserClient {

    @GetMapping("user/{id}")
    User findById(@PathVariable("id") Long id);
}
