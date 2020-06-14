package POO.ErancaEPolimorfismo;

import java.util.ArrayList;

public class AppProduto {
    public static void main(String[] args) {
        Eletrodomestico p1 = new Eletrodomestico(555,"Geladeira", 500.00);
        Eletropesado p2 = new Eletropesado(888,"Forno Industrial", 2700.99);
        Telefonia p3 = new Telefonia(777, "Iphone", 3999.99);
        ArrayList<Produto> produtos = new ArrayList<>();
        produtos.add(p1);
        produtos.add(p2);
        produtos.add(p3);
        for (Produto p: produtos) {
            System.out.println(p.getDescricao());
            System.out.println(p.calculaPrecoConsumidor());
            System.out.println("-----------------------------------------------");
        }
    }
}
