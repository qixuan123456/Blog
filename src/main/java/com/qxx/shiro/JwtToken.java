package com.qxx.shiro;

import org.apache.shiro.authc.AuthenticationToken;

/**
 * @author Xuan
 * Date: 2021/11/4
 * Time: 12:30
 */
public class JwtToken implements AuthenticationToken {

    private String token;

    public JwtToken(String jwt){
        this.token = jwt;
    }
    @Override
    public Object getPrincipal() {
        return token;
    }

    @Override
    public Object getCredentials() {
        return token;
    }
}
