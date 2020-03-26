package com.luffy.cloud.ali.order.rpc.config;

import feign.Logger;
import feign.Request;
import feign.Retryer;
import org.springframework.context.annotation.Bean;

/**
 * @author wangjianqiao
 */
public class CommonClientConfig {


    @Bean
    public Request.Options feignRequestOptions(){
        int connectTimeoutMillis = 120 * 1000;
        int readTimeoutMillis = 120 * 1000;
        return new Request.Options(connectTimeoutMillis, readTimeoutMillis);
    }

    @Bean
    public Retryer feignRetry(){
        return Retryer.NEVER_RETRY;
    }

    @Bean
    public Logger.Level feignLoggerLevel(){
        return Logger.Level.FULL;
    }
}
