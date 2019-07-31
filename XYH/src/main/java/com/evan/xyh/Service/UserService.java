package com.evan.xyh.Service;

import com.evan.xyh.Bean.User;
import org.springframework.stereotype.Service;

public interface UserService {

    /**
     * 判断用户是否存在
     * @param username
     * @return
     */
    boolean isExist(String username);

    /**
     * 根据name获取User
     * @param username
     * @return
     */
    User getByName(String username);

    /**
     * 根据name和pwd获取user
     * @param username
     * @param password
     * @return
     */
    User get(String username, String password);

    /**
     * 添加user
     * @param user
     */
    void add(User user);

}
