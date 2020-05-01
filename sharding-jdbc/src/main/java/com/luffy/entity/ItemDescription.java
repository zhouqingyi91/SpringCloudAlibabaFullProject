package com.luffy.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

import java.io.Serializable;

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
//@TableName("item_description")
public class ItemDescription implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 商品id
     */
    @TableId("item_info_id")
    private Long itemInfoId;

    /**
     * 商品描述
     */
    @TableField("item_description")
    private String itemDescription;

    /**
     * 商店id
     */
    @TableField("store_id")
    private Long storeId;


}
