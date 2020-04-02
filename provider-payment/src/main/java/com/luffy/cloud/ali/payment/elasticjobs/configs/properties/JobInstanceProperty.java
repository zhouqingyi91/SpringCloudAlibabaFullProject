package com.luffy.cloud.ali.payment.elasticjobs.configs.properties;

import lombok.Data;

/**
 * @author tengdj
 * @date 2020/2/24 15:30
 **/
@Data
public class JobInstanceProperty {

    public String name;

    public String cron;

    public int shardingTotalCount;

    public String shardingItemParameters;

    public String jobDescription;

    public String jobParameter;

}
