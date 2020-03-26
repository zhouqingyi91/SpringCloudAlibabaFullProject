package com.luffy.cloud.ali.order.exception;


import com.luffy.cloud.ali.basic.helper.IResCode;

/**
 * 返回CODE
 * @author wjq
 */
public enum ReturnCode implements IResCode {
    /**
     * 用户未找到
     */
    USER_NOT_FOUND(40001,"没有找到ID为{}的用户"),
    USER_NOT_LOGIN(40002,"登陆失效，请重新登陆"),
    ;

    ReturnCode(int code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    private int code;

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
