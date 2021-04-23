package kz.iitu.spring.repository;

import kz.iitu.spring.entities.Book;
import kz.iitu.spring.entities.Reservation;
import kz.iitu.spring.entities.Users;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ReservationRepository extends JpaRepository<Reservation, Integer> {
    List<Reservation> findByUser(Users user);
    void deleteByUserAndBook(Users user, Book book);
}
