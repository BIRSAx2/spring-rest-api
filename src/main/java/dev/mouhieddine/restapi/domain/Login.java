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
public class Login implements Serializable {

  private final static long serialVersionUID = 1041720428871730372L;
  private String username;
  private String password;
  private String md5;
  private String sha1;
  private String sha256;
  private Map<String, Object> additionalProperties = new HashMap<String, Object>();
}
