package com.DataIntimate.BookCatalog.controller;

import com.DataIntimate.BookCatalog.model.Book;
import com.DataIntimate.BookCatalog.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/book")
public class BookController {

    @Autowired
    private BookService bookService;

    @PostMapping("/add")
    public String add(@RequestBody Book book){
        bookService.saveBook(book);
        return "New Student Added..!";
    }
}
