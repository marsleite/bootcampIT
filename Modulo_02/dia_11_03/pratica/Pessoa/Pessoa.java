public class Pessoa {
    public String id;
    public String nome;
    public int idade;
    public float peso;
    public float altura;

    public Pessoa() {

    }

    public Pessoa(String nome, int idade, String id) {
        this.nome = nome;
        this.id = id;
        this.idade = idade;
    }

    public Pessoa(String nome, int idade, String id, float peso, float altura) {
        this.id = id;
        this.nome = nome;
        this.idade = idade;
        this.peso = peso;
        this.altura = altura;
    }

    public int calcularImc() {
        float imc = (peso / (altura * altura));
        if ( imc < 20 ) {
            return -1;
        } else if (imc >= 20 && imc < 25) {
            return 0;
        } else if (imc >= 25)  {
            return 1;
        } else {
            return 2;
        }
    }

    public boolean ehMaiorIdade() {
        if (idade >= 18) {
            return true;
        } else {
            return false;
        }
    }
}
