package com.luffy.cloud.ali.provider.payment.controller;


import com.luffy.cloud.ali.basic.data.ResultData;
import com.luffy.cloud.ali.provider.payment.entity.Payment;
import com.luffy.cloud.ali.provider.payment.service.IPaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * <p>
 * 支付表 前端控制器
 * </p>
 *
 * @author luffy
 * @since 2020-03-25
 */
@RestController
@RequestMapping("/payment")
public class PaymentController {

    @Autowired
    private IPaymentService iPaymentService;

    @RequestMapping("/select/all")
    public ResultData<List<Payment>> selectAll() {
        List<Payment> paymentList = iPaymentService.selectAll();
        for (Payment payment : paymentList) {
            System.out.println(payment);
        }
        return ResultData.buildSuccessResult(paymentList);
    }

}
