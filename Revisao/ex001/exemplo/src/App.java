import java.util.Scanner;

import br.com.exemplo.Rectangle;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Enter rectangle width and height");

        Scanner sc = new Scanner(System.in);
        Rectangle rectangle = new Rectangle();
        System.out.println("Enter with witdh: ");
        double w = sc.nextDouble();
        rectangle.setWidth(w);
        System.out.println("Enter with height: ");
        double h = sc.nextDouble();
        rectangle.setHeight(h);

        sc.close();

        System.out.println(rectangle);

    }
}
