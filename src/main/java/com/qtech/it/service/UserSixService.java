package com.qtech.it.service;

import com.qtech.it.model.UserSix;
import org.springframework.data.domain.Page;

import java.util.List;

public interface UserSixService {

    Page<UserSix> getUserList(int pageNum, int pageSize);

    public UserSix findUserById(long id);      // 查询单个 id

    public void save(UserSix userSix);        //增加-保存

    public void edit(UserSix userSix);        //修改

    public void delete(long id);                //删除

    List<UserSix> selectAll();                  //查询
}
