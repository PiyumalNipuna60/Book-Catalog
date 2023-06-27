package com.DataIntimate.BookCatalog.service;

import com.DataIntimate.BookCatalog.dto.BookDto;
import com.DataIntimate.BookCatalog.model.Book;
import com.DataIntimate.BookCatalog.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BookServiceImpl implements BookService {

    @Autowired
    private BookRepository bookRepository;
    @Override
    public BookDto saveBook(BookDto book) {
        return bookRepository.save(book);
    }
}
