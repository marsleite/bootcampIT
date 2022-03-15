package br.com;

import br.com.tarefas.Tarefa;

public class Principal {

  public static void main(String[] args) {
    System.out.println("Minhas Tarefas");
    System.out.println("--------------");
    Tarefa tarefa = new Tarefa();
    tarefa.adicionarTarefa("Comprar Leite");
    tarefa.adicionarTarefa("Estudar java");
    tarefa.adicionarTarefa("Ler um livro");
    tarefa.exibirTarefa();
  }
}
