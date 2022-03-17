package br.meli.springdemo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MyController {

  @GetMapping("/ping")
  @ResponseBody
  public String ping() {
    return "Pong";
  }
}
