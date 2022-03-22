package br.com.tarefas;

import java.util.ArrayList;

public class Tarefa {

  ArrayList<String> tarefas = new ArrayList<String>();
  private String descricao;

  public void adicionarTarefa(String tarefa) {
    tarefas.add(tarefa);
  }

  public void exibirTarefa() {
    for (String tarefa : tarefas) {
      System.out.println(tarefa);
    }
  }

}
