package com.luffy.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * @author: zqy
 * @date: 2020-07-08 19:17
 **/
public class HuangQue implements InvocationHandler {

    private Object proxy1; // 监听蝉的监听对象 - 也就是蝉的一级代理

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        method.invoke(proxy1, args); // 调用监听对象的主要业务, 也就是螳螂的invoke
        secondaryJob(); // 吃螳螂
        return null;
    }

    private void secondaryJob() {
        System.out.println("黄雀吃螳螂");
    }

    public HuangQue(Object proxy1) {
        this.proxy1 = proxy1;
    }
}
