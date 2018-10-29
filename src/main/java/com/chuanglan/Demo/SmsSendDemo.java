package com.chuanglan.Demo;

import com.alibaba.fastjson.JSONObject;
import com.chuanglan.Util.SendByPost;

import java.util.HashMap;
import java.util.Map;

public class SmsSendDemo {
    public static void main(String[] args) {
        Map map = new HashMap();
        map.put("account","N4310605");
        map.put("password","yQ8heC4jsAacc3");
        map.put("msg","【253云通讯】您的验证码是123456");
        map.put("phone","15317652370");
        map.put("report","true");
        map.put("sendtime","");
        map.put("extend","");
        map.put("uid","");
        JSONObject js = (JSONObject) JSONObject.toJSON(map);
        System.out.println(SendByPost.sendSmsByPost("https://smssh1.253.com/msg/send/json",js.toString()));
    }
}
