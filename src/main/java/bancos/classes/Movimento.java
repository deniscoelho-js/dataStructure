package bancos.classes;

import bancos.contas.Conta;

import java.util.Date;

public class Movimento {
    private Date data;
    private Conta conta;
    private String historico;
    private float valor;
    private float saldoAnterior;
    private int operacao;

    public Movimento(Date data, Conta conta, String historico, float valor, int operacao) {
        this.data = data;
        this.conta = conta;
        this.historico = historico;
        this.valor = valor;
        this.operacao = operacao;
    }

    public boolean movimentar(){
        this.saldoAnterior = conta.getSaldo();
        if(operacao == Conta.SACAR){
            return this.conta.movimentar(this.valor, Conta.SACAR);
        } else if (operacao == Conta.DEPOSITAR){
            this.conta.movimentar(this.valor, Conta.DEPOSITAR);
            return true;
        } else {
            return false;
        }
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public Conta getConta() {
        return conta;
    }

    public void setConta(Conta conta) {
        this.conta = conta;
    }

    public String getHistorico() {
        return historico;
    }

    public void setHistorico(String historico) {
        this.historico = historico;
    }

    public float getValor() {
        return valor;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }

    public float getSaldoAnterior() {
        return saldoAnterior;
    }

    public void setSaldoAnterior(float saldoAnterior) {
        this.saldoAnterior = saldoAnterior;
    }

    public int getOperacao() {
        return operacao;
    }

    public void setOperacao(int operacao) {
        this.operacao = operacao;
    }
}
