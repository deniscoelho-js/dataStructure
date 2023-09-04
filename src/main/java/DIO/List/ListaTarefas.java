package DIO.List;

import java.util.ArrayList;
import java.util.List;

public class ListaTarefas {
    private List<Tarefa> listaTarefa;

    public ListaTarefas() {
        this.listaTarefa = new ArrayList<>();
    }

    public void adicionarTarefa(String descricao){
        listaTarefa.add(new Tarefa(descricao));
    }

    public List<Tarefa> obterDescricoesTarefas(){
        return listaTarefa;
    }

    public int obterNumeroTotalTarefas(){
        return listaTarefa.size();
    }

    public void removerTarefa(String descricao){
        listaTarefa.removeIf(lista -> lista.getDescricao() == descricao);
    }
}
