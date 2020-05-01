package com.luffy.service.impl;

import com.luffy.entity.ItemDescription;
import com.luffy.mapper.ItemDescriptionMapper;
import com.luffy.service.IItemDescriptionService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author luffy
 * @since 2020-04-13
 */
@Service
public class ItemDescriptionServiceImpl extends ServiceImpl<ItemDescriptionMapper, ItemDescription> implements IItemDescriptionService {

}
