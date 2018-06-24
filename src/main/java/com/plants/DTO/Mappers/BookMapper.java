package com.plants.DTO.Mappers;

import com.plants.DTO.BookDTO;
import com.plants.entity.Book;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;
import org.mapstruct.factory.Mappers;

@Mapper
public interface BookMapper {

    BookMapper INSTANCE = Mappers.getMapper(BookMapper.class);

    @Mappings({
            @Mapping(target = "lname", source = "author.lname"),
            @Mapping(target = "email", source = "author.email")
    })


    BookDTO bookToBookDTO(Book book);
}
