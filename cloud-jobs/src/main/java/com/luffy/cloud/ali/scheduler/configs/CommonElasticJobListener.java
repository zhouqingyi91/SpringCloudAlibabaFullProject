package com.luffy.cloud.ali.scheduler.configs;

import com.dangdang.ddframe.job.executor.ShardingContexts;
import com.dangdang.ddframe.job.lite.api.listener.ElasticJobListener;
import lombok.extern.slf4j.Slf4j;

/**
 * @author tengdj
 * @date 2020-02-24 15:37:23
 **/
@Slf4j
public class CommonElasticJobListener implements ElasticJobListener {

    @Override
    public void beforeJobExecuted(ShardingContexts shardingContexts) {
//        log.info("beforeJob {}", shardingContexts);
    }

    @Override
    public void afterJobExecuted(ShardingContexts shardingContexts) {
//        log.info("afterJob {}", shardingContexts);·
    }
}
