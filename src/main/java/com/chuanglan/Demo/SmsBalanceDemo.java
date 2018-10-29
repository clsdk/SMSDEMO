package com.chuanglan.Demo;

import com.alibaba.fastjson.JSONObject;
import com.chuanglan.Util.SendByPost;

import java.util.HashMap;
import java.util.Map;

public class SmsBalanceDemo {
    public static void main(String[] args) {
        Map map = new HashMap();
        map.put("account","N4310605");
        map.put("password","yQ8heC4jsAacc3");
        JSONObject js = (JSONObject) JSONObject.toJSON(map);
        System.out.println(SendByPost.sendSmsByPost("https://smssh1.253.com/msg/balance/json",js.toString()));
    }
}
