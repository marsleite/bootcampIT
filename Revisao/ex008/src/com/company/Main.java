package com.company;

import com.company.entity.Products;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a quantidade de produtos");
        int n = sc.nextInt();

        Products[] products = new Products[n];

        for (int i =0; i < n; i++) {
            sc.nextLine();
            String name = sc.nextLine();
            double price = sc.nextDouble();
            products[i] = new Products(name, price);
        }
        double sum = 0.0;
        for (int i = 0; i < n; i++) {
            sum += products[i].getPrice();
        }

        double avg = sum / n;
        System.out.printf("A média é: %.2f%n", avg);

        List<Products> list = Arrays.asList(products);
        // printar o nome dos produtos e o preço
        list.stream().forEach(p -> System.out.println(p.getName() + " - " + p.getPrice()));
        sc.close();
    }
}