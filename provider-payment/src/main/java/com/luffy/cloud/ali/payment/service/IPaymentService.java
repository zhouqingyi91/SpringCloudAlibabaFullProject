package com.luffy.cloud.ali.payment.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.luffy.cloud.ali.payment.entity.Payment;

import java.util.List;

/**
 * <p>
 * 支付表 服务类
 * </p>
 *
 * @author luffy
 * @since 2020-03-25
 */
public interface IPaymentService extends IService<Payment> {

    List<Payment> selectAll();
}
