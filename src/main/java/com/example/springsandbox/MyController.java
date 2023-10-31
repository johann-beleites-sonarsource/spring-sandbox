package com.example.springsandbox;

import java.util.Map;
import javax.inject.Inject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {

  @Value("${some.property:default value}")
  private String someProperty;

  @Inject
  private FooBean fooBean2;

  @GetMapping("/hello")
  public Map<String, String> hello(@Value("${my.property:my default value}") String myProperty, @Autowired FooBean fooBean) {
    return Map.of("myProperty", myProperty, "someProperty", someProperty, "fooBean", fooBean.foo, "fooBean2", fooBean2.foo);
  }

}
