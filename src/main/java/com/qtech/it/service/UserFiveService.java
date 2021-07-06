package com.qtech.it.service;

import com.qtech.it.model.UserFive;
import org.springframework.data.domain.Page;

import java.util.List;

public interface UserFiveService {

    Page<UserFive> getUserList(int pageNum, int pageSize);

    public UserFive findUserById(long id);      // 查询单个 id

    public void save(UserFive userFive);        //增加-保存

    public void edit(UserFive userFive);        //修改

    public void delete(long id);                //删除

    List<UserFive> selectAll();                  //查询
}
