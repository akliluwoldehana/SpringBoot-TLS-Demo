package com.example.TLSdemo.Entity;

import lombok.Data;



@Data
@Entity
public class Book {

    @Id
    private long bookId;
    private String bookTitle;
    private String bookAuthor;
    private String bookPublisher;

}