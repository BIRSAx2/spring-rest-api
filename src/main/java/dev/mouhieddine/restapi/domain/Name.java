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
public class Name implements Serializable {

  private final static long serialVersionUID = 420620315591775395L;
  private String title;
  private String first;
  private String last;
  private Map<String, Object> additionalProperties = new HashMap<String, Object>();
}
