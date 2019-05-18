package ua.su.controllers;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/cats", produces = MediaType.APPLICATION_JSON_VALUE)
public class HelloWorld {

  @GetMapping
  public String hello() {
    return "Hello from me";
  }
}
