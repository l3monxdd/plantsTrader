package com.plants.DTO;

import com.plants.entity.Author;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class SimpleUserDTO {

    private int id;

    private String fname;

    private String lname;

    public SimpleUserDTO(Author author) {
        this.id = author.getId();
        this.fname = author.getFname();
        this.lname = author.getLname();
    }

}
