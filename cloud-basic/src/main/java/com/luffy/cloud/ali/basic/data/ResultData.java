package com.luffy.cloud.ali.basic.data;


import com.luffy.cloud.ali.basic.constants.ResCode;
import com.luffy.cloud.ali.basic.helper.Page;

import java.io.Serializable;
import java.util.List;

/**
 * @author lxm08
 */
public class ResultData<T> implements Serializable {

    private int code;
    private String msg;
    private String debugInfo;
    private T data;

    public ResultData() {
    }

    public ResultData(int code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public boolean isSuccess() {
        return ResCode.SUCCESS.getCode().equals(code);
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public String getDebugInfo() {
        return debugInfo;
    }

    public void setDebugInfo(String debugInfo) {
        this.debugInfo = debugInfo;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public static <T> ResultData<T> buildSuccessResult(T data) {
        ResultData resultData = new ResultData<>();
        resultData.setCode(ResCode.SUCCESS.getCode());
        resultData.setMsg(ResCode.SUCCESS.getMsg());
        resultData.setData(data);
        return resultData;
    }

    /**
     * MYBATIS PLUS返回的PAGE对象转换成项目中通用的PAGE对象，方便前端
     *
     * @param data
     * @param <T>
     * @return
     */
    public static <T> ResultData<T> buildSuccessPage(T data) {
        ResultData resultData = new ResultData<>();
        resultData.setCode(ResCode.SUCCESS.getCode());
        resultData.setMsg(ResCode.SUCCESS.getMsg());
        try {
            if (data != null && data.getClass().getName().equals("com.baomidou.mybatisplus.extension.plugins.pagination.Page")) {
                Page<T> page = new Page<>();
                page.setDataList((List) page.getClass().getMethod("getRecords").invoke(page));
                Number number = (Number) page.getClass().getMethod("getTotal").invoke(page);
                page.setTotalElements(number.intValue());
                number = (Number) page.getClass().getMethod("getCurrent").invoke(page);
                page.setPageNumber(number.intValue());
                number = (Number) page.getClass().getMethod("getSize").invoke(page);
                page.setPageSize(number.intValue());
                resultData.setData(page);
            } else {
                resultData.setData(data);
            }
        } catch (Exception e) {
            resultData.setData(null);
            resultData.setCode(ResCode.FAIL.getCode());
            resultData.setMsg("分页对象转换异常");
            resultData.setDebugInfo(e.getMessage() + ":" + e.getStackTrace().toString());
        }
        return resultData;
    }
}
