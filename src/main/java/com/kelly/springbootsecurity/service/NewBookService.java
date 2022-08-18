package com.kelly.springbootsecurity.service;

import com.kelly.springbootsecurity.model.NewBook;

import java.util.List;

public interface NewBookService {

    Integer updateNewBook(NewBook entity);
    NewBook findById(Integer id);
    Integer saveNewBook(NewBook entity);
    Integer deleteById(Integer id);
    List<NewBook> findNewBook();
}
