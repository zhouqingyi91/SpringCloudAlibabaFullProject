package com.luffy.proxy;

import com.luffy.service.BaseService;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

/**
 * @author: zqy
 * @date: 2020-07-08 19:02
 **/
public class BeanFactory {

    public static BaseService newInstance(Class clazz) throws IllegalAccessException, InstantiationException {

        // 1 创建真实的小蝉
        BaseService chan = (BaseService) clazz.newInstance();

        // 2 创建代理实现类对象 - 螳螂
        InvocationHandler tangLang = new TangLang(chan);

        // 3 向JVM所要代理对象(也就是被监听的对象 - 蝉) 监听蝉何时吃树脂, 吃的时候通知螳螂
        BaseService proxy1 = (BaseService) Proxy.newProxyInstance(clazz.getClassLoader(), new Class[]{BaseService.class}, tangLang);

        // 4 创建蝉的第二级代理 - 黄雀
        HuangQue huangQue = new HuangQue(proxy1);
        BaseService proxy2 = (BaseService) Proxy.newProxyInstance(clazz.getClassLoader(), new Class[]{BaseService.class}, huangQue);

        return proxy2;
    }
}
