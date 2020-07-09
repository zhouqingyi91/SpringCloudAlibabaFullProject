package com.luffy.proxy;

import com.luffy.service.BaseService;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * @author: zqy
 * @date: 2020-07-08 19:05
 **/
public class TangLang implements InvocationHandler {

    private BaseService obj; // 小蝉

    // 主要业务
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        method.invoke(obj, args); //先让小蝉吃树脂
        secondary_job(); // 螳螂再吃蝉

        return null;
    }

    // 次要业务
    private void secondary_job() {
        System.out.println("螳螂吃蝉");
    }

    public TangLang(BaseService obj) {
        this.obj = obj;
    }
}
