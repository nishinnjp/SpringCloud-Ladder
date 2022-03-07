package com.macro.spring.cloud.ladder.feign.config;

import feign.Logger;

/**
 * <p>Title: DefaultFeignConfiguration</p>
 * <p>Description: </p>
 *
 * @author ：macroshen
 * @version ：1.0.0
 * @date ：Created in 2022-02-25 5:06 p.m.
 */

public class DefaultFeignConfiguration {
    public Logger.Level logLevel() {
        return Logger.Level.BASIC;
    }
}
