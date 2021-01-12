package dev.mouhieddine.restapi.domain;


import lombok.Data;

import java.util.HashMap;
import java.util.Map;

/**
 * @author : Mouhieddine.dev
 * @since : 1/12/2021, Tuesday
 **/

@Data
public class Address{
  public String street;
  public String suite;
  public String city;
  public String zipcode;
  public Geo geo;
}