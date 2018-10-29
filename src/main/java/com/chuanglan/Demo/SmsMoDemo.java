package com.chuanglan.Demo;

import com.alibaba.fastjson.JSONObject;
import com.chuanglan.Util.SendByPost;

import java.util.HashMap;
import java.util.Map;

public class SmsMoDemo {
    public static void main(String[] args) {
        Map map = new HashMap();
        map.put("account","N*******");
        map.put("password","**********");
        map.put("count",20);
        JSONObject js = (JSONObject) JSONObject.toJSON(map);
        System.out.println(SendByPost.sendSmsByPost("https://xxx/msg/pull/mo",js.toString()));
    }
}
