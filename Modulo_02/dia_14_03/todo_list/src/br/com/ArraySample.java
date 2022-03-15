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

    int i;
    System.out.println("Percorrendo o ArrayList");
    int n = agenda.size();

    for (i = 0; i < n; i++) {
      System.out.printf("Posição %d- %s\n", i, agenda.get(i));
    }
  }
}
