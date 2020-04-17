package POO;

public class AppPiggyBank {
    public static void main(String[] args) {
        Cofrinho c = new Cofrinho();
        c.inserir(new Moeda(NomeMoeda.VinteCinco));
        c.inserir(new Moeda(NomeMoeda.VinteCinco));
        c.inserir(new Moeda(NomeMoeda.UmReal));
        c.inserir(new Moeda(NomeMoeda.Dez));
        c.inserir(new Moeda(NomeMoeda.Cinco));
        c.inserir(new Moeda(NomeMoeda.Cinquenta));
        c.inserir(new Moeda(NomeMoeda.Um));
        c.inserir(new Moeda(NomeMoeda.Cinquenta));
        c.inserir(new Moeda(NomeMoeda.UmReal));
        c.inserir(new Moeda(NomeMoeda.VinteCinco));
        System.out.println(c.getQtdTotal()+" Moedas dentro do cofrinho.");
        System.out.println(c.getMoeda(NomeMoeda.UmReal)+ " Moedas de "+ NomeMoeda.UmReal + " dentro do cofrinho.");
        System.out.println(c.getMoeda(NomeMoeda.Cinquenta)+ " Moedas de "+ NomeMoeda.Cinquenta + " dentro do cofrinho.");
        System.out.println(c.getDinheiroCent()+ " Centavos dentro do cofrinho.");
        System.out.println(c.getDinheiroReal()+ " R$ dentro do cofrinho.");
        c.retira();
        c.retira();
        System.out.println(c.getDinheiroCent()+ " Centavos dentro do cofrinho.");

    }
}
