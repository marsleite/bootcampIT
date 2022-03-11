public class Main {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa("Marcelo", 36, "1234501", 95.5f, 1.95f);
        System.out.println("--------------------");
        System.out.println("id: " + pessoa.id);
        System.out.println("Nome: " + pessoa.nome);
        System.out.println("Idade: " + pessoa.idade);
        System.out.println("Peso: " + pessoa.peso);
        System.out.println("Altura: " + pessoa.altura);
        if (pessoa.ehMaiorIdade()) {
            System.out.println("Pessoa é maior de idade");
        } else {
            System.out.println("Pessoa não é maior de idade");
        }
        System.out.println("--------------------");

        if (pessoa.calcularImc() == -1) {
            System.out.println("Abaixo do peso");
        } else if (pessoa.calcularImc() == 0) {
            System.out.println("Peso Saudavel");
        } else if (pessoa.calcularImc() == 1) {
            System.out.println("Sobrepeso");
        } else {
            System.out.println("Obeso");
        }
    }
}
