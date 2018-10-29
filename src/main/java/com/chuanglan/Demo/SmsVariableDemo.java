package com.chuanglan.Demo;

import com.alibaba.fastjson.JSONObject;
import com.chuanglan.Util.SendByPost;

import java.util.HashMap;
import java.util.Map;

public class SmsVariableDemo {
    public static void main(String[] args) {
        Map map = new HashMap();
        map.put("account","N4310605");
        map.put("password","yQ8heC4jsAacc3");
        map.put("msg","【253云通讯】您的工单编号{$var},已完成处理");
        map.put("params","15317652370,112;");
        map.put("report","true");
        map.put("sendtime","");
        map.put("extend","");
        map.put("uid","");
        JSONObject js = (JSONObject) JSONObject.toJSON(map);
        System.out.println(SendByPost.sendSmsByPost("https://smssh1.253.com/msg/variable/json",js.toString()));
    }
}
