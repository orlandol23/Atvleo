package br.com.rd.rdevs.main;

import br.com.rd.rdevs.contas.model.Conta;
import br.com.rd.rdevs.contas.model.ContaCorrente;
import br.com.rd.rdevs.contas.model.ContaPoupanca;

public class TesteConta{
    public static void main(String args[]){
        Conta minhaConta;
        minhaConta = new ContaCorrente();
        Conta contaLeo;
        contaLeo = new ContaPoupanca();

        minhaConta.setNumero(1257);
        minhaConta.setTitular("Ivo");
        minhaConta.depositar(20000);
        minhaConta.setAgencia("3928");
        minhaConta.setDataAbertura("12/12/12");
        minhaConta.recuperarDadosParaImpressao();
        minhaConta.calcularRendimento();
        minhaConta.recuperarDadosParaImpressao();




    }

}

