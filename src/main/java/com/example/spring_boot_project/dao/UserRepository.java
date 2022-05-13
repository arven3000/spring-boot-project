package com.example.spring_boot_project.dao;

import com.example.spring_boot_project.dto.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface UserRepository extends JpaRepository<User, String> {
    @Query("SELECT u FROM User u")
    List<User> getAll();

    void deleteUserById(long id);

    User getUserById(long id);
}
