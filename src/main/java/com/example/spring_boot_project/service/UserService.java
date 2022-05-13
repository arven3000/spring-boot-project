package com.example.spring_boot_project.service;



import com.example.spring_boot_project.dto.User;

import java.util.List;

public interface UserService {
    void add(User user);

    List<User> listUsers();

    User getUserById(long id);

    void updateUser(User user);

    void deleteUser(long id);
}
