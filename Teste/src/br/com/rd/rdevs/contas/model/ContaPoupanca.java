package br.com.rd.rdevs.contas.model;

public class ContaPoupanca extends Conta {
    private String tipoConta = "Conta Poupança";
    @Override
    public String getTipoConta() {
        return this.tipoConta;
    }
}
