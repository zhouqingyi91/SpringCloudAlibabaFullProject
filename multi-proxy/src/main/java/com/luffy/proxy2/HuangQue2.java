package com.luffy.proxy2;

import com.luffy.service2.BaseService2;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * @author: zqy
 * @date: 2020-07-09 21:46
 **/
public class HuangQue2 implements InvocationHandler {

    private BaseService2 chan2;

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        method.invoke(chan2, args);
        secondaryJob();

        return null;
    }

    public HuangQue2(BaseService2 obj) {
        this.chan2 = obj;
    }

    private void secondaryJob() {
        System.out.println("黄雀2吃螳螂2");
    }
}
