package com.luffy.cloud.ali.payment.elasticjobs.configs;

import com.dangdang.ddframe.job.event.JobEventConfiguration;
import com.dangdang.ddframe.job.event.rdb.JobEventRdbConfiguration;
import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;

/**
 * @author zqy
 * @date 2020-02-24 14:43:03
 * 把任务执行操作添加到数据库里
 **/
@Configuration
@RequiredArgsConstructor
public class JobEventConfig {

    final DataSource dataSource;

    @Bean
    public JobEventConfiguration eventConfiguration(){
        return new JobEventRdbConfiguration(dataSource);
    }

}
