package br.com.springboot.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/users")
public class UserController {
  
  @GetMapping("/")
  public String index() {
    return "go Meli Go!";
  }

  @GetMapping("/login")
  public String login() {
    return "login";
  }
  
}
