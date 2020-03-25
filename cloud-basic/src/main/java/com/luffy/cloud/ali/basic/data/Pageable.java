package com.luffy.cloud.ali.basic.data;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.validation.constraints.Min;
import java.io.Serializable;

/**
 * @author wangjianqiao
 */
@Data
@EqualsAndHashCode(callSuper = false)
public class Pageable implements Serializable {

    private static final long serialVersionUID = 6640275780055984094L;

    public Pageable() {
    }

    public Pageable(int pageNumber, int pageSize) {
        this.pageNumber = pageNumber;
        this.pageSize = pageSize;
    }

    @ApiModelProperty(value = "页码")
    @JsonProperty("page_number")
    @Min(value = 1,message = "页码必须大于1")
    private int pageNumber = 1;

    @ApiModelProperty(value = "每页数据长度")
    @JsonProperty("page_size")
    @Min(value = 1,message = "每页至少1条数据")
    private int pageSize = 1;

    public int getStart(){
        return (pageNumber-1)*pageSize;
    }
}
