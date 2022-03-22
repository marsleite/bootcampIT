package br.com.praticaIntegradora.romanos.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class Mycontroller {

  @GetMapping("/hello")
  @ResponseBody
  public String ping() {
    return "hello world meli people";
  }

  @GetMapping("/")
  @ResponseBody
  public String index() {
    return "index";
  }

  @GetMapping("/convert/{numero}")
  @ResponseBody
  public String convert(String numero) {
    if (numero == "5") {
      return "V";
    } else if (numero == "10") {
      return "X";
    } else if (numero == "50") {
      return "L";
    } else if (numero == "100") {
      return "C";
    } else if (numero == "500") {
      return "D";
    } else if (numero == "1000") {
      return "M";
    } else {
      return "deu ruim";
    }
  }
}
