package com.luffy.cloud.ali.basic.exception;


import com.luffy.cloud.ali.basic.helper.IResCode;
import com.luffy.cloud.ali.basic.utils.MessageUtils;

/**
 * @author wangjianqiao
 */
public class VersionException extends BaseException {


    public VersionException() {
        super();
    }

    public VersionException(String message) {
        super(message);
    }

    public VersionException(Integer code, String message, Object ...argArray) {
        super(code, MessageUtils.format(message,argArray));
    }

    public VersionException(IResCode resCode, Object ...argArray) {
        super(resCode.getCode(), MessageUtils.format(resCode.getMsg(),argArray));
    }

    public VersionException(Throwable cause) {
        super(cause);
    }

    public VersionException(String message, Throwable cause) {
        super(message, cause);
    }

}
