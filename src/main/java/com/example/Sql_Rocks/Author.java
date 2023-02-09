package com.example.Sql_Rocks;

import jakarta.persistence.*;

@Entity
@Table(name="author")
public class Author {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String name;

    private String booksWritten;

    private String country;

    private int age;

    public Author() {
    }


}
