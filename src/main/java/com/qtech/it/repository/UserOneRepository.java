package com.qtech.it.repository;

import com.qtech.it.model.UserOne;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.data.jpa.repository.JpaRepository;

import javax.persistence.Table;

public interface UserOneRepository extends JpaRepository<UserOne,Long> {

    // 根据 id 查询单个信息
    @Select("select * from user_two where id = #{id}")
    UserOne findById(@Param("id") long id);

    void deleteById(Long id);
}
