package com.luffy.cloud.ali.basic.utils;

import org.slf4j.helpers.MessageFormatter;

/**
 * @author wangjianqiao
 */
public class MessageUtils {

    /**
     * 格式化类似slf4j日志的字符串
     * message:"test,{},{}";
     * args:["a","bbb"];
     * 结果为："test,a,bbb";
     *
     * @param message 要格式化的字符串
     * @param args 参数
     * @return 格式化过的字符串
     */
    public static String format(String message,Object ...args){
        return MessageFormatter.arrayFormat(message,args).getMessage();
    }
}
