package com.qtech.it.service;

import com.qtech.it.model.UserSeven;
import org.springframework.data.domain.Page;

import java.util.List;

public interface UserSevenService {

    Page<UserSeven> getUserList(int pageNum, int pageSize);

    public UserSeven findUserById(long id);        // 查询单个 id

    public void save(UserSeven userSeven);         //增加-保存

    public void edit(UserSeven userSeven);         //修改

    public void delete(long id);                  //删除

    List<UserSeven> selectAll();                   //查询
}
