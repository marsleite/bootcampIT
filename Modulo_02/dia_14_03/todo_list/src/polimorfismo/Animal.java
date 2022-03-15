package polimorfismo;

public abstract class Animal {
  protected int peso;
  protected int membro;
  protected String cor;

  public void locomover(String correndo) {}
  public void emitirSom() {}

  public abstract void locomover();

  public void alimentar() {}

}
