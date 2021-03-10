package E2FundamentosSilvia;

import java.util.Scanner;
import java.util.regex.Pattern;

public class ReaderHelper {

    public static int readInteger(Scanner scanner) {
        String textInt = scanner.nextLine();
        while (true) {
            try {
                return (int) Long.parseLong(textInt);
            } catch (NumberFormatException ex) {
                System.out.println("Valor '" + textInt + "' não é um numero, por favor, insira um número válido");
                textInt = scanner.nextLine();
            }
        }
    }

    public static String readPhrase(Scanner scanner) {
        String description = scanner.nextLine();
        while (!Pattern.matches("^([a-zA-Z0-9]+\\s?)+$", description)) {
            System.out.println("Descrição iválida");
            System.out.println("Descrição deve conter apenas letras e números");
            System.out.print("Descrição: ");
            description = scanner.nextLine();
        }
        return description;
    }
}
