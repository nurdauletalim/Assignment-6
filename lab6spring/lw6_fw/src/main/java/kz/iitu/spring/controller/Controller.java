package kz.iitu.spring.controller;

import kz.iitu.spring.service.BookService;
import kz.iitu.spring.service.ReservationService;
import kz.iitu.spring.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/controller")
public class Controller {
    @Autowired
    private BookService bookService;

    @Autowired
    private ReservationService reservationService;

    @Autowired
    private UserService userService;
//
//    @GetMapping("/validation")
//    public Users validationUser(@RequestParam String log,
//                                @RequestParam String pass) {
//        return userService.validationUser(log, pass);
//    }
//
//    @GetMapping("/availablebooks")
//    public List<Book> availableBooks() {
//         return bookService.availableBooks();
//    }

//    public void issueBook(Users user, Book book){
//        reservationService.issueBook(user, book, 3);
//        book.setAvailable(false);
//        bookService.updateBook(book);
//    }
//    @GetMapping("/{id}")
//    public Book getById(@PathVariable int id) {
//       return bookService.findById(id);
//    }

//    public void booksInBasket(Users user){
//        reservationService.booksInBasket(user);//   }

//    @GetMapping("/all")
//    public List<Reservation> findAll() {
//        return reservationService.findAll();
//    }

//    public void returnBook(Users users, Book book){
//        reservationService.returnBook(users, book);
//    }
//
//    public void returnBook2(Users users, Book book){
//        reservationService.returnBook(users, book);
//    }
}
