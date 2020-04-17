
public class FrenteDeCaixa {
    public static void main(String[] args) {
        Estoque estoque = geraEstoque();
        CatalogoDeProdutos catalogo = geraCatalogo(estoque);
        HistoricoVendas historico = new HistoricoVendas();
        System.out.println("Catalogo de Produtos:");
        for (Produto p:catalogo.getTodosProdutos()) {
            System.out.println("-------" + p.getDescricao());
        }
        Venda venda = new Venda(1);
        System.out.println();
        System.out.println("Venda numero "+venda.getNumero()+" aberta");
        venda.insereItem(new ItemDeVenda(estoque.getProduto(8640),5));
        System.out.println("***Item " + venda.getItem(8640).getProduto().getDescricao() + " registrado");
        venda.insereItem(new ItemDeVenda(estoque.getProduto(1230),1));
        System.out.println("***Item " + venda.getItem(1230).getProduto().getDescricao() + " registrado");
        venda.insereItem(new ItemDeVenda(estoque.getProduto(4800),7));
        System.out.println("***Item " + venda.getItem(4800).getProduto().getDescricao() + " registrado");
        venda.insereItem(new ItemDeVenda(estoque.getProduto(7410),9));
        System.out.println("***Item " + venda.getItem(7410).getProduto().getDescricao() + " registrado");
        System.out.println("Venda numero " + venda.getNumero());
        System.out.println("Item | Descricao      | Quantidade");
        System.out.println();
        int numeroItem = 0;
        for (ItemDeVenda item : venda.getListaDeVenda() ) {
            numeroItem ++;

            System.out.println(numeroItem + " | " + item.getProduto().getDescricao() + "     |  "+item.getQuantidade());
        }
        double totalDaVenda = venda.getValorVenda();
        System.out.println();
        System.out.println("Total de desconto: " + venda.getDesconto());
        System.out.println("Total de impostos: " + venda.getImposto());
        System.out.println("Total da Venda:    " + totalDaVenda);
        venda.setAtividade();
        historico.cadastraVenda(venda);


    }

    public static void menu() {
        System.out.println("1. Abrir venda");
        System.out.println("2. Inserir item de venda");
        System.out.println("3. Remover item de venda");
        System.out.println("4. Fechar venda");
        System.out.println("5. Listar as ultimas 5 vendas");
        System.out.println("6. Listar uma venda");
        System.out.println("7. Fim");
    }

    public static Estoque geraEstoque() {
        Estoque e = new Estoque();
        Produto p1 = new Produto(7410, "IphoneXR", 3999.99);
        Produto p2 = new Produto(8520, "Galaxy S10", 4999.99);
        Produto p3 = new Produto(9630, "MecBookPro", 5999.99);
        Produto p4 = new Produto(7890, "Notebook Dell G3", 4999.99);
        Produto p5 = new Produto(4560, "PowerBank 8000mAh", 99.99);
        Produto p6 = new Produto(1230, "Smart TV SONY 60'", 3999.99);
        Produto p7 = new Produto(3570, "Google ChromeCast", 299.99);
        Produto p8 = new Produto(8640, "IpadPro", 2999.99);
        Produto p9 = new Produto(6190, "SmartWatch Apple", 3999.99);
        Produto p10 = new Produto(4800, "Notebook Alien Ware R7", 14999.99);
        e.cadastraProduto(p1, 50);
        e.cadastraProduto(p2, 50);
        e.cadastraProduto(p3, 25);
        e.cadastraProduto(p4, 30);
        e.cadastraProduto(p5, 200);
        e.cadastraProduto(p6, 8);
        e.cadastraProduto(p7, 327);
        e.cadastraProduto(p8, 40);
        e.cadastraProduto(p9, 100);
        e.cadastraProduto(p10, 4);
        return e;
    }

    public static CatalogoDeProdutos geraCatalogo(Estoque estoque){
        CatalogoDeProdutos c = new CatalogoDeProdutos();
        for (int i = 0; i < estoque.getQuantidadeProdutos(); i++) {
            c.setProduto(estoque.getProdutos(i));
        }
        return c;
    }
}