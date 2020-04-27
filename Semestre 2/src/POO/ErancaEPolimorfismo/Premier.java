package POO.ErancaEPolimorfismo;

public class Premier extends Executive {
    public Premier(String nome, String cpf, double custoPassagem) {
        super(nome, cpf, custoPassagem);
    }

    @Override
    public double custoBagagem(int[] pesos) {
        return super.custoBagagem(pesos) * 0.5;
    }

    @Override
    public double defineAssento(String assento) {
        super.defineAssento(assento);
        return 0;
    }

    @Override
    public int getMilhas() {
        return (int) (getCustoPassagem() * 0.20);
    }
}
