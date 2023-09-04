package bancos.contas;

import bancos.classes.Pessoa;

public class ContaPoupanca extends Conta{
    public ContaPoupanca() {
    }

    public ContaPoupanca(int numero, Pessoa correntista, float saldo) {
        super(numero, correntista, saldo);
    }

    @Override
    public boolean sacar(float valor) {
        if(this.getSaldo() >= valor){
            this.setSaldo(this.getSaldo() - valor);
            return true;
        }
        return false;
    }
}
