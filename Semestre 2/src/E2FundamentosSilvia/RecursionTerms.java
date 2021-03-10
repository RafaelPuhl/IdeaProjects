package E2FundamentosSilvia;

import java.util.Scanner;

public class RecursionTerms {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String entrada;
        int ntermos;
        double soma;
        boolean fim = false;

        while (!fim) {
            System.out.println("Entre com um valor que será o numero de termos da série pré determinada");
            entrada = teclado.nextLine();
            if (!apenasDigitos(entrada)) {
                System.out.println("Entre apenas com um numero inteiro formado pelos dígitos (0-9)");
                continue;
            }
            ntermos = valorDaStringNumerica(entrada);
            if (ntermos == 0) {
                System.out.println("Entre apenas com numeros positivos diferentes de zero");
                continue;
            }
            soma = serieNumerica(ntermos);
            System.out.println(soma);
        }
    }

    public static boolean apenasDigitos(String conferir){
        boolean resposta = true;
        for (int i = 0; i < conferir.length(); i++) {
            int aux = (int) conferir.charAt(i);
            if (aux < 48 && aux > 57) resposta = false;
        }
        return resposta;
    }

    public static int valorDaStringNumerica(String conferir){
        int soma, multiplicador, i, tamanho, digito;
        multiplicador = 0;
        soma = 0;
        tamanho = conferir.length();

        for (i = tamanho - 1; i >= 0; i--) {
            digito = (int) conferir.charAt(i) - 48;
            soma = soma + digito * (int) Math.pow(10, multiplicador);
            multiplicador++;
        }
        return soma;
    }

    public static double serieNumerica(int termos){
        if (termos == 1) return 3;
        else return (2 * termos + 1) / Math.pow(termos, 2) + serieNumerica(termos - 1);
    }
}
