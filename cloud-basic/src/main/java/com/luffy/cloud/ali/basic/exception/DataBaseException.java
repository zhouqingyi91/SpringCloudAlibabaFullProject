package com.luffy.cloud.ali.basic.exception;


import com.luffy.cloud.ali.basic.helper.IResCode;
import com.luffy.cloud.ali.basic.utils.MessageUtils;

/**
 * @author wangjianqiao
 */
public class DataBaseException extends BaseException {


    public DataBaseException() {
        super();
    }

    public DataBaseException(String message) {
        super(message);
    }

    public DataBaseException(Integer code, String message, Object ...argArray) {
        super(code, MessageUtils.format(message,argArray));
    }

    public DataBaseException(IResCode resCode, Object ...argArray) {
        super(resCode.getCode(), MessageUtils.format(resCode.getMsg(),argArray));
    }

    public DataBaseException(Throwable cause) {
        super(cause);
    }

    public DataBaseException(String message, Throwable cause) {
        super(message, cause);
    }

}
