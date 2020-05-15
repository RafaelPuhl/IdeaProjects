package POO.ClassesAbstratasEInterfaces;

public abstract class Conta {
    private int numero;
    private String nome;
    protected double saldo = 0;

    public Conta(int numero, String nome) {
        this.numero = numero;
        this.nome = nome;
    }

    public abstract boolean depositar(double saldo);

    public abstract boolean retirada(double saldo);

    public double getSaldo() {
        return this.saldo;
    }

    public int getNumero(){
        return this.numero;
    }
}