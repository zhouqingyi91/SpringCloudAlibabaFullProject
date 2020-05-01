package com.luffy;

public enum ProgressBarNewEnum {

    DEFAULT (0, ""),

    // 报单支付
    ORDER_UNPAID (1, "待支付"),
    ORDER_PENDING (2, "待审核"),
    ORDER_PASS (3, "已通过"),
    ORDER_REFUSE (4, "未通过"),

    // 内勤处理
    INTERNAL_PENDING (10, "待处理"),

    // 运费差额支付
    EXTRA_SHIPPING_UNPAID (20, "待支付"),
    EXTRA_SHIPPING_PENDING (21, "待审核"),
    EXTRA_SHIPPING_PASS (22, "已通过"),
    EXTRA_SHIPPING_REFUSE (23, "未通过"),

    // 退款结算
    REFUND_PENDING (30, "待审核"),
    REFUND_PASS (31, "已通过"),
    REFUND_REFUSE (32, "未通过"),

    // 资管处理
    ASSET_PENDING (40, "资管待分配"),
    ASSET_PARTIALLY_ASSIGN (41, "资管部分分配"),
    ASSET_ALL_ASSIGN (42, "资管全部分配"),

    // 采购处理
    PURCHASE_PENDING (50, "采购待分配"),
    PURCHASE_PARTIALLY_ASSIGN (51, "采购部分分配"),
    PURCHASE_ALL_ASSIGN (52, "采购全部分配"),

    // 仓库接单
    STORE_PENDING_TAKING(60, "仓库待接单"),
    STORE_PARTIALLY_TAKING(61, "仓库部分接单"),
    STORE_ALL_TAKING(62, "仓库全部接单"),

    // 工厂接单
    FACTORY_PENDING_TAKING(70, "工厂待接单"),
    FACTORY_PARTIALLY_TAKING(71, "工厂部分接单"),
    FACTORY_ALL_TAKING(72, "工厂全部接单"),

    // 仓库发货
    STORE_SHIPMENT_PENDING (80, "仓库待发货"),
    STORE_SHIPMENT_PARTIAL (81, "仓库部分发货"),
    STORE_SHIPMENT_ALL (82, "仓库全部发货"),

    // 工厂发货
    FACTORY_SHIPMENT_PENDING (90, "工厂待发货"),
    FACTORY_SHIPMENT_PARTIAL (91, "工厂部分发货"),
    FACTORY_SHIPMENT_ALL (92, "工厂全部发货"),

    // 客户签收
    CLIENT_SIGN_PENDING(100, "待签收"),
    CLIENT_SIGN_PARTIAL(101, "部分签收"),
    CLIENT_SIGN_ALL(102, "全部签收"),

    // 资产确认书
    CERTIFICATE_CONFIRM_PENDING (110, "待确认"),
    CERTIFICATE_CONFIRM_PARTIAL (111, "部分确认"),
    CERTIFICATE_CONFIRM_ALL (112, "全部确认");

    private Integer code;

    private String desc;

    public Integer getCode() {
        return code;
    }

    public String getDesc() {
        return desc;
    }

    private ProgressBarNewEnum(Integer code, String desc){
        this.code = code;
        this.desc = desc;
    }


    public static ProgressBarNewEnum getByCode(Integer code){
        if(code ==null){
            return DEFAULT;
        }
        for(ProgressBarNewEnum wishStatusEnum:values()){
            if(wishStatusEnum.getCode().equals(code)){
                return wishStatusEnum;
            }
        }
        return DEFAULT;
    }
}
