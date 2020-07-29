package br.com.rd.rdevs.funcionarios.model;


public abstract class Funcionario {
    private String nome;
    private String cpf;
    private double salario;
    private String login;
    private String senha;
    private int pessoasEquipe;

    public abstract double bonificacao();

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public int getPessoasEquipe() {
        return pessoasEquipe;
    }

    public void setPessoasEquipe(int pessoasEquipe) {
        this.pessoasEquipe = pessoasEquipe;
    }

    public Funcionario() {
    }

    public Funcionario(String nome, String cpf, double salario, String login, String senha, int pessoasEquipe) {
        this.nome = nome;
        this.cpf = cpf;
        this.salario = salario;
        this.login = login;
        this.senha = senha;
        this.pessoasEquipe = pessoasEquipe;
    }
}