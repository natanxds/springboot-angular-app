package com.gsb.usersapi.controller;

import com.gsb.usersapi.model.User;
import com.gsb.usersapi.repository.UserRepository;
import org.assertj.core.util.Arrays;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

@SpringBootTest
class UserControllerTest {

    @Autowired
    private UserController userController;

    @MockBean
    private UserRepository userRepository;

    @Test
    @DisplayName("Create a user should return 204 and create a user")
    void createUserShouldReturn200AndCreateANewUser() {

        //Given
        User user = new User(
                null,
                "Natan",
                "Silva"
        );

        //When
        ResponseEntity response = userController.createUser(user);

        //Then
        assertEquals(HttpStatus.CREATED.value(), response.getStatusCodeValue());
    }

    @Test
    @DisplayName("Find all users should return OK and all users")
    void findAllUsersShouldReturn200AndAllUsers() {
        //given
        List<User> userList = new ArrayList<>();
        userList.add(new User(null, "Natan", "Silva"));

        //when
        when(userRepository.findAll()).thenReturn(userList);
        ResponseEntity response = userController.findAllUsers();

        //then
        assertEquals(HttpStatus.OK.value(), response.getStatusCodeValue());
        assertEquals(response.getBody(), userList);
    }
}