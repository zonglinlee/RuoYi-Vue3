//package com.ruoyi.wechat.utils;
//
//import com.fasterxml.jackson.annotation.JsonCreator;
//import com.fasterxml.jackson.annotation.JsonProperty;
//import lombok.SneakyThrows;
//import org.springframework.security.authentication.AbstractAuthenticationToken;
//import org.springframework.security.core.SpringSecurityCoreVersion;
//
///**
// * 自定义微信认证token
// * @author kwj
// */
//public class WechatAuthenticationToken extends AbstractAuthenticationToken {
//
//    private static final long serialVersionUID = SpringSecurityCoreVersion.SERIAL_VERSION_UID;
//
//    private final Object principal;
//
//    public WechatAuthenticationToken(String mobile) {
//        super(null);
//        this.principal = mobile;
//        setAuthenticated(false);
//    }
//    @JsonCreator
//    public WechatAuthenticationToken(@JsonProperty("principal") Object principal,
//                                     @JsonProperty("authorities") Collection<? extends GrantedAuthority> authorities) {
//        super(authorities);
//        this.principal = principal;
//        super.setAuthenticated(true);
//    }
//
//    @Override
//    public Object getPrincipal() {
//        return this.principal;
//    }
//
//    @Override
//    public Object getCredentials() {
//        return null;
//    }
//
//    @Override
//    @SneakyThrows
//    public void setAuthenticated(boolean isAuthenticated) {
//        if (isAuthenticated) {
//            throw new IllegalArgumentException(
//                    "Cannot set this token to trusted - use constructor which takes a GrantedAuthority list instead");
//        }
//
//        super.setAuthenticated(false);
//    }
//
//    @Override
//    public void eraseCredentials() {
//        super.eraseCredentials();
//    }
//}