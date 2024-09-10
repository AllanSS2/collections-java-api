package main.java.list.OperacoesBasicas;

import java.util.List;
import java.util.ArrayList;

public class ListaTarefa {
    // atributo
    private List<Tarefa> tarefaList;

    public ListaTarefa() {
        this.tarefaList = new ArrayList<>();
    }

    public void addTarefa(String descricao){
        tarefaList.add(new Tarefa(descricao));
    }

    public void remTarefa(String descricao){
        List<Tarefa> tarefasParaRemover= new ArrayList<>();
        for(Tarefa t : tarefaList){
            if(t.getDescricao().equalsIgnoreCase(descricao)){
                tarefasParaRemover.add(t);
            }
        }
        tarefaList.removeAll(tarefasParaRemover);
    }

    public int obterTotalTarefas(){
        return tarefaList.size();
    }

    public void obterDescricaoTarefas(){
        System.out.println(tarefaList);
    }
    

    public static void main(String[] args) {
        ListaTarefa listaTarefa = new ListaTarefa();
        System.out.println("Quanridade tarefas: "+listaTarefa.obterTotalTarefas());

        listaTarefa.addTarefa("Tarefa 1");
        listaTarefa.addTarefa("Tarefa 1");
        listaTarefa.addTarefa("Tarefa 2");
        System.out.println("Quanridade tarefas: "+listaTarefa.obterTotalTarefas());

        listaTarefa.remTarefa("Tarefa 1");
        System.out.println("Quanridade tarefas: "+listaTarefa.obterTotalTarefas());

        listaTarefa.obterDescricaoTarefas();
    }
}
