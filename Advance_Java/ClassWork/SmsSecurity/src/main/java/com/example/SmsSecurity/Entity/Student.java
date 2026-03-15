package com.example.SmsSecurity.Entity;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "Students")
public class Student {

    @Id
    @GeneratedValue( strategy = GenerationType.IDENTITY)
    private Long id;

    private  String name;
    private  String email;
    private String course;
    private float marks;

    @Lob
    private byte[] ProfileImg;

    @Lob
    private  byte[] assignmentFile;
}
