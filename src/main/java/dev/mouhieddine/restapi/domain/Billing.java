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
public class Billing implements Serializable {
  private final static long serialVersionUID = 6577338081290507077L;
  private Card card;
  private Map<String, Object> additionalProperties = new HashMap<String, Object>();
}