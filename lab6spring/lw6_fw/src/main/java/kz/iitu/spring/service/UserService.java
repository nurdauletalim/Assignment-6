package kz.iitu.spring.service;

import kz.iitu.spring.entities.Users;

public interface UserService {
    Users validationUser(String log, String pass);
    Users changePass(Users user, String newpass);
}
