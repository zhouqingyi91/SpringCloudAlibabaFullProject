package com.luffy.cloud.ali.scheduler.jobs;

import com.dangdang.ddframe.job.api.ShardingContext;
import com.dangdang.ddframe.job.api.simple.SimpleJob;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

import java.util.Calendar;

/**
 * @author: zqy
 * @date: 2020-03-29 15:45
 **/
@Component
@Slf4j
public class SomeJob implements SimpleJob {
    @Override
    public void execute(ShardingContext shardingContext) {
//        log.info("--------some job start --------");
//        log.info("----------doing job----------");
//        log.info("--------some job end --------");
        System.out.println(Calendar.getInstance().getTime() + ": shardingParameter: " + shardingContext.getShardingParameter());
        System.out.println(Calendar.getInstance().getTime() + ": shardingItem: " + shardingContext.getShardingItem());
    }
}
