package kz.iitu.spring.service;

import kz.iitu.spring.entities.Book;
import kz.iitu.spring.entities.Reservation;
import kz.iitu.spring.entities.Users;

import java.util.List;

public interface ReservationService {
    Reservation issueBook(Users user, Book book, int countDay);
    List<Reservation> booksInBasket(Users user);
    List<Reservation> findAll();
    void returnBook(Users user, Book book);
}
