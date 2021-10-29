
import java.util.Scanner;
import java.util.regex.Pattern;

public class AppPiggyBankExtra {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Cofrinho c = new Cofrinho();
        String op = " ";
        String opDeMoeda = " ";
        System.out.println("Use os seguintes comando para fazer as operacoes: ");
        do {
            System.out.print("1: Inserir moeda; 2: Retirar a ultima moeda; 3: Saber quantas moedas tem no cofrinho; X: para sair: ");
            System.out.println();
            op = in.nextLine();
            if (op.equals("1")) {
                menu();
                opDeMoeda = in.nextLine();
                if (Pattern.matches("[1-6]", opDeMoeda) == true) {
                    switch (opDeMoeda) {
                        case "1":
                            c.inserir(new Moeda(NomeMoeda.UmReal));
                            break;
                        case "2":
                            c.inserir(new Moeda(NomeMoeda.Cinquenta));
                            break;
                        case "3":
                            c.inserir(new Moeda(NomeMoeda.VinteCinco));
                            break;
                        case "4":
                            c.inserir(new Moeda(NomeMoeda.Dez));
                            break;
                        case "5":
                            c.inserir(new Moeda(NomeMoeda.Cinco));
                            break;
                        case "6":
                            c.inserir(new Moeda(NomeMoeda.Um));
                            break;
                    }
                } else {
                    System.out.println("Essa moeda nao existe !");
                }
            } else if (op.equals("2")) {
                c.retira();
            } else if (op.equals("3")) {
                System.out.println(c.getQtdTotal()+ " moedas dentro do cofrinho");
            }
            System.out.println("Valor no dentro do cofrinho: " + c.getDinheiroReal() + "R$");
        } while (!op.equals("x"));
    }

    public static void menu() {
        System.out.println("Qual moeda ?:");
        System.out.println("1: " + NomeMoeda.UmReal);
        System.out.println("2: " + NomeMoeda.Cinquenta);
        System.out.println("3: " + NomeMoeda.VinteCinco);
        System.out.println("4: " + NomeMoeda.Dez);
        System.out.println("5: " + NomeMoeda.Cinco);
        System.out.println("6: " + NomeMoeda.Um);
    }
}