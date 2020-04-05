package com.luffy.cloud.ali.order.myhandler;

import com.alibaba.csp.sentinel.slots.block.BlockException;

/**
 * @author: zqy
 * @date: 2020-04-05 16:00
 **/
public class CustomBlockHandler {
    public static String customBlockHandlerException1(BlockException be) {
        return "customBlockHandlerException-------1";
    }
    public static String customBlockHandlerException2(BlockException be) {
        return "customBlockHandlerException-------2";
    }
}
