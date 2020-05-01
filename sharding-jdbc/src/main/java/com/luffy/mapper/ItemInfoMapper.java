package com.luffy.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.luffy.entity.ItemInfo;

import java.util.List;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author luffy
 * @since 2020-04-13
 */
public interface ItemInfoMapper extends BaseMapper<ItemInfo> {

    List<ItemInfo> getByStoreId(Long storeId);

    List<ItemInfo> selectJoin();
}
