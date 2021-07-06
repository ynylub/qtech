package com.qtech.it.service;

import com.qtech.it.model.User;

import java.util.List;

public interface LoginService {

    // 用户插入(注册)
    public void insertUser(User user);

    // 用户查询
    public User getUser(String username, String password);

}
