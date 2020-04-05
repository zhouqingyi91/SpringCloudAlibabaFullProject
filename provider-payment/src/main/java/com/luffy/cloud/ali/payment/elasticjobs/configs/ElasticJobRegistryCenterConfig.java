//package com.luffy.cloud.ali.payment.elasticjobs.configs;
//
//import com.dangdang.ddframe.job.reg.zookeeper.ZookeeperConfiguration;
//import com.dangdang.ddframe.job.reg.zookeeper.ZookeeperRegistryCenter;
//import com.luffy.cloud.ali.payment.elasticjobs.configs.properties.JobProperties;
//import com.luffy.cloud.ali.payment.elasticjobs.configs.properties.RegCenter;
//import lombok.RequiredArgsConstructor;
//import org.springframework.boot.context.properties.EnableConfigurationProperties;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.util.ObjectUtils;
//
//@Configuration
//@RequiredArgsConstructor
//@EnableConfigurationProperties({JobProperties.class})
//public class ElasticJobRegistryCenterConfig {
//
//    final JobProperties jobProperties;
//
//    //zk的配置及创建注册中心
//    @Bean(initMethod = "init")
//    public ZookeeperRegistryCenter regCenter() {
//
//        RegCenter regCenter = jobProperties.getRegCenter();
//        if(regCenter == null || ObjectUtils.isEmpty(regCenter)){
//            throw new IllegalArgumentException("elastic job 注册中心未配置！");
//        }
//        return new ZookeeperRegistryCenter(new ZookeeperConfiguration(regCenter.getServerList(), regCenter.getNamespace()));
//    }
//}
