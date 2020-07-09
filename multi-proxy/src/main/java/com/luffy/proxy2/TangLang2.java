package com.luffy.proxy2;

import com.luffy.service2.BaseService2;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * @author: zqy
 * @date: 2020-07-09 21:39
 **/
public class TangLang2 implements InvocationHandler {

    BaseService2 chan2;

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        method.invoke(chan2, args);
        secondaryJob();
        return null;
    }

    public TangLang2(BaseService2 chan2) {
        this.chan2 = chan2;
    }

    private void secondaryJob() {
        System.out.println("螳螂2吃蝉2");
    }
}
