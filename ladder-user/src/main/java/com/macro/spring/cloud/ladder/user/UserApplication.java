package com.macro.spring.cloud.ladder.user;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.cloud.openfeign.FeignClient;

/**
 * <p>Title: UserApplication</p>
 * <p>Description: </p>
 *
 * @author ：macroshen
 * @version ：1.0.0
 * @date ：Created in 2022-02-23 8:56 p.m.
 */
@MapperScan("com.macro.spring.cloud.ladder.user.mapper")
@SpringBootApplication
public class UserApplication {
    public static void main(String[] args) {
            SpringApplication.run(UserApplication.class,args);
    }
}
