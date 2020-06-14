package AlgoritimoEstrutura1.EstruturasEncadeadas;

public class App {

    public static void main(String[] args) {
        ColecaoEncadeada colecaoEncadeada  = new ColecaoEncadeada();
        colecaoEncadeada.addFirst("A");
        colecaoEncadeada.addFirst("B");
        colecaoEncadeada.addFirst("C");
        colecaoEncadeada.addFirst("D");

        System.out.println(colecaoEncadeada);
        colecaoEncadeada.addFirst("E");
        System.out.println(colecaoEncadeada);

        colecaoEncadeada.remove(2);
        System.out.println(colecaoEncadeada);
        colecaoEncadeada.addLast("-A");
        System.out.println(colecaoEncadeada);
    }
}