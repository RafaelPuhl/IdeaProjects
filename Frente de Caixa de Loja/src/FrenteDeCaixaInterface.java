//import java.util.ArrayList;
//import java.util.Scanner;
//import java.util.regex.Pattern;
//
//public class FrenteDeCaixaInterface {
//    public static void main(String[] args) {
//        Scanner in = new Scanner(System.in);
//        String operacao = "0";
//        int countVenda = 0;
//        int codigo;
//        do {
//            FrenteDeCaixa.menu();
//            operacao = in.nextLine();
//            if (Pattern.matches("[1-7]", operacao) == true) {
//                switch (operacao) {
//                    case "1":
//                        countVenda++;
//                        Venda venda = new Venda(countVenda);
//                        historico.cadastraVenda(venda);
//                        System.out.println("***** Venda numero " + countVenda + " aberta *****");
//                        break;
//                    case "2":
//                        System.out.println("Em qual venda? \n" +
//                                "Vendas Abertas: ");
//                        ArrayList<Venda> lista_venda = new ArrayList<>();
//                        lista_venda = historico.getListaVendas();
//
//                        for (Venda v : lista_venda) {
//                            if (v.isAtiva()) {
//                                System.out.print(v.getNumero() + "|");
//                            }
//                        }
//                        System.out.println();
//                        operacao = in.nextLine();
//                        for (Produto p: catalogo.listOfProducts) {
//                            System.out.println("***** " + p.getDescricao() + " *****");
//                        }
//
//                        break;
//                    case "3":
//
//                        break;
//                    case "4":
//
//                        break;
//                    case "5":
//
//                        break;
//                    case "6":
//
//                        break;
//                }
//            } else {
//                System.out.println("Comando invalido");
//            }
//        } while (!operacao.equals("7"));
//    }
//}
