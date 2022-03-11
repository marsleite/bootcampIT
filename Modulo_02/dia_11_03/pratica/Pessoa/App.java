public class App {
    public static void main(String[] args) throws Exception {
        Pessoa pessoa = new Pessoa();
        pessoa.id = "1abdfgs5fgehj6kj";
        pessoa.nome = "Marcelo";
        pessoa.idade = 36;
        pessoa.peso = 94.5f;
        pessoa.altura = 1.95f;
        System.out.println(pessoa.id);
        System.out.println(pessoa.nome);
        System.out.println(pessoa.idade);
        System.out.println(pessoa.peso);
        System.out.println(pessoa.altura);
    }
}
