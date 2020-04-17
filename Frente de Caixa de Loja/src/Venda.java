import java.util.ArrayList;

public class Venda {
    private int numero;
    private boolean ativo;
    private ArrayList<ItemDeVenda> listOfSale = new ArrayList<>();

    public ArrayList<ItemDeVenda> getListaDeVenda(){
        return listOfSale;
    }

    public int getNumero() {
        return numero;
    }

    public boolean isAtiva() {
        return ativo;
    }
    public void setAtividade(){
        this.ativo = false;
    }

    public Venda(int numero) {
        this.numero = numero;
        this.ativo = true;
    }

    public double getSubtotal() {
        double subtotal = 0;
        for (ItemDeVenda item : listOfSale) {
            subtotal += item.getProduto().getPrecoUnitario()*item.getQuantidade();
        }
        return subtotal;
    }

    public double getImposto() {
        double imposto = 0;
        imposto = getSubtotal()*0.25;
        return imposto;
    }

    public double getDesconto() {
        double desconto = 0;
        if (listOfSale.size() > 10) {
            desconto = getSubtotal() * 0.10;
            return desconto;
        } else {
            return desconto;
        }
    }

    public double getValorVenda() {
        double total = 0;
        total = getSubtotal() + getImposto() - getDesconto();
        return total;
    }

    public boolean insereItem(ItemDeVenda item){
        listOfSale.add(item);
        return true;
    }

    public ItemDeVenda getItem(int nro){
        for (ItemDeVenda item: listOfSale) {
            if (item.getProduto().getCodigo() == nro){
                return item;
            }
        }
        return null;
    }

    public int getQtdadeItens(){
        int qtyItens = 0;
        for (ItemDeVenda item : listOfSale) {
            qtyItens += item.getQuantidade();
        }
        return qtyItens;
    }
}
