package com.example.BookStore.entity;


import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.*;

@Entity
@Table(name = "Books")
@Getter // non-final & non-static
@Setter // non-final & non-static
@AllArgsConstructor
@NoArgsConstructor
@Data // it includes getter, setter, requiredArgConstructor, equals, hashcode, tostring.
public class Book {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;



    @NotBlank( message = "You must give Title of the Book")
    private  String title;
    @NotBlank(message = "You must give the Author name of the Book")
    private  String author;
    @NotNull(message = "Price should NotNull")
    private String price;
}
