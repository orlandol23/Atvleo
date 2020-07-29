package br.com.rd.rdevs.contas.model;

public class ManipuladorDeSeguroDeVida {
    private SeguroDeVida seguro;

    public void criaSeguro(double valorSeguro, int numeroDaApolice, String titular){
        this.seguro = new SeguroDeVida(valorSeguro,numeroDaApolice,titular);
    }
    public void mostraSeguro(){
        System.out.println("Número da apólice =  " + this.seguro.getNumeroDaApolice());
        System.out.println("Titular =  " + this.seguro.getTitular());
        System.out.println("Valor Do seguro =  " + this.seguro.getValorSeguro());
    }
}
/*Crie a classe ManipuladorDeSeguroDeVida dentro do pacote br.com.rd.rdevs.contas
para vincular a classe SeguroDeVida com a rotina de criação de seguros. Esta classe deve ter um
atributo do tipo SeguroDeVida.
•	Crie também o método criaSeguro que deve receber como parâmetro as informações fornecidas pela rotina de teste.
•	Você deve pegar os parâmetros "numeroApolice" do tipo int, "titular" do tipo String e "valor" do tipo double.
*/