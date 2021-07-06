package com.qtech.it.service;

import com.qtech.it.model.UserFour;
import org.springframework.data.domain.Page;

import java.util.List;

public interface UserFourService {

    Page<UserFour> getUserList(int pageNum, int pageSize);

    public UserFour findUserById(long id);      // 查询单个 id

    public void save(UserFour userFour);        //增加，保存

    public void edit(UserFour userFour);        //修改

    public void delete(long id);                //删除

    List<UserFour> selectAll();                  //查询
}
