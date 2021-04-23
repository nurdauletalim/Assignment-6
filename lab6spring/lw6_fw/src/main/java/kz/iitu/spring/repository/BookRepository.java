package kz.iitu.spring.repository;

import kz.iitu.spring.entities.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BookRepository extends JpaRepository<Book, Integer> {
    List<Book> findByAvailable(boolean available);
    Book getById(int id);
}
