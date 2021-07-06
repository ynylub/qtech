package com.qtech.it.service;

import com.qtech.it.model.UserOne;
import org.springframework.data.domain.Page;

import java.util.List;

public interface UserOneService {

    Page<UserOne> getUserList(int pageNum, int pageSize);

    public UserOne findUserById(long id);  // 查询单个 id

    public void save(UserOne userOne);  //增加，保存

    public void edit(UserOne userOne);  //修改

    public void delete(long id);     //删除

    List<UserOne> selectAll();        //查询
}
