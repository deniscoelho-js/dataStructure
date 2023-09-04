package bancos.app;

import bancos.classes.Pessoa;
import bancos.contas.Conta;
import bancos.contas.ContaComum;
import bancos.contas.ContaEspecial;

public class appContas {
    public static void main(String[] args) {
        Pessoa p1 = new Pessoa("eiei", "eiei@email.com");
        ContaComum c1 = new ContaComum(21312, p1, 150.0f);

        System.out.println("Numero de contas instanciadas ate o momento: " + c1.getNumero_contas());

        ContaEspecial e1 = new ContaEspecial(1212, p1, 100.0f, 5500.0f);

        System.out.println("Numero de contas instanciadas ate o momento: " + c1.getNumero_contas());

        if(c1.movimentar(1000.0f, Conta.SACAR)){
            System.out.println("Saque realizado");
        } else {
            System.out.println("Saque não realizado");
        }
    }
}

// https://www.youtube.com/watch?v=IEkYU2sDXPo&list=PLqmCwMNmP1Ix0MMUoBHsCY7Fyzk2kotbg&index=9