package com.qtech.it.service.impl;

import com.qtech.it.model.UserZero;
import com.qtech.it.repository.UserZeroRepository;
import com.qtech.it.service.LoginZeroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LoginZeroServiceImpl implements LoginZeroService {

    @Autowired
    private UserZeroRepository userZeroRepository;

    @Override
    public void insertUserZero(UserZero user) {
        userZeroRepository.save(user);
    }

    @Override
    public UserZero getUserZero(String username, String password) {
        return userZeroRepository.getByPasswordAndUsername(username,password);
    }

}
