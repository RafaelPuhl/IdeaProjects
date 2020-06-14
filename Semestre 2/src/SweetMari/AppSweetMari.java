package SweetMari;

import java.util.Scanner;

public class AppSweetMari {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Caixa c = new Caixa();
        c.setSaldo(50.00);
        c.setSaldoPendente(90.00);
//        String op = "";
//        do {
//            menu();
//            op = in.nextLine();
//            switch (op) {
//                case "1":
//
//                    break;
//                case "2":
//                    break;
//                case "3":
//                    break;
//            }
//
//        } while (!op.equals("x"));
    }

    public static void menu() {
        System.out.println("1.Depositar:");
        System.out.println("2.Retirar");
        System.out.println("3.Saber Saldo");
    }
}
