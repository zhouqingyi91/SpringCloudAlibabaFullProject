package com.luffy.cloud.ali.payment.elasticjobs.jobs;

import com.dangdang.ddframe.job.api.ShardingContext;
import com.dangdang.ddframe.job.api.simple.SimpleJob;
import com.luffy.cloud.ali.payment.entity.Payment;
import com.luffy.cloud.ali.payment.service.IPaymentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.util.Date;

/**
 * @author: zqy
 * @date: 2020-03-29 15:45
 **/
@Component
@Slf4j
public class InsertPaymentJob implements SimpleJob {

    @Resource
    private IPaymentService iPaymentService;

    private int jobNumber = 0;

    @Override
    public void execute(ShardingContext shardingContext) {
        System.out.println("=============insert payment start=============");
        iPaymentService.save(new Payment().setSerial("" + jobNumber++).setJobDate(new Date()));
        System.out.println("=============insert payment end=============");
    }
}
