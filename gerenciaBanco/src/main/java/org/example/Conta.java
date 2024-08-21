package org.example;

public class Conta {

    private int numero;
    private double saldo;
    private String nomeTitular;
    private String sobrenomeTitular;
    private String cpfTitular;

    public Conta(int numero, String nomeTitular, String sobrenomeTitular, String cpfTitular) {
        this.numero = numero;
        this.nomeTitular = nomeTitular;
        this.sobrenomeTitular = sobrenomeTitular;
        this.cpfTitular = cpfTitular;
        saldo = 0;
    }

    public int getNumero() {
        return numero;
    }

    public double getSaldo() {
        return saldo;
    }

    public String getNomeCompletoTitular() {
        return nomeTitular + " " + sobrenomeTitular;
    }

    public String getCpfTitular() {
        return cpfTitular;
    }

    public void depositar(double valor) {
        saldo += valor;
    }
    public void sacar(double valor) {
        saldo -= valor;
    }
}
