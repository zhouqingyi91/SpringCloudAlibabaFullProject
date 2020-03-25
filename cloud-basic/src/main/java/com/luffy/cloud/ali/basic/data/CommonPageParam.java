package com.luffy.cloud.ali.basic.data;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

/**
 * 带查询参数的分页条件类
 * @author tengdj
 * @date 2020/2/21 9:37
 **/
@Data
@NoArgsConstructor
@EqualsAndHashCode(callSuper = false)
public class CommonPageParam<T> extends Pageable{

    private static final long serialVersionUID = -8903100417660873144L;

    public CommonPageParam(int pageNumber, int pageSize, T param) {
        super(pageNumber, pageSize);
        this.param = param;
    }

    @ApiModelProperty(value = "分页查询参数")
    T param;

}
