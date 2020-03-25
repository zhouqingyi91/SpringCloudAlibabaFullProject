package com.luffy.cloud.ali.basic.exception;


import com.luffy.cloud.ali.basic.helper.IResCode;
import com.luffy.cloud.ali.basic.utils.MessageUtils;

/**
 *
 * 这个异常还可以定义那个远程服务异常，调用的详请等字段，先不定义
 *
 * @author wangjianqiao
 */
public class RemoteException extends BaseException {
    public RemoteException() {
        super();
    }

    public RemoteException(String message) {
        super(message);
    }

    public RemoteException(Integer code, String message, Object ...argArray) {
        super(code, MessageUtils.format(message,argArray));
    }
    public RemoteException(IResCode resCode, Object ...argArray) {
        super(resCode.getCode(), MessageUtils.format(resCode.getMsg(),argArray));
    }

    public RemoteException(Throwable cause) {
        super(cause);
    }

    public RemoteException(String message, Throwable cause) {
        super(message, cause);
    }

}
