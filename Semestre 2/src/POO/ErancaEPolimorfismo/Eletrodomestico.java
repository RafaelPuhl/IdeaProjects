package POO.ErancaEPolimorfismo;

public class Eletrodomestico extends Produto{
    private boolean tensao;
    public Eletrodomestico(int codigo, String descricao, double preco) {
        super(codigo, descricao, preco);
    }

    public void setTensao(boolean t){
        this.tensao = t;
    }

    public boolean isTensao() {
        return tensao;
    }
}
