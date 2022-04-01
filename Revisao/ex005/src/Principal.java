import br.com.convert.CurrencyConverter;

import java.math.BigDecimal;
import java.util.Scanner;

public class Principal {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("What is the dollar price? ");
    BigDecimal cambio = scanner.nextBigDecimal();
    System.out.println("How many dollars will be bought? ");
    BigDecimal dolar = scanner.nextBigDecimal();

    scanner.close();

    System.out.println();
    System.out.print("Amount to be paid in reais = " + CurrencyConverter.convert(cambio, dolar));
  }
}
