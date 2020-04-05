package com.luffy.cloud.ali.order.controller;

import com.alibaba.csp.sentinel.annotation.SentinelResource;
import com.alibaba.csp.sentinel.slots.block.BlockException;
import com.luffy.cloud.ali.order.myhandler.CustomBlockHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author: zqy
 * @date: 2020-04-05 12:35
 **/
@RestController()
@RequestMapping("/sentinel")
public class SentinelController {

    @GetMapping("/testa")
    public String sentinelTestA() {
        return "sentinelTestA";
    }

    @GetMapping("/testb")
    public String sentinelTestB() {
        return "sentinelTestB ";
    }

    // 按资源名限流
    @GetMapping("/testhotkey")
    // blockHandler只负责sentinel控制台配置违规, 代码异常不管
    @SentinelResource(value = "testhotkey", blockHandler = "deal_testhotkey")
    public String sentinelTestHotKey(@RequestParam(value = "p1", required = false) String p1,
                                     @RequestParam(value = "p2", required = false) String p2) {
        return "testhotkey ";
    }

    // 热点规则出事了, 调用这个兜底的方法
    public String deal_testhotkey(String p1, String p2, BlockException be) {
        return "deal_testhotkey";
    }

    // 统一使用一个自定义兜底方法
    @GetMapping("/customBlockHandler")
    @SentinelResource(value = "customBlockHandler",
            blockHandlerClass = CustomBlockHandler.class,
            blockHandler = "customBlockHandlerException2")
    public String customBlockHandler() {
        return "customBlockHandler";
    }
}
