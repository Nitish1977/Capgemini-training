package com.example.SpringRestBookStore.controller;

import com.example.SpringRestBookStore.dto.BookDto;
import com.example.SpringRestBookStore.entity.Book;
import com.example.SpringRestBookStore.service.BookService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.RequestEntity;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("api/book")
public class BookController {

    @Autowired
    public BookService bookService;

    @PostMapping
    public RequestEntity<BookDto> createBook(@RequestBody @Valid BookDto dto){

    }
}
