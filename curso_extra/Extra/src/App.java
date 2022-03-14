public class App {
    public static void main(String[] args) throws Exception {
        exercicio001 info = new exercicio001();
        System.out.println("Products:");
        System.out.println(info.product1 + ", wich price is $ " + info.price );
        System.out.println(info.price2 + ", wich price is $ " + info.price2);
        System.out.println();
        System.out.println("Record: " + info.age + " years old");
    }
}
