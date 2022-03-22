package polimorfismo;

public class Main {
  public static void main(String[] args) {
    Mamifero a = new Mamifero();
    a.emitirSom();
    a.locomover();
    a.alimentar();
    a.setPeso(10);
    a.setMembro(4);
    a.setCor("Preto");
    System.out.println(a.getPeso());
    System.out.println(a.getMembro());
    System.out.println(a.getCor());

  }
}
