package com.evan.xyh.Dao;

import com.evan.xyh.Bean.User;
import org.springframework.data.jpa.repository.JpaRepository;


public interface UserDao extends JpaRepository<User, Integer> {

    User findByUsername(String userName);

    User getByUsernameAndPassword(String userName, String passWord);
}
