import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o nome: ");
        String nome = scanner.nextLine();
        System.out.println("Digite a idade: ");
        int idade = scanner.nextInt();
        System.out.println("Digite o id: ");
        String id = scanner.nextLine();
        System.out.println("Digite o peso: ");
        float peso = scanner.nextFloat();
        System.out.println("Digite a altura: ");
        float altura = scanner.nextFloat();
        scanner.close();
        // criando um objeto da classe Pessoa
        Pessoa pessoa = new Pessoa(nome, idade, id, peso, altura);
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
