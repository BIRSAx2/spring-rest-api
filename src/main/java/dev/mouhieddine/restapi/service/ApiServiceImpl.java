package dev.mouhieddine.restapi.service;

import dev.mouhieddine.restapi.domain.User;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;
import java.util.List;

/**
 * @author : Mouhieddine.dev
 * @since : 1/6/2021, Wednesday
 **/

@Service
public class ApiServiceImpl implements ApiService {

  private RestTemplate restTemplate;

  public ApiServiceImpl(RestTemplate restTemplate) {
    this.restTemplate = restTemplate;
  }

  @Override
  public List<User> getUsers() {
    User[] users = restTemplate.getForObject("https://jsonplaceholder.typicode.com/users", User[].class);
    return Arrays.asList(users);
  }
}
