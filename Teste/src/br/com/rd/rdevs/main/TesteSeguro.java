package br.com.rd.rdevs.main;

import br.com.rd.rdevs.contas.model.ManipuladorDeSeguroDeVida;

public class TesteSeguro {
    public static void main(String[] args) {
        ManipuladorDeSeguroDeVida testeSeguro = new ManipuladorDeSeguroDeVida();
        testeSeguro.criaSeguro(50,1,"jose");
        testeSeguro.mostraSeguro();

    }

}
