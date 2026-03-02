package com.example.SpringRestBookStore.dto;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import lombok.Data;


@Data
public class BookDto {
    @NotBlank(message = "Book should have title")
    private  String title;
    @NotBlank(message = "Book should have an author")
     private  String author;
    @NotBlank
    @Min( value = 100, message = "price should be 100 or more")
     private  double price;
}
