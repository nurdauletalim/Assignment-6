package kz.iitu.spring.service.Impl;

import kz.iitu.spring.entities.Book;
import kz.iitu.spring.repository.BookRepository;
import kz.iitu.spring.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookServiceImpl implements BookService {
    @Autowired
    private BookRepository bookRepository;

    @Override
    public List<Book> availableBooks() {
        return ( bookRepository.findByAvailable(true) );
    }

    @Override
    public Book findById(int id) {
        return bookRepository.getById(id);
    }

    @Override
    public Book updateBook(Book book) {
        return bookRepository.saveAndFlush(book);
    }
}
