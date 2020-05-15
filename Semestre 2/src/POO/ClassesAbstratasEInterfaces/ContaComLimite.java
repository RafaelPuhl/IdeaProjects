package POO.ClassesAbstratasEInterfaces;

public class ContaComLimite extends Conta {
    protected double limite;
    private double taxaJuros;
    private double juros;

    public ContaComLimite(int numero, String nome) {
        super(numero, nome);
        this.limite = -1000;
        this.taxaJuros = 0.05;
    }

    public void defineLimite(double limite) {
        this.limite = -limite;
    }

    @Override
    public boolean depositar(double saldo) {
        this.saldo += saldo;
        return true;
    }

    @Override
    public boolean retirada(double saldo) {
        if (this.saldo > limite && saldo < this.saldo) {
            this.saldo -= saldo;
            if (this.saldo < 0) {
                this.juros = saldo * taxaJuros;
            }
        } else {
            System.out.println("Saldo ou limite insuficiente para esta operacao.");
            return false;
        }
        return true;
    }

    public void defineTaxaDeJuros(double taxa) {
        this.taxaJuros = taxa;
    }

    public double getJuros() {
        return this.juros;
    }

    public boolean quitaJuros(){
        if (this.saldo > this.juros){
            this.saldo -= this.juros;
            juros = 0;
            System.out.println("Juros quitado !, parabens pobre bixo.");
            return true;
        }
        System.out.println("Sem saldo o suficiente para quitar os juros.");
        return false;
    }
}