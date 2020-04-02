package com.luffy.cloud.ali.scheduler.configs;

import com.dangdang.ddframe.job.event.JobEventConfiguration;
import com.dangdang.ddframe.job.event.rdb.JobEventRdbConfiguration;
import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Bean;

import javax.sql.DataSource;

/**
 * @author tengdj
 * @date 2020-02-24 14:43:03
 **/
//@Configuration
@RequiredArgsConstructor
public class JobEventConfig {

    final DataSource dataSource;

    @Bean
    public JobEventConfiguration eventConfiguration(){
        return new JobEventRdbConfiguration(dataSource);
    }

}
