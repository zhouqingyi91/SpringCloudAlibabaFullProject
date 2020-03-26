package com.luffy.cloud.ali.order.controller;

import com.luffy.cloud.ali.basic.data.ResultData;
import com.luffy.cloud.ali.order.rpc.client.PaymentClient;
import com.luffy.cloud.ali.payment.entity.Payment;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController()
@Api(tags = "订单接口")
@RequestMapping("/order")
public class OrderController {

    @Resource
    private PaymentClient paymentClient;

    @RequestMapping("/create")
    @ApiOperation(value = "创建订单接口")
    public ResultData<Boolean> create(@RequestBody Payment payment) {
        return paymentClient.insert(payment);
    }

    @RequestMapping("/select/all")
    @ApiOperation(value = "查看所有订单接口")
    public ResultData<List<Payment>> selectAll() {
        return paymentClient.selectAll();
    }
}
