package com.plants.controller;

import com.plants.entity.Author;
import com.plants.entity.Book;
import com.plants.request.UpdateBookAuthor;
import com.plants.service.AuthorService;
import com.plants.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/book")
@RestController
public class BookController {

    @Autowired
    private BookService bookService;

    @Autowired
    private AuthorService authorService;

    @PostMapping()
    public Book addBook(@RequestBody Book book) {
        bookService.save(book);
        return bookService.findOne(book.getId());
    }

    @GetMapping()
    public List<Book> getAll() {
        return bookService.findAll();
    }

    @PutMapping()
    public Book update(@RequestBody UpdateBookAuthor updateBookAuthor) {
        Book book = bookService.findOne(updateBookAuthor.getId());
        book.getAuthor().setId(updateBookAuthor.getIdAuthor());
//        Author author = authorService.findOne(updateBookAuthor.getIdAuthor());
//        book.setAuthor(author);
        bookService.update(book);
        return bookService.findOne(book.getId());
    }

    @GetMapping("/{id}")
    public Book getBook (@PathVariable int id){
        return bookService.findOne(id);
    }
}
