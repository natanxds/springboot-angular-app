package com.gsb.usersapi.service;

import com.gsb.usersapi.model.User;
import com.gsb.usersapi.repository.UserRepository;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
@Slf4j
public class UserService {

    private UserRepository userRepository;

    public ResponseEntity<Void> createUser(User user) {
        log.info("user created: {}", user);
        userRepository.save(user);
        return ResponseEntity.status(HttpStatus.CREATED).build();
    }

    public ResponseEntity<List<User>> findAllUsers() {
        log.info("users requested: {}", userRepository.findAll());
        return ResponseEntity.status(HttpStatus.OK).body(userRepository.findAll());
    }
}
