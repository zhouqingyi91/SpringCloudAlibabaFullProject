package com.luffy;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

/**
 * @author: zqy
 * @date: 2020-04-13 19:09
 **/
@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
//@SpringBootApplication()
public class ShardingJdbcApplication {
    public static void main(String[] args) {
        SpringApplication.run(ShardingJdbcApplication.class, args);
    }
}
