package com.luffy;

import lombok.Data;

/**
 * @author: zqy
 * @date: 2020-04-22 20:30
 **/
@Data
public class ProgressBar {
    private One one;
    private Two two;
    private Three three;
    private String currentStatus = "one";

    public ProgressBar() {
        one = new One();
        two = new Two();
    }

    @Data
    // 客户付款、财务审核
    public class One {
        // 报单支付
        private String orderPay;
        // 内勤审核
        private String internalAudit;
        // 运费差价
        private String extraShipping;
    }

    @Data
    // 发货、签收、资产确认
    public class Two {
        // 资管处理：资管部分分配
        private String assetAudit;
        // 采购处理：采购部分分配
        private String purchaseAudit;
        // 仓库接单：仓库部分接单
        private String storeTaking;
        // 工厂接单：工厂部分接单
        private String factoryTaking;
        // 仓库发货：仓库部分发货
        private String storeShipping;
        // 工厂发货
        private String factoryShipping;
        // 客户签收
        private String clientReceive;
        // 资产确认书
        private String confirmationSign;
    }

    public class Three{

    }
}
