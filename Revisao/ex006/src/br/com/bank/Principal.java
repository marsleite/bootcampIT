package br.com.bank;

import br.com.bank.entity.Account;

import java.util.Scanner;

public class Principal {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.println("Enter account number:");
    int account = sc.nextInt();
    System.out.println("Enter account holder");
    String name = sc.next();
    System.out.println("Is there an initial deposit (Y/N) ?");
    String initial = sc.next();

    if(initial.equals("y")) {
      System.out.println("Enter initial deposit value:");
      double value = sc.nextDouble();

      Account conta = new Account(account, name, value);

      System.out.println("Account data:");
      System.out.println("Account " + conta.getNumber() +
              ", Holder: " + conta.getHolderName() +
              ", balance: " + conta.getDepositAmount());
    } else {
      Account conta = new Account(account, name);

      System.out.println("Account data:");
      System.out.println("Account " + conta.getNumber() +
              ", Holder: " + conta.getHolderName() +
              ", balance: " + conta.getDepositAmount());
    }

    sc.close();
  }
}
