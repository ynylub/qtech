package com.qtech.it.service.impl;

import com.qtech.it.model.UserSeven;
import com.qtech.it.repository.UserSevenRepository;
import com.qtech.it.service.UserSevenService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserSevenServiceImpl implements UserSevenService {

    @Autowired
    private UserSevenRepository userSevenRepository;

    @Override
    public Page<UserSeven> getUserList(int pageNum, int pageSize) {

        Sort sort = new Sort(Sort.Direction.DESC, "id");
        Pageable pageable = PageRequest.of(pageNum, pageSize, sort);
        Page<UserSeven> users = userSevenRepository.findAll(pageable);

        return users;
    }

    @Override
    public UserSeven findUserById(long id) {
        return userSevenRepository.findById(id);
    }

    @Override
    public void save(UserSeven user) {
        userSevenRepository.save(user);
    }

    @Override
    public void edit(UserSeven user) {
        userSevenRepository.save(user);
    }

    @Override
    public void delete(long id) {
        userSevenRepository.deleteById(id);
    }

    @Override
    public List<UserSeven> selectAll() {
        return userSevenRepository.findAll();
    }
}
