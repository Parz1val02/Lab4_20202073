package com.example.lab4_20202073.Repository;

import com.example.lab4_20202073.Entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface UserRepository extends JpaRepository<User, Integer> {
    @Query(value = "select * from user where email=?1 and password=?2",
            nativeQuery = true)
    User Inicio(String correo, String contrasena);
}
