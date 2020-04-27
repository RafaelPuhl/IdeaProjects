package POO.ErancaEPolimorfismo;

public class Passagem {
    private String nome;
    private String assento;
    private String cpf;
    private double custoPassagem, peso;

    public Passagem(String nome, String cpf, double custoPassagem) {
        this.nome = nome;
        this.cpf = cpf;
        this.custoPassagem = custoPassagem;
    }

    public double getCustoPassagem(){
        return this.custoPassagem;
    }

    public double custoBagagem(int[] pesos) {
        for (int i = 0; i < pesos.length; i++) {
            this.peso += pesos[i];
        }

        return this.peso * 0.5;
    }

    public double defineAssento(String assento) {
        this.assento = assento;
        return 5;
    }
}
