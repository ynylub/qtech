package com.qtech.it.service.impl;



import com.qtech.it.model.UserFour;
import com.qtech.it.repository.UserFourRepository;
import com.qtech.it.service.UserFourService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserFourServiceImpl implements UserFourService {

    @Autowired
    private UserFourRepository userFourRepository;

    @Override
    public Page<UserFour> getUserList(int pageNum, int pageSize) {

        Sort sort = new Sort(Sort.Direction.DESC, "id");
        Pageable pageable = PageRequest.of(pageNum, pageSize, sort);
        Page<UserFour> users = userFourRepository.findAll(pageable);

        return users;
    }

    @Override
    public UserFour findUserById(long id) {
        return userFourRepository.findById(id);
    }

    @Override
    public void save(UserFour user) {
        userFourRepository.save(user);
    }

    @Override
    public void edit(UserFour user) {
        userFourRepository.save(user);
    }

    @Override
    public void delete(long id) {
        userFourRepository.deleteById(id);
    }

    @Override
    public List<UserFour> selectAll() {
        return userFourRepository.findAll();
    }
}
