package br.com;

import br.com.tarefas.Tarefa;

public class Principal {

  public static void main(String[] args) {
    System.out.println("Minhas Tarefas");
    System.out.println("--------------");
    Tarefa tarefa1 = new Tarefa();
    tarefa1.exibirTarefa();
  }
}
