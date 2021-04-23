package kz.iitu.spring.service.Impl;

import kz.iitu.spring.entities.Users;
import kz.iitu.spring.repository.UserRepository;
import kz.iitu.spring.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Scanner;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserRepository userRepository;
    Scanner in = new Scanner(System.in);
    @Override
    public Users validationUser(String login, String pass) {
        Users user = userRepository.findByLoginAndPassword(login, pass);
        return user;
    }

    @Override
    public Users changePass(Users user, String newpass) {
        user.setPassword(newpass);
        return userRepository.saveAndFlush(user);
    }
}
