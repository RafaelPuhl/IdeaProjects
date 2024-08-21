package org.example;

public class Menus {

    public static final String ANSI_YELLOW = "\u001B[33m";
    public static final String ANSI_RESET = "\u001B[0m";

    public static void menuPrincipal(){
        System.out.println("Menu Principal, escolha uma opcao: ");
        System.out.println("1 - Abrir Conta");
        System.out.println("2 - Manipualar Conta");
        System.out.println("3 - Listar Contas");
        System.out.println("4 - Sair");
    }

    public static void menuManipularConta(String nome){
        System.out.println(ANSI_YELLOW + "Conta de Cliente: " + nome + ", escolha uma opcao: " + ANSI_RESET);
        System.out.println("1 - Deposito");
        System.out.println("2 - Saque");
        System.out.println("3 - Consultar Saldo");
        System.out.println("4 - Sair");
    }
}
