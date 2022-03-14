public class PraticaExcecoes {
  int a = 0;
  int b = 300;

  float razao = (float)b / a;

  public static void main(String[] args) {
    PraticaExcecoes p = new PraticaExcecoes();
    try {
      p.divide();
    } catch (ArithmeticException e) {
      System.out.println("Ocorreu um erro: " + e.getMessage());
    } finally {
      System.out.println("Programa finalizado!");
    }
  }

  private float divide() {
    return razao;
  }

}
