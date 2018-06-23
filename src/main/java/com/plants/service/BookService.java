package com.plants.service;

import com.plants.entity.Book;

import java.util.List;

public interface BookService {
    void save(Book book);

    void update(Book book);

    void delete(int id);

    List<Book>findAll();

    Book findOne(int id);
}
