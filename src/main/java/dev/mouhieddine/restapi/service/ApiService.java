package dev.mouhieddine.restapi.service;

import dev.mouhieddine.restapi.domain.User;

import java.util.List;

/**
 * @author : Mouhieddine.dev
 * @since : 1/6/2021, Wednesday
 **/
public interface ApiService {
  List<User> getUsers();
}
