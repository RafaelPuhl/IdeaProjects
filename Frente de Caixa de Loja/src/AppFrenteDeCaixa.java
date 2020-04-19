import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.Pattern;

public class AppFrenteDeCaixa {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String operacao = "0";
        HistoricoVendas historico = new HistoricoVendas();
        int venda = historico.getVendas();
        do {
            menuPrincipal();
            operacao = in.nextLine();
            if (Pattern.matches("[1-2]", operacao) == true) {
                switch (operacao) {
                    case "1":
                        do {
                            venda++;
                            System.out.println("Venda Nro " + venda + " aberta.");
                            do {

                            } while (!operacao.equals(">"));

                        } while (!operacao.equals(">"));
                        break;
                }
            } else {
                System.out.println("Comando invalido");
            }
        } while (!operacao.equals("X"));
    }

    public static void menuPrincipal() {
        System.out.println("1. Abrir Vendas");
        System.out.println("2. Atualizacao de Estoque");
        System.out.println("X. Sair");
    }
}
