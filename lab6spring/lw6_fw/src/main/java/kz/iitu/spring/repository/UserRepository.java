package kz.iitu.spring.repository;

import kz.iitu.spring.entities.Users;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<Users, Integer> {
    Users findByLoginAndPassword(String login, String password);
}
