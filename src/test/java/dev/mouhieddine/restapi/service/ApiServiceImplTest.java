package dev.mouhieddine.restapi.service;

import dev.mouhieddine.restapi.domain.User;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * @author : Mouhieddine.dev
 * @since : 1/12/2021, Tuesday
 **/

@ExtendWith(SpringExtension.class)
@SpringBootTest
class ApiServiceImplTest {
  @Autowired
  ApiService apiService;

  @BeforeEach
  void setUp() {

  }

  @Test
  void getUsers() {
    List<User> users = apiService.getUsers();
    assertEquals(10, users.size());
  }
}