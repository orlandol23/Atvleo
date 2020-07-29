package br.com.rd.rdevs.contas.model;

public abstract class Conta{
    private int numero;
    private String titular;
    private String agencia;
    private double saldo;
    private String dataAbertura;
    private String tipoConta;
    private static int identificador = 0;
    private int identificadorConta = 0;

    private boolean sacar(double valorSacado){
        if(this.saldo < valorSacado && valorSacado < 0){
            return false;
        }else{
            this.saldo = this.saldo - valorSacado;
            return true;
        }
    }
    public Conta(){
        this.identificador ++;
    }

    public Conta(String titular){
        this.titular = titular;
        this.identificador ++;
    }

    public abstract String getTipoConta();

    public void setTipoConta(String tipoConta) {
        this.tipoConta = tipoConta;
    }

    public static int getIdentificador() {
        return identificador;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public int getNumero() {
        return numero;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public String getTitular() {
        return titular;
    }

    public void setAgencia(String agencia) {
        this.agencia = agencia;
    }

    public String getAgencia() {
        return agencia;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setDataAbertura(String dataAbertura) {
        this.dataAbertura = dataAbertura;
    }

    public String getDataAbertura() {
        return dataAbertura;
    }

    public boolean depositar(double valorDepositado){
        if (valorDepositado < 0){
            return false;
        }else{
            this.saldo += valorDepositado;
            return true;
        }
    }

    public boolean transferir(double valorTransferido, Conta destino){
        if(this.saldo < valorTransferido && valorTransferido < 0){
            return false;
        }else{
            this.saldo = this.saldo - valorTransferido;
            destino.saldo = destino.saldo+valorTransferido;
            return true;

        }
    }

    public boolean calcularRendimento(){
        double calcularRendimento = this.saldo * 0.1;
        System.out.println("O rendimento é : " + calcularRendimento);
        return true;


    }

    public void recuperarDadosParaImpressao(){
        System.out.println("Numero da conta : " + this.numero);
        System.out.println("Titular da conta : " + this.titular);
        System.out.println("Agência : " + this.agencia);
        System.out.println("Saldo : " + this.saldo);
        System.out.println("Data de abertura : " + this.dataAbertura);

    }
}

