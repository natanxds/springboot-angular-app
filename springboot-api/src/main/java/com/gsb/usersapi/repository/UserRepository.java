package com.gsb.usersapi.repository;


import com.gsb.usersapi.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
