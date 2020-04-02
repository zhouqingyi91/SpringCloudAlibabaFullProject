package com.luffy.cloud.ali.scheduler.configs.properties;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;

import java.util.ArrayList;
import java.util.List;

/**
 * @author: zqy
 * @date: 2020-03-31 14:19
 **/
@Data
@ConfigurationProperties(prefix = "jobs")
public class JobProperties {

    RegCenter regCenter;

    public List<JobInstanceProperty> instances = new ArrayList<JobInstanceProperty>();

    public void setInstances(List<JobInstanceProperty> instances) {
        this.instances = instances;
    }

}
