package polimorfismo;

public class Mamifero extends Animal{
  @Override
  public void emitirSom() {
    System.out.println("Mamifero emitindo som");
  }

  @Override
  public void locomover() {
    System.out.println("Mamifero correndo");
  }

  @Override
  public void alimentar() {
    System.out.println("Mamifero comendo");
  }
  
  //getters and setters
  public int getPeso() {
    return peso;
  }

  public void setPeso(int peso) {
    this.peso = peso;
  }

  public int getMembro() {
    return membro;
  }

  public void setMembro(int membro) {
    this.membro = membro;
  }

  public String getCor() {
    return cor;
  }

  public void setCor(String cor) {
    this.cor = cor;
  }

}
