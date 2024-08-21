package org.example;

import java.util.Scanner;
import java.util.regex.Pattern;

public class ReaderHelper {
    public static double readDouble(Scanner scanner) {
        String textDouble = scanner.nextLine();
        while (true) {
            try {
                return Double.parseDouble(textDouble);
            } catch (NumberFormatException ex) {
                System.err.println("Valor '" + textDouble + "' não é um numero, por favor, insira um número válido");
                textDouble = scanner.nextLine();
            }
        }
    }

    public static int readInteger(Scanner scanner) {
        String textInt = scanner.nextLine();
        while (true) {
            try {
                return Integer.parseInt(textInt);
            } catch (NumberFormatException ex) {
                System.err.println("Valor '" + textInt + "' não é um numero, por favor, insira um número válido");
                textInt = scanner.nextLine();
            }
        }
    }


    public static String readName(Scanner scanner) {
        String name = scanner.nextLine();
        while (!Pattern.matches("^[A-Za-zÀ-ÿ]+(?: [A-Za-zÀ-ÿ]+)*$", name)) {
            System.err.println("Nome invalido");
            System.err.println("Nome deve conter apenas letras");
            System.err.print("Entre novamente com o nome: ");
            name = scanner.nextLine();
        }
        return name;
    }

    public static String readCPF(Scanner scanner) {
        String cpf = scanner.nextLine();
        while (!Pattern.matches("^\\d{3}\\x2E\\d{3}\\x2E\\d{3}\\x2D\\d{2}$", cpf)) {
            System.err.println("CPF invalido");
            System.err.println("CPF dever ser no seguinte formato: 000.000.000-00");
            System.out.print("Entre com o CPF: ");
            cpf = scanner.nextLine();
        }
        return cpf;
    }
}
