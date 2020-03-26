//package com.luffy.cloud.ali.order.exception;
//
//import com.luffy.cloud.ali.basic.constants.ResCodeConst;
//import com.luffy.cloud.ali.basic.data.ResultData;
//import com.luffy.cloud.ali.basic.exception.BusinessException;
//import com.luffy.cloud.ali.basic.exception.DataBaseException;
//import com.luffy.cloud.ali.basic.exception.VersionException;
//import lombok.extern.slf4j.Slf4j;
//import org.apache.commons.lang.exception.ExceptionUtils;
//import org.springframework.beans.factory.annotation.Value;
//import org.springframework.http.converter.HttpMessageNotReadableException;
//import org.springframework.web.bind.MethodArgumentNotValidException;
//import org.springframework.web.bind.annotation.ControllerAdvice;
//import org.springframework.web.bind.annotation.ExceptionHandler;
//import org.springframework.web.bind.annotation.ResponseBody;
//
//import javax.servlet.http.HttpServletRequest;
//import javax.servlet.http.HttpServletResponse;
//import javax.validation.ValidationException;
//
///**
// * 异常处理
// *
// * @author wangjianqiao
// */
//@Slf4j
//@ControllerAdvice
//public class GlobalExceptionHandler {
//
//    @Value("${isDebug:false}")
//    private boolean isDebug = false;
//
//    /**
//     * 拦截捕捉自定义异常 BusinessException.class
//     *
//     * @param response response
//     * @param ex       ex
//     * @return ResultData
//     */
//    @ResponseBody
//    @ExceptionHandler(value = BusinessException.class)
//    public ResultData<NullDto> businessErrorHandler(HttpServletRequest request, HttpServletResponse response, BusinessException ex) {
//        log.error("发生业务异常", ex);
//        int code = ex.getCode() == null ? ResCodeConst.GLOBAL_ERROR : ex.getCode();
//        String message = ex.getMessage();
//        ResultData<NullDto> rsData = new ResultData<>();
//        rsData.setCode(code);
//        rsData.setMsg(message);
//        if (isDebug) {
//            rsData.setDebugInfo(ExceptionUtils.getFullStackTrace(ex));
//        }
//        return rsData;
//    }
//
//    /**
//     * 拦截捕捉自定义异常 RemoteException.class
//     *
//     * @param response response
//     * @param ex       ex
//     * @return ResultData
//     */
//    @ResponseBody
//    @ExceptionHandler(value = RemoteException.class)
//    public ResultData<NullDto> remoteErrorHandler(HttpServletRequest request, HttpServletResponse response, RemoteException ex) {
//        log.error("发生远程调用异常", ex);
//        int code = ex.getCode();
//        String message = ex.getMessage();
//        ResultData<NullDto> rsData = new ResultData<>();
//        rsData.setCode(code);
//        rsData.setMsg(message);
//        if (isDebug) {
//            rsData.setDebugInfo(ExceptionUtils.getFullStackTrace(ex));
//        }
//        return rsData;
//    }
//
//    @ResponseBody
//    @ExceptionHandler(value = {
//            MethodArgumentNotValidException.class
//    })
//    public ResultData<NullDto> methodArgumentNotValidExceptionHandler(HttpServletRequest request, HttpServletResponse response, MethodArgumentNotValidException ex) {
//        log.error("参数验证异常:", ex);
//        ResultData<NullDto> rsData = new ResultData<>();
//        rsData.setCode(ResCodeConst.VALIDATE_ERROR);
//        rsData.setMsg(ex.getBindingResult().getFieldError().getDefaultMessage());
//        if (isDebug) {
//            rsData.setDebugInfo(ExceptionUtils.getFullStackTrace(ex));
//        }
//        return rsData;
//    }
//
//
//    @ResponseBody
//    @ExceptionHandler(value = {
//            ValidationException.class,
//    })
//    public ResultData<NullDto> validationExceptionHandler(HttpServletRequest request, HttpServletResponse response, ValidationException ex) {
//        log.error("参数验证异常:", ex);
//        ResultData<NullDto> rsData = new ResultData<>();
//        rsData.setCode(ResCodeConst.VALIDATE_ERROR);
//        rsData.setMsg(ex.getMessage());
//        if (isDebug) {
//            rsData.setDebugInfo(ExceptionUtils.getFullStackTrace(ex));
//        }
//        return rsData;
//    }
//
//
//    @ResponseBody
//    @ExceptionHandler(value = {
//            HttpMessageNotReadableException.class
//    })
//    public ResultData<NullDto> httpMessageNotReadableExceptionHandler(HttpServletRequest request, HttpServletResponse response, HttpMessageNotReadableException ex) {
//        log.error("参数验证异常:", ex);
//        ResultData<NullDto> rsData = new ResultData<>();
//        rsData.setCode(ResCodeConst.VALIDATE_ERROR);
//        rsData.setMsg(isDebug ? ex.getMessage() : "参数类型错误");
//        if (isDebug) {
//            rsData.setDebugInfo(ExceptionUtils.getFullStackTrace(ex));
//        }
//        return rsData;
//    }
//
//    @ResponseBody
//    @ExceptionHandler(value = VersionException.class)
//    public ResultData<NullDto> versionExceptionHandler(HttpServletRequest request, HttpServletResponse response, VersionException ex) {
//        log.error("数据版本校验异常:", ex);
//        int code = ex.getCode();
//        String message = ex.getMessage();
//        ResultData<NullDto> rsData = new ResultData<>();
//        rsData.setCode(code);
//        rsData.setMsg(isDebug ? message : "数据已被修改，请刷新后重试！");
//        if (isDebug) {
//            rsData.setDebugInfo(ExceptionUtils.getFullStackTrace(ex));
//        }
//        return rsData;
//    }
//
//    @ResponseBody
//    @ExceptionHandler(value = DataBaseException.class)
//    public ResultData<NullDto> databaseExceptionHandler(HttpServletRequest request, HttpServletResponse response, DataBaseException ex) {
//        log.error("数据库事务处理异常:", ex);
//        int code = ResCodeConst.GLOBAL_ERROR;
//        String message = ex.getMessage();
//        ResultData<NullDto> rsData = new ResultData<>();
//        rsData.setCode(code);
//        rsData.setMsg(isDebug ? message : "数据处理失败，请稍后重试！");
//        if (isDebug) {
//            rsData.setDebugInfo(ExceptionUtils.getFullStackTrace(ex));
//        }
//        return rsData;
//    }
//
//    @ResponseBody
//    @ExceptionHandler(value = NoLoginException.class)
//    public ResultData<NullDto> noLoginExceptionHandler(HttpServletRequest request, HttpServletResponse response, NoLoginException ex) {
//        log.info("用户未登录:", ex);
//        int code = ex.getCode();
//        String message = ex.getMessage();
//        ResultData<NullDto> rsData = new ResultData<>();
//        rsData.setCode(code);
//        rsData.setMsg(message);
//        return rsData;
//    }
//
//    @ExceptionHandler(value = Exception.class)
//    @ResponseBody
//    public ResultData<NullDto> defaultErrorHandler(HttpServletRequest request, HttpServletResponse response, Exception ex) {
//        log.error("========未捕获异常开始========");
//        log.error("未捕获异常 ：", ex);
//        log.error("========未捕获异常结束========");
//        ResultData<NullDto> rsData = new ResultData<>();
//        rsData.setCode(ResCodeConst.GLOBAL_ERROR);
//        rsData.setMsg(ex.getMessage());
//        response.setStatus(500);
//        if (isDebug) {
//            rsData.setDebugInfo(ExceptionUtils.getFullStackTrace(ex));
//        }
//        return rsData;
//    }
//
//
//}
