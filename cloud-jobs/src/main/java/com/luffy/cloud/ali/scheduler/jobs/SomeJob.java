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
        /**
         * 可以根据不同的shardingParameter做不同的业务处理
         * ex, 不同格式的文件有不同的处理方式, video, img, xml
         */
        System.out.println(Calendar.getInstance().getTime() + ": shardingParameter: " + shardingContext.getShardingParameter());
        System.out.println(Calendar.getInstance().getTime() + ": shardingItem: " + shardingContext.getShardingItem());
    }
}
