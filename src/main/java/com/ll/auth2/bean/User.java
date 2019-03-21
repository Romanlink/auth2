package com.ll.auth2.bean;

import org.springframework.stereotype.Component;

import java.io.Serializable;

/**
 * @Author Roman.wang
 * @Date 2019/3/18 15:31
 **/
@Component
public class User implements Serializable {

    private String username;
    private String password;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
