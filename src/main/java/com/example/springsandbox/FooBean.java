package com.example.springsandbox;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Repository;

@Scope("prototype")
@Repository
public class FooBean {
  String foo = "foo from prototype FooBean";
}
