package com.DataIntimate.BookCatalog.repository;

import com.DataIntimate.BookCatalog.dto.BookDto;
import com.DataIntimate.BookCatalog.model.Book;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface BookRepository extends JpaRepository<BookDto,Integer> {
    @Query(value = "select * from books where book_name=?1", nativeQuery = true)
    Book findByBookName(String bookName);

    @Query(value = "select * from books where book_id=?1", nativeQuery = true)
    Book findById(int bookId);

    @Query(value = "select * from books where book_name like %?1% and category like %?2%", nativeQuery = true)
    List<Book> booksFilter(String bookName, String category);
}
