import java.util.Scanner;

public class ex007 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Digite a quantidade de unidade");
    int n = sc.nextInt();
    double[] vect = new double[n];

    for (int i = 0; i < n; i++) {
      System.out.println("Digite a nota");
      vect[i] = sc.nextDouble();
    }

    double sum = 0.0;
    for (int i = 0; i < n; i++) {
      sum += vect[i];
    }

    double avg = sum / n;

    System.out.printf("A média é: %.2f%n", avg);
    if (avg <= 6.9) {
      System.out.println("Aluno reprovado");
    } else {
      System.out.println("Aluno aprovado");
    }

    sc.close();
  }
}
