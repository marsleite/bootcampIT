package com.company;

import java.math.BigDecimal;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a quantidade de produtos");
        int n = sc.nextInt();

        double[] products = new double[n];

        for (int i = 0; i < n; i++){
            products[i] = sc.nextDouble();
        }

        double sum = 0.0;
        for (int i = 0; i < n; i++) {
            sum += products[i];
        }

        double avg = sum / n;

        System.out.printf("A média dos produtos é: %.2f%n", avg);
        sc.close();
    }
}
