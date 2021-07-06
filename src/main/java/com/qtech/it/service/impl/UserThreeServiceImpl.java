package com.qtech.it.service.impl;



import com.qtech.it.model.UserThree;
import com.qtech.it.repository.UserThreeRepository;
import com.qtech.it.service.UserThreeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserThreeServiceImpl implements UserThreeService {

    @Autowired
    private UserThreeRepository userThreeRepository;

    @Override
    public Page<UserThree> getUserList(int pageNum, int pageSize) {

        Sort sort = new Sort(Sort.Direction.DESC, "id");
        Pageable pageable = PageRequest.of(pageNum, pageSize, sort);
        Page<UserThree> users = userThreeRepository.findAll(pageable);

        return users;
    }

    @Override
    public UserThree findUserById(long id) {
        return userThreeRepository.findById(id);
    }

    @Override
    public void save(UserThree user) {
        userThreeRepository.save(user);
    }

    @Override
    public void edit(UserThree user) {
        userThreeRepository.save(user);
    }

    @Override
    public void delete(long id) {
        userThreeRepository.deleteById(id);
    }

    @Override
    public List<UserThree> selectAll() {
        return userThreeRepository.findAll();
    }
}
