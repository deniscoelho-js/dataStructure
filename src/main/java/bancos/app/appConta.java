package bancos.app;

import bancos.classes.Pessoa;
import bancos.contas.ContaComum;

public class appConta {
    public static void main(String[] args) {
        Pessoa p1 = new Pessoa("Fulano", "fulano@email.com");
        ContaComum c1 = new ContaComum(1332, p1, 3000.0f);
        Pessoa p2 = new Pessoa("ciclano", "fulano@email.com");
        ContaComum c2 = new ContaComum(2332, p2, 5000.0f);

        System.out.println("Conta numero...............: " + c1.getNumero());
        System.out.println("Conta numero...............: " + c1.getCorrentista().getNome());
        System.out.println("Conta numero...............: " + c1.getSaldo());
        System.out.println("-------------------------------");
        System.out.println("Conta numero...............: " + c2.getNumero());
        System.out.println("Conta numero...............: " + c2.getCorrentista().getNome());
        System.out.println("Conta numero...............: " + c2.getSaldo());

        if(c2.sacar(5000.0f)){
            System.out.println("Saque efetuado com sucesso!");
        } else {
            System.out.println("Saque nao realizado por saldo insuficiente!");
        }

        c2.depositar(100.0f);
        System.out.println("Saldo atualizado: R$ " + c2.getSaldo());
    }
}
