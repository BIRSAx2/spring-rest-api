package dev.mouhieddine.restapi.config;

import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * @author : Mouhieddine.dev
 * @since : 1/6/2021, Wednesday
 **/

@Configuration
public class RestTemplateConfig {
  @Bean
  public RestTemplate restTemplate(RestTemplateBuilder restTemplateBuilder) {
    return restTemplateBuilder.build();
  }
}
