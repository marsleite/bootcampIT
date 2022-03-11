public class Pessoa {
    public String id;
    public String nome;
    public int idade;
    public float peso;
    public float altura;

    public Pessoa() {

    }

    public Pessoa(String nome, String id, int idade) {
        this.nome = nome;
        this.id = id;
        this.idade = idade;
    }

    public Pessoa(String id, String nome, int idade, float peso, float altura) {
        this.id = id;
        this.nome = nome;
        this.idade = idade;
        this.peso = peso;
        this.altura = altura;
    }
}
