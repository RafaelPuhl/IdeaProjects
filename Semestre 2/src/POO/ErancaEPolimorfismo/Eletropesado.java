package POO.ErancaEPolimorfismo;

public class Eletropesado extends Produto {

    public Eletropesado(int codigo, String descricao, double preco) {
        super(codigo, descricao, preco);
    }

    @Override
    public double getMargemLucro() {
        if (super.getPreco() > 999) {
            return getPreco()*0.20;
        } else {
            return super.getMargemLucro();
        }
    }
}
