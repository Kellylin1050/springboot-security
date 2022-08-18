package com.kelly.springbootsecurity.dao;

import com.kelly.springbootsecurity.model.NewBook;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface NewBookDao {
    @Update("update new_book set Title=#{title},=#{call_Number} =#{barcode} =#{exh_fr} =#{exh_end} =#{revise_date} =#{act_yn} where id=#{id}")
    Integer updateNewBook(NewBook entity);
    @Select("select * from new_book where id=#{id}")
    NewBook findById(Integer id);
    @Insert("insert into new_book(title,author,call_Number,barcode,exh_fr,exh_end,revise_date,act_yn) " +
            "values(#{title} #{call_Number} #{barcode} #{exh_fr} #{exh_end} #{revise_date} #{act_yn},GETDate())")
    int insertNewBook(NewBook entity);

    @Delete("delete from new_book where id=#{id}")
    int deleteById(Integer id);

    @Select("select * from new_book")
    List<NewBook> findNewBook();
}
