package br.com.rd.rdevs.contas.model;

public class ContaCorrente extends Conta implements Tributavel{
    private String tipoConta = "Conta Corrente";
    @Override
    public String getTipoConta() {
        return this.tipoConta;
    }

    @Override
    public double getValorImposto() {
        return this.getSaldo() * 0.01;

    }
}
