package com.DataIntimate.BookCatalog.service;

import com.DataIntimate.BookCatalog.dto.BookDto;
import com.DataIntimate.BookCatalog.model.Book;

public interface BookService {
    public Book saveBook(BookDto dto);
}
