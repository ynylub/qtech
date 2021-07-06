package com.qtech.it.repository;

import com.qtech.it.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface UserRepository extends JpaRepository<User,Integer> {


    public User getByPasswordAndUsername(String username, String password);
}
