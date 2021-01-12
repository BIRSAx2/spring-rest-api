package dev.mouhieddine.restapi.domain;

import lombok.Data;

/**
 * @author : Mouhieddine.dev
 * @since : 1/12/2021, Tuesday
 **/
@Data
public class User {
  public int id;
  public String name;
  public String username;
  public String email;
  public Address address;
  public String phone;
  public String website;
  public Company company;
}