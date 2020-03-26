package com.luffy.cloud.ali.order.rpc.client;

import com.luffy.cloud.ali.basic.data.ResultData;
import com.luffy.cloud.ali.order.rpc.config.CommonClientConfig;
import com.luffy.cloud.ali.order.rpc.fallback.PaymentClientFallbackFactory;
import com.luffy.cloud.ali.payment.entity.Payment;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@FeignClient(
        name = "cloud-payment-service",
        fallbackFactory = PaymentClientFallbackFactory.class,
        configuration = CommonClientConfig.class)
@RequestMapping("/payment")
public interface PaymentClient {

    @RequestMapping("/insert")
    ResultData<Boolean> insert(Payment payment);

    @RequestMapping("/select/all")
    ResultData<List<Payment>> selectAll();
}
