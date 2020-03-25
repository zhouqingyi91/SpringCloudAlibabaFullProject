package com.luffy.cloud.ali.basic.constants;


import com.luffy.cloud.ali.basic.helper.IResCode;

/**
 * @author wjq
 */
public enum ResCode implements IResCode {

    /**
     * 成功返回
     */
    SUCCESS(ResCodeConst.SUCCESS,"成功"),
    FAIL(ResCodeConst.GLOBAL_ERROR,"失败"),

    ;
    ResCode(Integer code, String msg){
        this.code = code;
        this.msg = msg;
    }

    private Integer code;
    private String msg;

    @Override
    public Integer getCode() {
        return this.code;
    }

    @Override
    public String getMsg() {
        return this.msg;
    }
}
