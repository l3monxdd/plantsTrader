package com.plants.controller;


import com.plants.DTO.SimpleUserDTO;
import com.plants.entity.Author;
import com.plants.request.UpdateAuthorName;
import com.plants.service.AuthorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/author")
public class AuthorController {
    @Autowired
    private AuthorService authorService;

    @GetMapping()
    public List<Author> some () {
        return authorService.findAll();
    }

    @PostMapping()
    public List<Author> saveAuthor(@RequestBody Author author){
        authorService.save(author);
        return authorService.findAll();
    }

    @DeleteMapping("/{idAuthor}")
    public List<Author> deleteAuthor(@PathVariable int idAuthor){
        authorService.delete(idAuthor);
        return authorService.findAll();
    }



    @PutMapping()
    public List<Author> update(@RequestBody Author author){
        authorService.update(author);
        return authorService.findAll();
    }

    @PutMapping("/updateName")
    // на даному моменті ми отримали конвертований json в pojo з назвою updateAuthorName
    public Author updateAuthorName(@RequestBody UpdateAuthorName updateAuthorName){
        //далі ми витягнули з бази автора за айдішкою
        Author author = authorService.findOne(updateAuthorName.getId());
        //сетаємо дані в автора з updateAuthorName
        author.setFname(updateAuthorName.getFName());

        return author;
    }



    @GetMapping("/getSimplifiedAuthor/{id}")
    public SimpleUserDTO getSimpleUser (@PathVariable int id){

        Author author = authorService.findOne(id);

//        SimpleUserDTO simpleUserDTO = new SimpleUserDTO(author);


        return new SimpleUserDTO(author);
    }


}
