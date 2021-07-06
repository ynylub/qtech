package com.qtech.it.service.impl;

import com.qtech.it.model.User;
import com.qtech.it.repository.UserRepository;
import com.qtech.it.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LoginServiceImpl implements LoginService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public void insertUser(User user) {
        userRepository.save(user);
    }

    @Override
    public User getUser(String username, String password) {
        return userRepository.getByPasswordAndUsername(username,password);
    }

}
