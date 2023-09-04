package bancos.app;

import bancos.classes.Pessoa;
import bancos.contas.ContaEspecial;

public class appContaEspecial {

    public static void main(String[] args) {
        Pessoa p1 = new Pessoa("Nome1", "email1");
        ContaEspecial e1 = new ContaEspecial(12312, p1, 0.00f, -1000.00f);

        System.out.println("Saldo inicial da conta: " + e1.getSaldo());
        System.out.println("Limite inicial da conta: " + e1.getLimite());


        if(e1.sacar(1500.00f))
            System.out.println("Operacao de saque realizada com sucesso!");
        else
            System.out.println("Limite insuficiente para realizacao do saque");

        System.out.println("Saldo atual da conta: " + e1.getSaldo());
        e1.descontarTaxaManutencao();
        System.out.println("Saldo apos desconto da taxa de manutencao: " + e1.getSaldo());
    }
}