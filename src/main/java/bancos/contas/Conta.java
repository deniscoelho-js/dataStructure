package bancos.contas;

import bancos.classes.Pessoa;

public abstract class Conta {
    private int numero;
    private Pessoa correntista;
    private float saldo;
    private static int numero_contas;

    public final static int SACAR = 0;
    public final static int DEPOSITAR = 1;
    public Conta() {
        incrementaContas();
    }

    public Conta(int numero, Pessoa correntista, float saldo) {
        this();  // chama o construtor default da classe, logo já incrementa a quantidade de contas criadas no momento da instanciacao
        this.numero = numero;
        this.correntista = correntista;
        this.saldo = saldo;
    }

    public boolean movimentar(float valor, int operacao){
        boolean retorno = true;
        switch (operacao){
            case DEPOSITAR:
                this.depositar(valor);
                break;
            case SACAR:
                retorno = this.sacar(valor);
                break;
            default:
                retorno = false;
        }
        return retorno;
    }

    private static void incrementaContas(){
        ++numero_contas;
    }

    public static int getNumero_contas(){
        return Conta.numero_contas;
    }

    public void depositar(float valor){
        this.setSaldo(this.getSaldo() + valor);
    }

    public abstract boolean sacar(float valor);

    public final int getNumero() {
        return numero;
    }

    public final void setNumero(int numero) {
        this.numero = numero;
    }

    public final Pessoa getCorrentista() {
        return correntista;
    }

    public final void setCorrentista(Pessoa correntista) {
        this.correntista = correntista;
    }

    public final float getSaldo() {
        return saldo;
    }

    public final void setSaldo(float saldo) {
        this.saldo = saldo;
    }
}
