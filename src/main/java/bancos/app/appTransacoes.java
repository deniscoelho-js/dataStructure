package bancos.app;

import bancos.classes.Movimento;
import bancos.classes.Pessoa;
import bancos.classes.Transacao;
import bancos.contas.Conta;
import bancos.contas.ContaComum;

import java.text.SimpleDateFormat;
import java.util.Date;

public class appTransacoes {
    public static void main(String[] args) {
        Transacao transacoes = new Transacao();
        Pessoa pessoa = new Pessoa("Jhon", "jhon@email.com");
        Conta contaComum = new ContaComum(21212, pessoa, 450.00f);

        float saldoAnterior = contaComum.getSaldo();

        transacoes.realizarTransacao(new Date(), contaComum, 100.00f, "Deposito em dinheiro", Conta.DEPOSITAR);
        transacoes.realizarTransacao(new Date(), contaComum, 50.00f, "pagar luz", Conta.SACAR);
        transacoes.realizarTransacao(new Date(), contaComum, 60.00f, "internet", Conta.SACAR);
        transacoes.realizarTransacao(new Date(), contaComum, 700.00f, "freela", Conta.DEPOSITAR);

        System.out.println("Emitindo extrato da conta: " + contaComum.getNumero());
        System.out.println("Correntista: " + contaComum.getCorrentista().getNome());
        System.out.println("Saldo anterior: " + saldoAnterior);
        System.out.println("--------------------------");

        for (Movimento movimento: transacoes.getMovimentos()){
            System.out.println("Data: " + new SimpleDateFormat("dd/MM/yyyy").format(movimento.getData()));
            System.out.println("Historico: " + movimento.getHistorico());
            System.out.println("Valor: " + movimento.getValor());
            System.out.println("Operacao: " + (movimento.getOperacao() == Conta.DEPOSITAR ? "Deposito" : "Saque"));
        }
        System.out.println("Saldo atual: " + contaComum.getSaldo());
    }

    //https://www.youtube.com/watch?v=2ob3rYxpUlE&list=PLqmCwMNmP1Ix0MMUoBHsCY7Fyzk2kotbg&index=12
    //parei aqui
}
