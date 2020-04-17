import java.util.ArrayList;

public class Estoque extends ItemDeEstoque {

    private ArrayList<ItemDeEstoque> listOfProducts = new ArrayList<>();

    public Estoque() {
        super();

    }

    public Produto getProdutos(int i){
        return listOfProducts.get(i).getProduto();
    }

    public int getQuantidadeProdutos() {
        return listOfProducts.size();
    }

    public boolean cadastraProduto(Produto produto, int estoqueInicial) {
        ItemDeEstoque item = new ItemDeEstoque(produto, estoqueInicial);
        listOfProducts.add(item);
        return true;
    }

    public int getQuantidadeEstoque(int codigo) {
        int qty = 0;
        for (int i = 0; i < listOfProducts.size(); i++) {
            if (listOfProducts.get(i).getProduto().getCodigo() == codigo) {
                qty = listOfProducts.get(i).getQuantidade();
            }
        }
        return qty;
    }

    public Produto getProduto(int cod) {
        Produto p = null;
        for (int i = 0; i < listOfProducts.size(); i++) {
            if (listOfProducts.get(i).getProduto().getCodigo() == cod) {
                p = listOfProducts.get(i).getProduto();
                return p;
            }
        }
        return p;
    }

    public void baixaEstoque(int codigo, int qty) {
        int aux = 0;
        for (ItemDeEstoque item : listOfProducts) {
            if (item.getProduto().getCodigo() == codigo) {
                item.baixaEstoque(qty);
            }
        }
    }

    public void reposicaoEstoque(int codigo, int qty) {
        int aux = 0;
        for (ItemDeEstoque item : listOfProducts) {
            if (item.getProduto().getCodigo() == codigo) {
                item.reposicaoEstoque(qty);
            }
        }
    }
}
