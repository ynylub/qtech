package com.qtech.it.service;

import com.qtech.it.model.UserThree;
import org.springframework.data.domain.Page;

import java.util.List;

public interface UserThreeService {

    Page<UserThree> getUserList(int pageNum, int pageSize);

    public UserThree findUserById(long id);   // 查询单个 id

    public void save(UserThree userThree);    //增加，保存

    public void edit(UserThree userThree);    //修改

    public void delete(long id);              //删除

    List<UserThree> selectAll();               //查询
}
