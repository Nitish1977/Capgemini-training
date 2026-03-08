package com.example.SpringRestBookStore.service;

import com.example.SpringRestBookStore.dto.BookDto;
import com.example.SpringRestBookStore.entity.Book;
import org.modelmapper.ModelMapper;

public class BookService {
    private ModelMapper modelMapper;

    public BookDto createBook(BookDto dto){
        Book book = modelMapper.map(dto, Book.class);
        Book saved = repository.save(book);

        return  modelMapper.map(saved, BookDto.class);
    }

    public  BookDto updateBookByID(Long id, BookDto bookDto){


    }
}
