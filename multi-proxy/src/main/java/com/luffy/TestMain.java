package com.luffy;

import com.luffy.proxy2.BeanFactory2;
import com.luffy.service2.BaseService2;
import com.luffy.service2.impl.Chan2;

/**
 * @author: zqy
 * @date: 2020-07-08 19:14
 **/
public class TestMain {
    public static void main(String[] args) throws InstantiationException, IllegalAccessException {

        // 这里得到的蝉并不是真实的蝉, 而是蝉的代理
//        BaseService chan = BeanFactory.newInstance(Chan.class);
//        chan.eat();

        BaseService2 chan2 = BeanFactory2.getNewInstance(Chan2.class);
        chan2.eat();
    }
}
