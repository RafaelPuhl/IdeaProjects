package POO.ErancaEPolimorfismo;

public class AppProduto {
    public static void main(String[] args) {
        Eletrodomestico p1 = new Eletrodomestico(555,"Geladeira", 500.00);
        Eletropesado p2 = new Eletropesado(888,"Forno Industrial", 2700.99);
        p1.setTensao(true);
        System.out.println(p1.isTensao());
        System.out.println(p1.calculaPrecoConsumidor());
        System.out.println(p2.getMargemLucro());
    }
}
