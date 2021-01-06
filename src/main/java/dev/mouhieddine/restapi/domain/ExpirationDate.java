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
public class ExpirationDate implements Serializable {

  private final static long serialVersionUID = 4661228813349752965L;
  private String date;
  private Integer timezoneType;
  private String timezone;
  private Map<String, Object> additionalProperties = new HashMap<String, Object>();
}
