package com.luffy.cloud.ali.scheduler.configs;

import com.dangdang.ddframe.job.lite.api.JobScheduler;
import com.dangdang.ddframe.job.lite.config.LiteJobConfiguration;
import com.dangdang.ddframe.job.lite.spring.api.SpringJobScheduler;
import com.dangdang.ddframe.job.reg.zookeeper.ZookeeperRegistryCenter;
import com.luffy.cloud.ali.scheduler.jobs.SomeJob;
import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author zqy
 * @date 2020-04-02 15:45
 */
@Configuration
@RequiredArgsConstructor
public class ElasticJobSchedulerConfig {

    final SomeJob someJob;

    final LiteJobConfiguration someJobConfig;

    final ZookeeperRegistryCenter zookeeperRegistryCenter;

//    final JobEventConfiguration jobEventConfig;


    @Bean(initMethod = "init")
    public JobScheduler saleDailyScheduler(){
        return new SpringJobScheduler(someJob
                , zookeeperRegistryCenter
                , someJobConfig
        );
//                , jobEventConfig
//                , new CommonElasticJobListener());
    }
}
