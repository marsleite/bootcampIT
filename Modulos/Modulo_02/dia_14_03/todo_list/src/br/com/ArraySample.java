package br.com;

import java.util.ArrayList;
import java.util.Scanner;

public class ArraySample {
  public static void main(String[] args) {
    Scanner ler = new Scanner(System.in);

    ArrayList<String> agenda = new ArrayList<>();

    agenda.add("Juca Bala; 11 1111-11" );
    agenda.add("Marcelo; 7198787-2907");
    agenda.add("Maria Antonieta; 44-444-444");
    agenda.add("Rebeca Leite; 55-8555-2572");

    System.out.println("Percorrendo o ArrayList");

    agenda.forEach(data -> System.out.println(data));
  }
}
