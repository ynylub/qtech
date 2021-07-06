package com.qtech.it.service.impl;



import com.qtech.it.model.UserOne;
import com.qtech.it.model.UserTwo;
import com.qtech.it.repository.UserTwoRepository;
import com.qtech.it.service.UserTwoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserTwoServiceImpl implements UserTwoService {

    @Autowired
    private UserTwoRepository userTwoRepository;


    @Override
    public Page<UserTwo> getUserList(int pageNum, int pageSize) {

        Sort sort = new Sort(Sort.Direction.DESC, "id");
        Pageable pageable = PageRequest.of(pageNum, pageSize, sort);
        Page<UserTwo> users = userTwoRepository.findAll(pageable);

        return users;
    }

    @Override
    public UserTwo findUserById(long id) {
        return userTwoRepository.findById(id);
    }

    @Override
    public void save(UserTwo user) {
        userTwoRepository.save(user);
    }

    @Override
    public void edit(UserTwo user) {
        userTwoRepository.save(user);
    }

    @Override
    public void delete(long id) {
        userTwoRepository.deleteById(id);
    }

    @Override
    public List<UserTwo> selectAll() {
        return userTwoRepository.findAll();
    }
}
