package br.com.springboot.controllers;

import java.time.LocalDate;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class Pratica1 {

  @GetMapping("{dia}/{mes}/{ano}")
  public String nascimento(@PathVariable int dia, @PathVariable int mes, @PathVariable int ano) {
    LocalDate dataAtual = LocalDate.now();
    LocalDate dataNascimento = LocalDate.of(ano, mes, dia);
    return String.valueOf(dataAtual.getYear() - dataNascimento.getYear());
  }
  
}
