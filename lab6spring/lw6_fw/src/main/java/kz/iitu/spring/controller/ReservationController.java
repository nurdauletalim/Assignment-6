package kz.iitu.spring.controller;

import kz.iitu.spring.entities.Book;
import kz.iitu.spring.entities.Reservation;
import kz.iitu.spring.entities.Users;
import kz.iitu.spring.service.ReservationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("reservation")
public class ReservationController {
    @Autowired
    private ReservationService reservationService;

    @GetMapping("/all")
    public List<Reservation> findAll() {
        return reservationService.findAll();
    }
    @GetMapping("/returnbook")
    public void returnBook(@RequestBody Users users,
                           @RequestBody Book book){
        reservationService.returnBook(users, book);
    }

}
