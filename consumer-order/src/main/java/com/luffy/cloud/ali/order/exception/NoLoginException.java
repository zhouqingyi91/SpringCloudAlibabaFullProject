package com.luffy.cloud.ali.order.exception;


import com.luffy.cloud.ali.basic.exception.BaseException;
import com.luffy.cloud.ali.basic.helper.IResCode;
import com.luffy.cloud.ali.basic.utils.MessageUtils;

/**
 * @author tengdj
 * @date 2020/3/17 17:00
 **/
public class NoLoginException extends BaseException {

    public NoLoginException() {
        super();
    }

    public NoLoginException(IResCode resCode, Object ...argArray) {
        super(resCode.getCode(), MessageUtils.format(resCode.getMsg(),argArray));
    }

    public NoLoginException(Throwable cause) {
        super(cause);
    }

    public NoLoginException(String message, Throwable cause) {
        super(message, cause);
    }

}
