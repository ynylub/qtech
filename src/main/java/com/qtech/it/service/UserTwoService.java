package com.qtech.it.service;

import com.qtech.it.model.UserTwo;
import org.springframework.data.domain.Page;

import java.util.List;

public interface UserTwoService {

    Page<UserTwo> getUserList(int pageNum, int pageSize);

    public UserTwo findUserById(long id);  // 查询单个 id

    public void save(UserTwo userTwo);  //增加，保存

    public void edit(UserTwo userTwo);  //修改

    public void delete(long id);     //删除

    List<UserTwo> selectAll();        //查询
}
