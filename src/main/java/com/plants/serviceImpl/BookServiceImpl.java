package com.plants.serviceImpl;

import com.plants.dao.BookDao;
import com.plants.entity.Book;
import com.plants.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookServiceImpl  implements BookService{

    @Autowired
    private BookDao bookDao;

    @Override
    public void save(Book book) {
        bookDao.save(book);
    }

    @Override
    public void update(Book book) {
        bookDao.save(book);
    }

    @Override
    public void delete(int id) {
        bookDao.delete(id);
    }

    @Override
    public List<Book> findAll() {
        return bookDao.findAll();
    }

    @Override
    public Book findOne(int id) {
        return bookDao.findOne(id);
    }
}
