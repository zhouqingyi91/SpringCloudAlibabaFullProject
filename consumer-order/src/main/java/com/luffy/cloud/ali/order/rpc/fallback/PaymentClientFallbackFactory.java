package com.luffy.cloud.ali.order.rpc.fallback;

import com.luffy.cloud.ali.basic.data.ResultData;
import com.luffy.cloud.ali.order.rpc.client.PaymentClient;
import com.luffy.cloud.ali.payment.entity.Payment;
import feign.hystrix.FallbackFactory;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@Slf4j
public class PaymentClientFallbackFactory extends BaseFallbackFactory implements FallbackFactory<PaymentClient> {
    @Override
    public PaymentClient create(Throwable cause) {
        return new PaymentClient() {
            @Override
            public ResultData<Boolean> insert(Payment payment) {
                log.error("创建订单接口出错", cause);
                return getExceptionResultData(cause);
            }

            @Override
            public ResultData<List<Payment>> selectAll() {
                log.error("创建订单接口出错", cause);
                return getExceptionResultData(cause);
            }
        };
    }
}
