package com.ll.auth2.service.impl;

import com.ll.auth2.bean.CustomUserDetails;
import com.ll.auth2.bean.User;
import com.ll.auth2.service.UserService;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

/**
 * @Author Roman.wang
 * @Date 2019/3/18 15:37
 **/
@Service
public class UserServiceImpl implements UserService {

    @Override
    public UserDetails loadUserByUsername(String s) throws UsernameNotFoundException {

        System.out.println("===================获取到token已进入自定义验证："+ s );
        User user = new User();
        user.setUsername("1111");
        user.setPassword("22223");
        return new CustomUserDetails(user);
    }
}
