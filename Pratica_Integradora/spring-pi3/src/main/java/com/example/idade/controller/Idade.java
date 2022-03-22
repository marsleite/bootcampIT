package com.example.idade.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;

@RestController
@RequestMapping("/")
public class Idade {

  @GetMapping("{dia}/{mes}/{ano}")
  public Integer idadeFinal(@PathVariable String dia, @PathVariable String mes, @PathVariable String ano) {
    LocalDate dataNascimento = LocalDate.of(Integer.parseInt(ano), Integer.parseInt(mes), Integer.parseInt(dia));
    LocalDate dataAtual = LocalDate.now();

    Integer ida = dataAtual.getYear() - dataNascimento.getYear();

    return ida;
  }
}
