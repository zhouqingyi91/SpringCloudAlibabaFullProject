package com.luffy.service;

import com.luffy.entity.ItemInfo;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author luffy
 * @since 2020-04-13
 */
public interface IItemInfoService extends IService<ItemInfo> {

    List<ItemInfo> getByStoreId(Long storeId);

    List<ItemInfo> selectJoin();
}
