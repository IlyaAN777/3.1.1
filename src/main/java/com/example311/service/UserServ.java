package com.example311.service;

import com.example311.model.User;

import java.util.List;

public interface UserServ {
    List<User> getAllUsers ();

    User getUserById(long id);

    void saveUser (User user);

    void deleteById(long id);

}
