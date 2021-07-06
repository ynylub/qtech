package com.qtech.it.repository;

import com.qtech.it.model.UserFive;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserFiveRepository extends JpaRepository<UserFive,Long> {

    // 根据 id 查询单个信息
    @Select("select * from printer_scrap where id = #{id}")
    UserFive findById(@Param("id") long id);

    // 根据 id 删除单个信息
    void deleteById(Long id);
}
