package bancos.contas;

import bancos.classes.Pessoa;
import bancos.classes.Taxas;

public final class ContaComum extends Conta implements Taxas {
    public ContaComum() {
    }

    public ContaComum(int numero, Pessoa correntista, float saldo) {
        super(numero, correntista, saldo);
    }

    public boolean sacar(float valor){
        if(this.getSaldo() >= valor){
            this.setSaldo(this.getSaldo() - valor);
            return true;
        }
        return false;
    }

    @Override
    public float getTaxaManutencao() {
        return 15.0f;
    }

    @Override
    public void descontarTaxaManutencao() {
        this.setSaldo(this.getSaldo() - this.getTaxaManutencao());
    }
}
