import java.util.Scanner;

import br.com.models.Rectangle;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite a altura do retangulo: ");
        double height = scanner.nextDouble();
        System.out.println("Digite a base do retangulo: ");
        double width = scanner.nextDouble();
        scanner.close();

        Rectangle rectangle = new Rectangle(width, height);

        System.out.println(rectangle);
        
    }
}
