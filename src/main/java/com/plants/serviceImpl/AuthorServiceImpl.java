package com.plants.serviceImpl;

import com.plants.dao.AuthorDao;
import com.plants.entity.Author;
import com.plants.service.AuthorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class AuthorServiceImpl implements AuthorService {

    @Autowired
    private AuthorDao authorDao;

    @Override
    public void save(Author author) {
        authorDao.save(author);
    }

    @Override
    public void update(Author author) {
        authorDao.save(author);
    }

    @Override
    public void delete(int id) {
        authorDao.delete(id);
    }

    @Override
    public Author findOne(int id) {
        return authorDao.findOne(id);
    }

    @Override
    public List<Author> findAll() {
        return authorDao.findAll();
    }
}
