package com.luffy;

import com.alibaba.fastjson.JSON;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

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

    @Test
    public void test3() {
        String s = "[{\n" +
                "\t\"machine_sn\": \"9999901299\",\n" +
                "\t\"type_name\": \"综合机\",\n" +
                "\t\"zs_sn\": \"ZS-CS01\",\n" +
                "\t\"deal_date\": \"\",\n" +
                "\t\"transfer_monthly_rent_yuan\": \"\",\n" +
                "\t\"transfer_end_time\": \"\",\n" +
                "\t\"asset_photos_list\": [],\n" +
                "\t\"machine_kid_id\": 51389\n" +
                "}, {\n" +
                "\t\"machine_sn\": \"1037000001\",\n" +
                "\t\"type_name\": \"综合机\",\n" +
                "\t\"zs_sn\": \"ZS-CS01\",\n" +
                "\t\"deal_date\": \"2020-1-1\",\n" +
                "\t\"transfer_monthly_rent_yuan\": \"800\",\n" +
                "\t\"transfer_end_time\": \"2022-5-10\",\n" +
                "\t\"asset_photos_list\": [\"http://zongs-mall.oss-cn-hangzhou.aliyuncs.com/test/zongs/item/2020-05-26/8c65dfdf-cf3f-4be4-a3cf-579b05d8ef14.jpg\"],\n" +
                "\t\"machine_kid_id\": 51389\n" +
                "}]";

        List<TransferMachineListVO> transferMachineInfoList = JSON.parseArray(s, TransferMachineListVO.class);

        System.out.println(transferMachineInfoList);
    }

    @Test
    public void test4() {
        Map<Long, List<String>> map = new HashMap<>();
        List<String> stringList = new ArrayList<>();
        stringList.add("---null---");
        stringList.add("---null2---");
        map.put(null, stringList);
        map.put(1L, null);
        System.out.println(map.get(null));
        System.out.println(map.get(1));
    }

    @Test
    public void test5() {
        Long kidId = 415L;
        Long rentFee = null;
        String s = kidId + ":" + rentFee;
        String[] tokens = s.split(":");
        System.out.println(tokens[0]);
        if ("null".equals(tokens[1])) {
            System.out.println("token[1] is string null");
        }
    }

    @Test
    public void test6() {
        List<String> strings = new ArrayList<>();
        strings.add("hahaha");
        strings.add("hehehe");

        System.out.println("a" + strings.toString());
    }
}
