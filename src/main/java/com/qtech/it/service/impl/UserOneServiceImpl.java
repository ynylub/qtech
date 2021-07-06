package com.qtech.it.service.impl;

import com.qtech.it.model.UserOne;
import com.qtech.it.repository.UserOneRepository;
import com.qtech.it.service.UserOneService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserOneServiceImpl implements UserOneService {

    @Autowired
    private UserOneRepository userOneRepository;

    @Override
    public Page<UserOne> getUserList(int pageNum, int pageSize) {

        Sort sort = new Sort(Sort.Direction.DESC, "id");
        Pageable pageable = PageRequest.of(pageNum, pageSize, sort);
        Page<UserOne> users = userOneRepository.findAll(pageable);

        return users;
    }

    @Override
    public UserOne findUserById(long id) {
        return userOneRepository.findById(id);
    }

    @Override
    public void save(UserOne user) {
        userOneRepository.save(user);
    }

    @Override
    public void edit(UserOne user) {
        userOneRepository.save(user);
    }

    @Override
    public void delete(long id) {
        userOneRepository.deleteById(id);
    }

    @Override
    public List<UserOne> selectAll() {
        return userOneRepository.findAll();
    }
}
