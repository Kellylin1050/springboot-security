package com.kelly.springbootsecurity.dao;

import com.kelly.springbootsecurity.model.User;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface UserDao {

    @Insert("insert into users(email,user_name,password,enabled) values(#{email},#{user_name},#{password},#{enabled},GETDate())")
    int insertUser(User entity);

    @Update("update users set Email=#{email},#{user_name},#{password},#{enabled} where id=#{id}")
    Integer updateUser(User entity);

    @Select("select * from users where id=#{id}")
    User findById(Integer id);

    @Delete("delete from users where id=#{id}")
    int deleteById(Integer id);

    @Select("select * from users")
    List<User> findUser();
}
