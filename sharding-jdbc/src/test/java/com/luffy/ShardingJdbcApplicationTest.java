package com.luffy;

import com.luffy.entity.ItemInfo;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.math.BigDecimal;

/**
 * @author: zqy
 * @date: 2020-04-13 19:10
 **/
@RunWith(SpringRunner.class)
@SpringBootTest(classes = ShardingJdbcApplication.class)
public class ShardingJdbcApplicationTest {

    // 添加商品
    @Test
    public void add() {
        ItemInfo itemInfo = new ItemInfo();
        itemInfo.setItemName("商品1");
        itemInfo.setItemPrice(new BigDecimal(10));
        itemInfo.setStoreId(1L);
    }
}
