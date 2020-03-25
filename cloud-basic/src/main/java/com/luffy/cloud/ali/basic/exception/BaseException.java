package com.luffy.cloud.ali.basic.exception;


import com.luffy.cloud.ali.basic.constants.ResCodeConst;

/**
 * @author lxm08
 */
public class BaseException  extends RuntimeException {

    private Integer code = ResCodeConst.GLOBAL_ERROR;
    private Object[] values;

    private String errorMsg;
    public Integer getCode() {
        return this.code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public Object[] getValues() {
        return this.values;
    }

    public void setValues(Object[] values) {
        this.values = values;
    }

    public BaseException() {
        super();
    }

    public BaseException(String message) {
        super(message);
    }

    public BaseException(Integer code, String message) {
        super(message);
        this.code = code;
    }

    public BaseException(Throwable cause) {
        super(cause);
    }

    public BaseException(String message, Throwable cause) {
        super(message, cause);
    }


    public BaseException(Integer code, String message, Throwable cause, Object[] values) {
        super(message, cause);
        this.code = code;
        this.values = values;
    }

    public String getErrorMsg() {
        return errorMsg;
    }

    public void setErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg;
    }

}