package com.example.revisao.springdemo.controller;

import java.time.LocalDateTime;

import com.example.revisao.springdemo.entities.Client;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/clients")
public class ClientController {
  
  @GetMapping("/")
  @ResponseBody
  public String index() {
    Client c1 = new Client();
    c1.setId(1);
    c1.setFirstName("John");
    c1.setLastName("Doe");
    c1.setCreatedAt(LocalDateTime.now());
    return c1.toString();
  }
}
