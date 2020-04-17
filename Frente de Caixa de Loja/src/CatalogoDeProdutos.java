import java.util.ArrayList;

public class CatalogoDeProdutos {

    ArrayList<Produto> listOfProducts = new ArrayList<>();

    public void setProduto(Produto produto) {
        listOfProducts.add(produto);
    }

    public Produto getProdutoPorCodigo(int codigo) {
        for (Produto produto : listOfProducts) {
            if (produto.getCodigo() == codigo) {
                return produto;
            }
        }
        return null;
    }

    public ArrayList<Produto> getTodosProdutos() {
        return listOfProducts;
    }
}
