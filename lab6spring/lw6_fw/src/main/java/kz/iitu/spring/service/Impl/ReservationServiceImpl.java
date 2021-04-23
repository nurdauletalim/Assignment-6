package kz.iitu.spring.service.Impl;

import kz.iitu.spring.entities.Book;
import kz.iitu.spring.entities.Reservation;
import kz.iitu.spring.entities.Users;
import kz.iitu.spring.repository.ReservationRepository;
import kz.iitu.spring.service.ReservationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.List;
import java.util.Scanner;

@Service
public class ReservationServiceImpl implements ReservationService {
    @Autowired
    private ReservationRepository reservationRepository;
    Scanner in = new Scanner(System.in);
    @Override
    public Reservation issueBook(Users user, Book book, int countDay) {

        DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
        Calendar cal = Calendar.getInstance();
        String curdate = dateFormat.format(cal.getTime());

        //System.out.println("Enter count of day: ");
        //int countDay = in.nextInt();

        //return date
        cal.add(Calendar.DATE, countDay);
        String returnData = dateFormat.format(cal.getTime());

        Reservation reservation  = new Reservation();
        reservation.setDateReturn(returnData);
        reservation.setDateIssue(curdate);
        reservation.setBook(book);
        reservation.setUser(user);
        reservationRepository.save(reservation);
        return (reservation);
    }

    @Override
    public List<Reservation> booksInBasket(Users user) {
        return (reservationRepository.findByUser(user));
    }

    @Override
    public List<Reservation> findAll() {
        return reservationRepository.findAll();
    }

    @Override
    public void returnBook(Users user, Book book) {
        reservationRepository.deleteByUserAndBook(user, book);
    }
}
