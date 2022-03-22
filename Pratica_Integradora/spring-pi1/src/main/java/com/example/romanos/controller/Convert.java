package com.example.romanos.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Convert {

  @GetMapping("/romano/{numero}")
  public String convertToRomano(@PathVariable int numero) {
    // convertendo para romano
    return numberToRomain(numero);
  }

  // convertendo numero para romano
  public String numberToRomain(int numero) {
    int[] numeros = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
    String[] romanos = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};
    StringBuilder romano = new StringBuilder();
    int i = 0;
    while (numero > 0) {
      if (numero >= numeros[i]) {
        numero -= numeros[i];
        romano.append(romanos[i]);
      } else {
        i++;
      }
    }
    return romano.toString();
  }

}
