package com.qtech.it.repository;

import com.qtech.it.model.UserTwo;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserTwoRepository extends JpaRepository<UserTwo,Long> {

    // 根据 id 查询单个信息
    @Select("select * from user_two where id = #{id}")
    UserTwo findById(@Param("id") long id);

    void deleteById(Long id);
}
