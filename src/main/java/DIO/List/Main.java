package DIO.List;

public class Main {
    public static void main(String[] args) {
        ListaTarefas listaTarefas = new ListaTarefas();

        listaTarefas.adicionarTarefa("comprar carnes");
        listaTarefas.adicionarTarefa("beber agua");
        listaTarefas.adicionarTarefa("arrumar a casa");
        listaTarefas.adicionarTarefa("estudar");


        for(Tarefa lista : listaTarefas.obterDescricoesTarefas()){
            System.out.println("Tarefa: " + lista.getDescricao());
        }

        System.out.println("O numero total de tarefas é: " + listaTarefas.obterNumeroTotalTarefas());

        listaTarefas.removerTarefa("estudar");

        for(Tarefa lista : listaTarefas.obterDescricoesTarefas()){
            System.out.println("Tarefa: " + lista.getDescricao());
        }
    }
}
