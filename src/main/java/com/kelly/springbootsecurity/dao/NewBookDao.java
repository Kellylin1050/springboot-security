package com.kelly.springbootsecurity.dao;

import com.kelly.springbootsecurity.model.NewBook;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface NewBookDao {
    @Update("update NewBook set name=#{name},remark=#{remark} where id=#{id}")
    Integer updateNewBook(NewBook entity);
    @Select("select * from NewBook where id=#{id}")
    NewBook findById(Integer id);
    @Insert("insert into goods(name,remark,createdTime) values(#{name},#{remark},GETDate())")
    int insertNewBook(NewBook entity);
    /**
     *Delete based on ID
     * @param id
     * @return
     */
    @Delete("delete from goods where id=#{id}")
    int deleteById(Integer id);
    /**
     *Query all product information
     *@ return all products
     *There are two ways to define SQL mapping in the mybatis framework
     *1. Annotation (simple SQL mapping)
     *2. Using XML (realizing complex SQL mapping)
     */
    @Select("select * from goods")
    List<NewBook> findNewBook();
}
