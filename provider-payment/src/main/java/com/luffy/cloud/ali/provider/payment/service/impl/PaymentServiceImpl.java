package com.luffy.cloud.ali.provider.payment.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.luffy.cloud.ali.provider.payment.entity.Payment;
import com.luffy.cloud.ali.provider.payment.mapper.PaymentMapper;
import com.luffy.cloud.ali.provider.payment.service.IPaymentService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * <p>
 * 支付表 服务实现类
 * </p>
 *
 * @author luffy
 * @since 2020-03-25
 */
@Service
public class PaymentServiceImpl extends ServiceImpl<PaymentMapper, Payment> implements IPaymentService {

    @Resource
    private PaymentMapper paymentMapper;

    @Override
    public List<Payment> selectAll() {
        return paymentMapper.selectList(null);
    }
}
