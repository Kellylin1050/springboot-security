package com.kelly.springbootsecurity.service.impl;

import com.kelly.springbootsecurity.dao.UserDao;
import com.kelly.springbootsecurity.model.User;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    private static final Logger log= LoggerFactory.getLogger(UserServiceImpl.class);
    @Autowired
    private UserDao userDao;
    @Override
    public Integer updateUser(User entity) {
        return userDao.updateUser(entity);
    }

    @Override
    public User findById(Integer id) {
        return userDao.findById(id);
    }

    @Override
    public Integer saveUser(User entity) {
        return userDao.insertUser(entity);
    }

    @Override
    public Integer deleteById(Integer id) {
        int row=userDao.deleteById(id);
        return row;
    }

    @Override
    public List<User> findUser() {
        long t1=System.currentTimeMillis();
        List<User> userList = userDao.findUser();
        long t2=System.currentTimeMillis();
        log.info ("findUser time-> {}", t2-t1);
        return userList;

    }
}