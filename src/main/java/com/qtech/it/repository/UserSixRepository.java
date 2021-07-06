package com.qtech.it.repository;

import com.qtech.it.model.UserSix;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserSixRepository extends JpaRepository<UserSix,Long> {

    // 根据 id 查询单个信息
    @Select("select * from printer_first where id = #{id}")
    UserSix findById(@Param("id") long id);

    // 根据 id 删除单个信息
    void deleteById(Long id);
}
