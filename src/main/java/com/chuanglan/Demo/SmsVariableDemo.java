package com.chuanglan.Demo;

import com.alibaba.fastjson.JSONObject;
import com.chuanglan.Util.SendByPost;

import java.util.HashMap;
import java.util.Map;

public class SmsVariableDemo {
    public static void main(String[] args) {
        Map map = new HashMap();
        map.put("account","N*******");
        map.put("password","**********");
        map.put("msg","【253云通讯】尊敬的{$var},您的包裹编号{$var},已送达");
        map.put("params","153********,张先生,112;");
        map.put("report","true");
        map.put("sendtime","");
        map.put("extend","");
        map.put("uid","");
        JSONObject js = (JSONObject) JSONObject.toJSON(map);
        System.out.println(SendByPost.sendSmsByPost("https://xxx/msg/variable/json",js.toString()));
    }
}
