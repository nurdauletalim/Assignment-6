package kz.iitu.spring.service;

import kz.iitu.spring.entities.Book;

import java.util.List;

public interface BookService {
    List<Book> availableBooks();
    Book findById(int id);
    Book updateBook(Book book);
}
