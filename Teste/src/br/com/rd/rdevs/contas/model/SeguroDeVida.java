package br.com.rd.rdevs.contas.model;

public class SeguroDeVida implements Tributavel{
    private double valorSeguro;
    private double taxa = 42;
    private int numeroDaApolice;
    private String titular;
    @Override
    public double getValorImposto() {
        return valorSeguro * 0.02 + taxa;
    }

    public SeguroDeVida(double valorSeguro, int numeroDaApolice, String titular) {
        this.valorSeguro = valorSeguro;
        this.numeroDaApolice = numeroDaApolice;
        this.titular = titular;
    }

    public double getValorSeguro() {
        return valorSeguro;
    }

    public void setValorSeguro(double valorSeguro) {
        this.valorSeguro = valorSeguro;
    }

    public int getNumeroDaApolice() {
        return numeroDaApolice;
    }

    public void setNumeroDaApolice(int numeroDaApolice) {
        this.numeroDaApolice = numeroDaApolice;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }
}
/*•	Alguns bens são tributáveis e outros não, ContaPoupanca não é tributável, já para ContaCorrente você precisa
 pagar 1% da conta e o SeguroDeVida tem uma taxa fixa de 42 reais mais 2% do valor do seguro.*/