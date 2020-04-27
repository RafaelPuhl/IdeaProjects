package POO.ErancaEPolimorfismo;

public class Economy extends Passagem {
    public Economy(String nome, String cpf, double custoPassagem) {
        super(nome, cpf, custoPassagem);
    }

    @Override
    public double custoBagagem(int[] pesos) {
        return super.custoBagagem(pesos) + (pesos.length * 10);
    }
}
