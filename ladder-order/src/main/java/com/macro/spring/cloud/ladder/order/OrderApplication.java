package com.macro.spring.cloud.ladder.order;

import com.macro.spring.cloud.ladder.feign.client.UserClient;
import com.macro.spring.cloud.ladder.feign.config.DefaultFeignConfiguration;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

/**
 * <p>Title: OrderApplication</p>
 * <p>Description: </p>
 *
 * @author ：macroshen
 * @version ：1.0.0
 * @date ：Created in 2022-02-23 5:05 p.m.
 */
@MapperScan("com.macro.spring.cloud.ladder.order.mapper")
@SpringBootApplication
@EnableFeignClients(clients = UserClient.class)
@EnableCircuitBreaker
//@EnableFeignClients(clients = UserClient.class,defaultConfiguration = DefaultFeignConfiguration.class)
public class OrderApplication {
    public static void main(String[] args) {
        SpringApplication.run(OrderApplication.class,args);
    }

/*    @Bean
    @LoadBalanced
    RestTemplate restTemplate() {
        return new RestTemplate();
    }*/

/*    @Bean
    public IRule randomRule() {
        return new RandomRule();
    }*/
}
