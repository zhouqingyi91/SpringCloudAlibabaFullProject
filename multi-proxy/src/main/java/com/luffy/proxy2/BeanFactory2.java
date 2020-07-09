package com.luffy.proxy2;

import com.luffy.service2.BaseService2;

import java.lang.reflect.Proxy;

/**
 * @author: zqy
 * @date: 2020-07-09 21:35
 **/
public class BeanFactory2 {

    public static BaseService2 getNewInstance(Class clazz) throws IllegalAccessException, InstantiationException {
        // 1 创建真正的对象
        BaseService2 chan2 = (BaseService2) clazz.newInstance();

        // 2 创建对象的代理 - 螳螂
        TangLang2 tangLang2 = new TangLang2(chan2);
        BaseService2 proxy1 = (BaseService2) Proxy.newProxyInstance(clazz.getClassLoader(), new Class[]{BaseService2.class}, tangLang2);

        // 3 创建代理对象的代理 - 黄雀
        HuangQue2 huangQue2 = new HuangQue2(proxy1);
        BaseService2 proxy2 = (BaseService2) Proxy.newProxyInstance(clazz.getClassLoader(), new Class[]{BaseService2.class}, huangQue2);

        return proxy2;
    }
}
