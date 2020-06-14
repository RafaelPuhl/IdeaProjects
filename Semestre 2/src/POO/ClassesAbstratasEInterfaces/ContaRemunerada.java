package POO.ClassesAbstratasEInterfaces;

public class ContaRemunerada extends Conta{
    private double percentRemuneracao;

    public ContaRemunerada(int numero, String nome) {
        super(numero, nome);
        this.percentRemuneracao = 1.02;
    }

    @Override
    public boolean depositar(double saldo) {
        this.saldo += saldo * percentRemuneracao;
        return true;
    }

    @Override
    public boolean retirada(double saldo) {
        if(this.saldo > 0 && saldo <= this.saldo) {
            this.saldo -= saldo;
            return true;
        }
        System.out.println("Saldo insuficiente para este saque.");
        return false;
    }
}
