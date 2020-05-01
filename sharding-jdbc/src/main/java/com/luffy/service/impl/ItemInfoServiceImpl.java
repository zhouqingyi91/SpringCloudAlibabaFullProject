package com.luffy.service.impl;

import com.luffy.entity.ItemInfo;
import com.luffy.mapper.ItemInfoMapper;
import com.luffy.service.IItemInfoService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author luffy
 * @since 2020-04-13
 */
@Service
public class ItemInfoServiceImpl extends ServiceImpl<ItemInfoMapper, ItemInfo> implements IItemInfoService {

    @Resource
    private ItemInfoMapper itemInfoMapper;

    @Override
    public List<ItemInfo> selectJoin(Long infoId) {
        return itemInfoMapper.selectJoin(infoId);
    }

    @Override
    public List<ItemInfo> getByStoreId(Long storeId) {
        return itemInfoMapper.getByStoreId(storeId);
    }
}
