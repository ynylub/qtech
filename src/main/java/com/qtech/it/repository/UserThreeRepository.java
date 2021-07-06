package com.qtech.it.repository;

import com.qtech.it.model.UserThree;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserThreeRepository extends JpaRepository<UserThree,Long> {

    // 根据 id 查询单个信息
    @Select("select * from newpeople_install where id = #{id}")
    UserThree findById(@Param("id") long id);

    void deleteById(Long id);
}
