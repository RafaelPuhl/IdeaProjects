public class ItemDeEstoque {
    private int quantidade;
    private Produto produto;

    public ItemDeEstoque(Produto prod, int qty) {
        this.produto = prod;
        this.quantidade = qty;
    }

    public ItemDeEstoque() {

    }

    public Produto getProduto() {
        return produto;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public boolean baixaEstoque(int qty) {
        if (qty > quantidade){
            System.out.println("Quantidade informada maior que a do estoque.\n Quantidade no estoque: " + quantidade);
            return false;
        }else{
            quantidade -= qty;
            return true;
        }
    }

    public void reposicaoEstoque(int qty) {
        quantidade += qty;
    }

}
