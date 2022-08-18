package com.kelly.springbootsecurity.service.impl;

import com.kelly.springbootsecurity.model.NewBook;
import com.kelly.springbootsecurity.model.User;

import java.util.List;

public interface UserService {

    Integer updateUser(User entity);

    User findById(Integer id);
    Integer saveUser(User entity);
    Integer deleteById(Integer id);
    List<User> findUser();

}
