package com.luffy;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

/**
 * 转机设备清单实体类
 * @author: zqy
 * @date: 2020-05-15 13:34
 **/
@Data
public class TransferMachineListVO implements Serializable {
    private static final long serialVersionUID = 5974376052706981076L;

    //资产编码
    @JSONField(name="machine_sn")
    private String machineSn;

    //机器类型名称
    @JSONField(name="type_name")
    private String typeName;

    //设备名称
    private String machineName;

    //宗盛编号
    @JSONField(name="zs_sn")
    private String zsSn;

    //交割日 - 不用了
    private Date startTime;

    //交割日
    @JSONField(name="deal_date")
    private Date dealDate;

    //转入方月租金(分) - 不用了
    private Long monthlyRentFee;
    //转入方月租金(元) - 不用了
    private BigDecimal monthlyRentYuan;
    //转入方月租金(分)
    private Long transferMonthlyRentFee;

    //转入方月租金(元)
    @JSONField(name="transfer_monthly_rent_yuan")
    private BigDecimal transferMonthlyRentYuan;
    //使用到期日 - 不用了
    private Date endTime;
    //转机使用到期日
    @JSONField(name="transfer_end_time")
    private Date transferEndTime;
    //设备状况照片
    private String assetPhotos;
    //设备状况照片集合(url)
    @JSONField(name="asset_photos_list")
    private List<String> assetPhotosList;
    //销售属性
    private String saleAttributes;
    //订单状态(数字)
    private Integer orderStatus;
    //订单状态(字符串)
    private String orderStatusStr;
    //转出方发货时间
    private Date fromDeliveryDate;
    //转入方签收时间
    private Date signTime;

    @JSONField(name="machine_kid_id")
    private Long machineKidId;
}
