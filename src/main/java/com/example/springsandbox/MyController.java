package com.example.springsandbox;

import java.util.Map;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {

  @Value("${some.property:default value}")
  private String someProperty;

  @GetMapping("/hello")
  public Map<String, String> hello(@Value("${my.property:my default value}") String myProperty) {
    return Map.of("myProperty", myProperty, "someProperty", someProperty);
  }

}
