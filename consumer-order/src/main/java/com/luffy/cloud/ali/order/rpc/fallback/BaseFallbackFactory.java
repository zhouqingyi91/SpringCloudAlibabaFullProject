package com.luffy.cloud.ali.order.rpc.fallback;


import com.luffy.cloud.ali.basic.constants.ResCodeConst;
import com.luffy.cloud.ali.basic.data.ResultData;
import org.springframework.beans.factory.annotation.Value;

/**
 * @author wangjianqiao
 */
public class BaseFallbackFactory {

    @Value("${isDebug:false}")
    private boolean isDebug = false;

    <T> ResultData<T> getExceptionResultData(Throwable cause){
        ResultData<T> resultData = new ResultData<>();
        resultData.setCode(ResCodeConst.REMOTE_ERROR);
        if(isDebug){
            resultData.setMsg(cause.getMessage());
        }else {
            resultData.setMsg("远程调用失败");
        }
        return resultData;
    }

    <T> ResultData<T> getSuccessResultData(Throwable cause){
        ResultData<T> resultData = new ResultData<>();
        resultData.setCode(ResCodeConst.SUCCESS);
        if(isDebug){
            resultData.setMsg(cause.getMessage());
        }else {
            resultData.setMsg("远程调用失败,降级处理");
        }
        return resultData;
    }
}
