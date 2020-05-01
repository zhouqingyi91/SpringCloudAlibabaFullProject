package com.luffy.controller;


import com.luffy.entity.ItemDescription;
import com.luffy.entity.ItemInfo;
import com.luffy.service.IItemDescriptionService;
import com.luffy.service.IItemInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author luffy
 * @since 2020-04-13
 */
@RestController
@RequestMapping("/itemInfo")
public class ItemInfoController {

    @Autowired
    private IItemInfoService itemInfoService;
    @Autowired
    private IItemDescriptionService itemDescriptionService;

    @PostMapping("/add")
    public void add(@RequestBody ItemInfo itemInfo) {
        itemInfoService.save(itemInfo);
        ItemDescription itemDescription = new ItemDescription();
        itemDescription.setItemDescription("商品描述1");
        itemDescription.setItemInfoId(itemInfo.getItemInfoId());
        itemDescription.setStoreId(itemInfo.getStoreId());
        itemDescriptionService.save(itemDescription);
    }

    @PostMapping("/select/iteminfolist")
    public List<ItemInfo> selectItemInfoList() {
        List<ItemInfo> itemInfoList = itemInfoService.list();
        return itemInfoList;
    }

    @PostMapping("/select/itemdesclist")
    public List<ItemDescription> selectItemDescList() {
        List<ItemDescription> itemDescriptionList = itemDescriptionService.list();
        return itemDescriptionList;
    }

    @RequestMapping("/select/{storeId}")
    public List<ItemInfo> selectItemInfoByStoreId(@PathVariable("storeId") Long storeId) {
        List<ItemInfo> itemInfos = itemInfoService.getByStoreId(storeId);
        return itemInfos;
    }

    @RequestMapping("/select/join")
    public List<ItemInfo> selectJoin() {
        List<ItemInfo> itemInfoList = itemInfoService.selectJoin(1256312375013031937L);
        return itemInfoList;
    }
}
