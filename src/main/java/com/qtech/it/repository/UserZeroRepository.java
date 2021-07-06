package com.qtech.it.repository;

import com.qtech.it.model.UserZero;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserZeroRepository extends JpaRepository<UserZero,Integer> {


    public UserZero getByPasswordAndUsername(String username, String password);
}
