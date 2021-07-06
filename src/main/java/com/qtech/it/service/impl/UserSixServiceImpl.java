package com.qtech.it.service.impl;

import com.qtech.it.model.UserSix;
import com.qtech.it.repository.UserSixRepository;
import com.qtech.it.service.UserSixService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserSixServiceImpl implements UserSixService {

    @Autowired
    private UserSixRepository userSixRepository;

    @Override
    public Page<UserSix> getUserList(int pageNum, int pageSize) {

        Sort sort = new Sort(Sort.Direction.DESC, "id");
        Pageable pageable = PageRequest.of(pageNum, pageSize, sort);
        Page<UserSix> users = userSixRepository.findAll(pageable);

        return users;
    }

    @Override
    public UserSix findUserById(long id) {
        return userSixRepository.findById(id);
    }

    @Override
    public void save(UserSix user) {
        userSixRepository.save(user);
    }

    @Override
    public void edit(UserSix user) {
        userSixRepository.save(user);
    }

    @Override
    public void delete(long id) {
        userSixRepository.deleteById(id);
    }

    @Override
    public List<UserSix> selectAll() {
        return userSixRepository.findAll();
    }
}
