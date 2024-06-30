package com.ruoyi.wechat.controller;


import com.alibaba.fastjson2.JSON;
import com.alibaba.fastjson2.JSONObject;
import com.ruoyi.common.annotation.Anonymous;
import com.ruoyi.common.utils.http.HttpUtils;
import org.apache.http.client.utils.URIBuilder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.net.URI;

@RestController
@RequestMapping("/wechat")
@Anonymous
public class WeChatLoginController {
    @GetMapping("/sendLoginCode")
    public void sendLoginCode(@RequestParam("code") String code) throws Exception {
        String appid = "wx60a9282346f4e3c7";
        String secret = "081c9ff41f7584fe1bf5368a5eb25d50";
        String url = "https://api.weixin.qq.com/sns/jscode2session";
        URIBuilder uriBuilder = new URIBuilder(url);
        uriBuilder.addParameter("appid", appid);
        uriBuilder.addParameter("secret", secret);
        uriBuilder.addParameter("js_code", code);
        uriBuilder.addParameter("grant_type", "authorization_code");
        URI uri = uriBuilder.build();
        String result = HttpUtils.getCall(uri.toString());
        System.out.println(result);
        JSONObject jsonObject = JSON.parseObject(result);
        String sessionKey = (String) jsonObject.get("session_key");
        String openid = (String) jsonObject.get("openid");
        System.out.println(sessionKey);
        System.out.println(openid);
    }

}
