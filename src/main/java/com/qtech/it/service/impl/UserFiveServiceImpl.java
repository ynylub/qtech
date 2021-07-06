package com.qtech.it.service.impl;

import com.qtech.it.model.UserFive;
import com.qtech.it.repository.UserFiveRepository;
import com.qtech.it.service.UserFiveService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserFiveServiceImpl implements UserFiveService {

    @Autowired
    private UserFiveRepository userFiveRepository;

    @Override
    public Page<UserFive> getUserList(int pageNum, int pageSize) {

        Sort sort = new Sort(Sort.Direction.DESC, "id");
        Pageable pageable = PageRequest.of(pageNum, pageSize, sort);
        Page<UserFive> users = userFiveRepository.findAll(pageable);

        return users;
    }

    @Override
    public UserFive findUserById(long id) {
        return userFiveRepository.findById(id);
    }

    @Override
    public void save(UserFive user) {
        userFiveRepository.save(user);
    }

    @Override
    public void edit(UserFive user) {
        userFiveRepository.save(user);
    }

    @Override
    public void delete(long id) {
        userFiveRepository.deleteById(id);
    }

    @Override
    public List<UserFive> selectAll() {
        return userFiveRepository.findAll();
    }
}
