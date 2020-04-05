//package com.luffy.cloud.ali.payment.elasticjobs.configs;
//
//import com.dangdang.ddframe.job.api.simple.SimpleJob;
//import com.dangdang.ddframe.job.event.JobEventConfiguration;
//import com.dangdang.ddframe.job.lite.api.JobScheduler;
//import com.dangdang.ddframe.job.lite.config.LiteJobConfiguration;
//import com.dangdang.ddframe.job.lite.spring.api.SpringJobScheduler;
//import com.dangdang.ddframe.job.reg.zookeeper.ZookeeperRegistryCenter;
//import com.luffy.cloud.ali.payment.elasticjobs.jobs.InsertPaymentJob;
//import lombok.RequiredArgsConstructor;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//
///**
// * @author zqy
// * @date 2020-04-02 15:45
// */
//@Configuration
//@RequiredArgsConstructor
//public class ElasticJobSchedulerConfig {
//
//    final InsertPaymentJob insertPaymentJob;
//    final LiteJobConfiguration insertPaymentJobConfig;
//
//    final ZookeeperRegistryCenter zookeeperRegistryCenter;
//
//    final JobEventConfiguration jobEventConfig;
//
//    @Bean(initMethod = "init")
//    public JobScheduler insertPaymentJobScheduler() {
//        return getJobScheduler(insertPaymentJob, insertPaymentJobConfig);
//    }
//
//    private JobScheduler getJobScheduler(SimpleJob job, LiteJobConfiguration jobConfig) {
//        return new SpringJobScheduler(job
//                , zookeeperRegistryCenter
//                , jobConfig
//                , jobEventConfig
//                , new CommonElasticJobListener());
//    }
//}
