package org.example;

import java.util.ArrayList;
import java.util.Scanner;
import static org.example.ReaderHelper.readCPF;
import static org.example.ReaderHelper.readDouble;
import static org.example.ReaderHelper.readInteger;
import static org.example.ReaderHelper.readName;

public class Main {

    public static Scanner in = new Scanner(System.in);
    public static ArrayList<Conta> contas = new ArrayList<>();
    public static final String ANSI_YELLOW = "\u001B[33m";
    public static final String ANSI_RESET = "\u001B[0m";

    public static void main(String[] args) {
        int op;
        do {
            Menus.menuPrincipal();
            op = readInteger(in);
            switch (op){
                case 1:
                    abrirConta();
                    break;
                case 2:
                    System.out.println("Entre com o CPF do cliente: ");
                    String cpf = readCPF(in);
                    manipularConta(cpf);
                    break;
                case 3:
                    listarContas();
                    break;
                default:
                    if (!(op == 4)) {
                        System.err.println("Opcao invalida \n");
                        break;
                    }
                    break;
            }

        }while (!(op == 4));
        System.out.println(ANSI_YELLOW + "Programa finalizado com sucesso!" + ANSI_RESET);
    }


    public static void abrirConta(){
        System.out.println("Entre com o CPF do cliente: ");
        String cpf = readCPF(in);
        System.out.println("Entre com o nome do cliente: ");
        String nome = readName(in);
        System.out.println("Entre com o sobrenome do cliente: ");
        String sobrenome = readName(in);

        contas.add(new Conta(contas.size()+1,nome,sobrenome,cpf));
        System.out.println(ANSI_YELLOW + "Conta aberta com sucesso!" + ANSI_RESET);
    }

    public static void listarContas(){
        if (contas.isEmpty() == true) {
            System.err.println("Não exixtem contas abertas");
        }else {
            for (Conta conta : contas) {
                System.out.println("Numero da conta: " + conta.getNumero() + " | CPF do titular: " + conta.getCpfTitular() + " | Nome: " + conta.getNomeCompletoTitular());
            }
        }

    }

    public static void manipularConta(String cpf){
        if (contas.isEmpty() == true) {
            System.err.println("Não há contas abertas para serem manupuladas");
        }else {
            for (Conta conta : contas) {
                if (conta.getCpfTitular().equals(cpf)) {
                    Menus.menuManipularConta(conta.getNomeCompletoTitular());
                    int opcao = readInteger(in);
                    if (opcao == 1) {
                        System.out.println("Entre com o valor do deposito: ");
                        double deposito = readDouble(in);
                        conta.depositar(deposito);
                        System.out.println(ANSI_YELLOW + "Valor depositado com sucesso!" + ANSI_RESET);
                        manipularConta(cpf);
                    } else if (opcao == 2) {
                        System.out.println("Entre com o valor do saque: ");
                        double saque = readDouble(in);
                        conta.sacar(saque);
                        System.out.println(ANSI_YELLOW + "Valor sacado com sucesso!" + ANSI_RESET);
                        manipularConta(cpf);
                    } else if (opcao == 3) {
                        System.out.println("Saldo da conta: " + conta.getSaldo());
                        manipularConta(cpf);
                    }else if(opcao == 4){
                        System.out.println(ANSI_YELLOW + "Voltando ao menu principal" + ANSI_RESET);
                        break;
                    }else {
                        System.err.println("Opcao invalida \n");
                        manipularConta(cpf);
                    }
                }else {
                    System.err.println("Conta nao encontrada");
                    break;
                }
            }
        }


    }
}