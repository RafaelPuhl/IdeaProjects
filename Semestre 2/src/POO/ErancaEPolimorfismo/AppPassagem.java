package POO.ErancaEPolimorfismo;

public class AppPassagem {
    public static void main(String[] args) {
        Passagem p1 = new Passagem("Rafael", "032.915.930-57", 100);
        int[] pesos = {2, 10, 5};
        System.out.println(p1.custoBagagem(pesos));
        Economy e = new Economy("Rafael", "032.915.930-57", 100);
        System.out.println(e.custoBagagem(pesos));
    }
}
