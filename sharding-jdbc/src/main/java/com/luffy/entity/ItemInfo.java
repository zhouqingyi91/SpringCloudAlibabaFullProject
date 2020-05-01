package com.luffy.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * <p>
 * 
 * </p>
 *
 * @author luffy
 * @since 2020-04-13
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
//@TableName("item_info")
public class ItemInfo implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 商品id
     */
    @TableId("item_info_id")
    private Long itemInfoId;

    /**
     * 商品名称
     */
    @TableField("item_name")
    private String itemName;

    /**
     * 商品价格
     */
    @TableField("item_price")
    private BigDecimal itemPrice;

    /**
     * 商店id
     */
    @TableField("store_id")
    private Long storeId;

//    @JsonProperty("item_description")
    private String itemDescription;
}
