package com.ruoyi.wechat.domain;

import lombok.Data;

import java.io.Serializable;
import java.time.LocalDateTime;

@Data
public class WeChatUser implements Serializable {
    private Long id;
    private String openid;
    private String name;
    private String phone;
    private String sex;
    private String avatar;
    private LocalDateTime createTime;
}
