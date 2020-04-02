package com.luffy.cloud.ali.scheduler.configs;

import com.dangdang.ddframe.job.api.simple.SimpleJob;
import com.dangdang.ddframe.job.config.JobCoreConfiguration;
import com.dangdang.ddframe.job.config.simple.SimpleJobConfiguration;
import com.dangdang.ddframe.job.lite.config.LiteJobConfiguration;
import com.luffy.cloud.ali.scheduler.configs.properties.JobInstanceProperty;
import com.luffy.cloud.ali.scheduler.configs.properties.JobProperties;
import com.luffy.cloud.ali.scheduler.jobs.SomeJob;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.util.CollectionUtils;

import java.util.List;
import java.util.stream.Collectors;

/**
 * @author zqy
 * @date 2020-04-02 15:45
 */
@Slf4j
@Configuration
@RequiredArgsConstructor
public class ElasticLiteJobConfig {

    final JobProperties jobProperties;

    final SomeJob someJob;

    @Bean
    public LiteJobConfiguration someJobConfig() throws IllegalArgumentException {
        return getLiteJobConfiguration("some-job", someJob);
    }

    private LiteJobConfiguration getLiteJobConfiguration(String jobName, SimpleJob job) {
        List<JobInstanceProperty> props = jobProperties.getInstances().stream().filter(p -> p.getName().equals(jobName)).collect(Collectors.toList());
        if (CollectionUtils.isEmpty(props)) {
            throw new IllegalArgumentException("缺少" + jobName + "相关配置");
        }
        JobInstanceProperty prop = props.get(0);

        JobCoreConfiguration.Builder builder =
                JobCoreConfiguration.newBuilder(
                        job.getClass().getName(),
                        prop.getCron(),
                        prop.getShardingTotalCount());

        JobCoreConfiguration jobCoreConfiguration = builder
                .shardingItemParameters(prop.getShardingItemParameters())
                .description(prop.getJobDescription())
                .jobParameter(prop.getJobParameter())
                .build();

        SimpleJobConfiguration simpleJobConfiguration =
                new SimpleJobConfiguration(
                        jobCoreConfiguration,
                        job.getClass().getCanonicalName());

        return LiteJobConfiguration
                .newBuilder(simpleJobConfiguration)
                .overwrite(true)
                .build();
    }
}
