package com.luffy;

import com.alibaba.fastjson.JSON;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * @author: zqy
 * @date: 2020-04-22 20:30
 **/
public class RandomTest {
    public static void main(String[] args) {
        ProgressBar progressBar = new ProgressBar();
        ProgressBar.One one = progressBar.getOne();
        ProgressBar.Two two = progressBar.getTwo();
//        progressBar.setThree(new ProgressBar().new Three());
//
//        one.setOrderPay(ProgressBarNewEnum.ORDER_PASS.getDesc());
//        one.setExtraShipping(ProgressBarNewEnum.EXTRA_SHIPPING_PASS.getDesc());
//        one.setInternalAudit(ProgressBarNewEnum.INTERNAL_PENDING.getDesc());
//
//        two.setAssetAudit(ProgressBarNewEnum.ASSET_ALL_ASSIGN.getDesc());
//        two.setPurchaseAudit(ProgressBarNewEnum.PURCHASE_ALL_ASSIGN.getDesc());
//        two.setStoreTaking(ProgressBarNewEnum.STORE_ALL_TAKING.getDesc());
//        two.setFactoryTaking(ProgressBarNewEnum.FACTORY_ALL_TAKING.getDesc());
//        two.setStoreShipping(ProgressBarNewEnum.STORE_SHIPMENT_ALL.getDesc());
//        two.setFactoryShipping(ProgressBarNewEnum.FACTORY_SHIPMENT_ALL.getDesc());
//        two.setClientReceive(ProgressBarNewEnum.CLIENT_SIGN_ALL.getDesc());
//        two.setConfirmationSign(ProgressBarNewEnum.CERTIFICATE_CONFIRM_ALL.getDesc());
//
//        progressBar.setCurrentStatus("three");
        System.out.println(JSON.toJSON(progressBar));
        System.out.println(JSON.toJSONString(progressBar));

        ArrayList<String> orderSn = new ArrayList<>();
        orderSn.add("1");
        orderSn.add("2");
        orderSn.add("3");
        orderSn.add("4");
        System.out.println(JSON.toJSON(orderSn));
        String o = "[\"1\",\"2\",\"3\",\"4\"]";
        List<String> strings = JSON.parseArray(o, String.class);
        System.out.println("Strings: " + strings);

        String s = JSON.toJSONString(orderSn);
        System.out.println("s: " + s);
        List<String> strings1 = JSON.parseArray(s, String.class);
        System.out.println("Strings1: " + strings1);
    }

    @Test
    public void test1() {
        StringBuilder builder = new StringBuilder();
        String s = "f81hg1hg08gh03";
        builder.append("123");
        builder.append(s);

        System.out.println(builder.toString());
        System.out.println(builder.toString());
    }

    @Test
    public void test2() {
        List<String> strings = null;
        for (String string : strings) {
            System.out.println(string);
        }
        System.out.println("finish");
    }
}
