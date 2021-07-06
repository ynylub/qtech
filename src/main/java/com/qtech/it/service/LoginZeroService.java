package com.qtech.it.service;

import com.qtech.it.model.UserZero;

public interface LoginZeroService {

    // 用户插入(注册)
    public void insertUserZero(UserZero user);

    // 用户查询
    public UserZero getUserZero(String username, String password);

}
