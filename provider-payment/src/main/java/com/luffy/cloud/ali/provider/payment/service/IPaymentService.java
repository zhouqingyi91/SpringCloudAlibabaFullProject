package com.luffy.cloud.ali.provider.payment.service;

import com.luffy.cloud.ali.provider.payment.entity.Payment;
import com.baomidou.mybatisplus.extension.service.IService;

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
