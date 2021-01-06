package dev.mouhieddine.restapi.domain;

import lombok.Data;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

/**
 * @author : Mouhieddine.dev
 * @since : 1/6/2021, Wednesday
 **/

@Data
public class Location implements Serializable {

  private final static long serialVersionUID = -3532048267747973846L;
  private String street;
  private String city;
  private String state;
  private String postcode;
  private Map<String, Object> additionalProperties = new HashMap<String, Object>();
}
