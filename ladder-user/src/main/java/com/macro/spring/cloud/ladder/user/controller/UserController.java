package com.macro.spring.cloud.ladder.user.controller;

import com.macro.spring.cloud.ladder.user.domain.User;
import com.macro.spring.cloud.ladder.user.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * <p>Title: UserController</p>
 * <p>Description: </p>
 *
 * @author ：macroshen
 * @version ：1.0.0
 * @date ：Created in 2022-02-23 8:58 p.m.
 */
@Slf4j
@RestController
@RequestMapping("user")
@RefreshScope
public class UserController {
    @Autowired
    private UserService userService;

//    // @Value("${pattern.dateformat}")
//    // private String dateformat;
//
//    @Autowired
//    private PatternProperties properties;
//
//    @GetMapping("prop")
//    public PatternProperties properties(){
//        return properties;
//    }
//
//    @GetMapping("now")
//    public String now(){
//        return LocalDateTime.now().format(DateTimeFormatter.ofPattern(properties.getDateformat()));
//    }

    /**
     * 路径： /user/110
     *
     * @param id 用户id
     * @return 用户
     */
    @GetMapping("/{id}")
    public User queryById(@PathVariable("id") Long id,
                          @RequestHeader(value = "Truth", required = false) String truth) {
        System.out.println("truth: " + truth);
        //System.out.println("id: " + id);
        return userService.queryById(id);
    }

    @Value("${my.args.int}")
    private int i;

    @Value("${my.args.str}")
    private String str;

    @RequestMapping("/test")
    public String test() {
        return "test config client, i= "+i+"; str = "+str+"";
    }
}
