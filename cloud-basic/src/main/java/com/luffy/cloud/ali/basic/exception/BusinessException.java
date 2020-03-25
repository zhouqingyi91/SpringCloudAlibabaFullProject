package com.luffy.cloud.ali.basic.exception;


import com.luffy.cloud.ali.basic.helper.IResCode;
import com.luffy.cloud.ali.basic.utils.MessageUtils;

/**
 * @author wangjianqiao
 */
public class BusinessException extends BaseException {


    public BusinessException() {
        super();
    }

    public BusinessException(String message) {
        super(message);
    }

    public BusinessException(Integer code, String message, Object ...argArray) {
        super(code, MessageUtils.format(message,argArray));
    }

    public BusinessException(IResCode resCode, Object ...argArray) {
        super(resCode.getCode(), MessageUtils.format(resCode.getMsg(),argArray));
    }

    public BusinessException(Throwable cause) {
        super(cause);
    }

    public BusinessException(String message, Throwable cause) {
        super(message, cause);
    }

}
