package com.ll.auth2.bean;


import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.Collections;

/**
 * @Author Roman.wang
 * @Date 2019/3/18 15:32
 **/
public class CustomUserDetails extends User{

    private com.ll.auth2.bean.User user;

    public CustomUserDetails(com.ll.auth2.bean.User user) {
        super(user.getUsername(), user.getPassword(), true, true, true, true, Collections.EMPTY_SET);
        this.user = user;
    }

    public com.ll.auth2.bean.User getUser() {
        return user;
    }

    public void setUser(com.ll.auth2.bean.User user) {
        this.user = user;
    }
}
