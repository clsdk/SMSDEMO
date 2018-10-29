package com.chuanglan.Demo;

import com.alibaba.fastjson.JSONObject;
import com.chuanglan.Util.SendByPost;

import java.util.HashMap;
import java.util.Map;

public class SmsSendDemo {
    public static void main(String[] args) {
        Map map = new HashMap();
        map.put("account","N******");
        map.put("password","**********");
        map.put("msg","【253云通讯】您的验证码是123456");
        map.put("phone","153********");
        map.put("report","true");
        map.put("sendtime","");
        map.put("extend","");
        map.put("uid","");
        JSONObject js = (JSONObject) JSONObject.toJSON(map);
        System.out.println(SendByPost.sendSmsByPost("https://xxx/msg/send/json",js.toString()));
    }
}
