package E2FundamentosSilvia;

import java.util.Scanner;

public class RecursionSubString {
    public static void main(String[] args) {
        //Váriaveis
        Scanner teclado = new Scanner(System.in);
        String frase, subString;
        frase = "A";
        subString = frase;
        boolean fim = false;
        int reccorrencia;

        while (!fim) {
            System.out.println("Entre com a frase que será analisada quantas sub strings ela possui:");
            frase = teclado.nextLine();
            System.out.println("Entre com a SubString que deseja verificar a recorrencia:");
            subString = teclado.nextLine();

            if (frase.length() > subString.length()) {
                fim = true;
            } else System.out.println("A Frase deve ser maior que a SubString!");
        }

        frase = frase.toLowerCase();
        subString = subString.toLowerCase();
        reccorrencia = recorrenciaSubString(frase, 0, subString, 0, 0);
        System.out.println("A SubString aparece " + reccorrencia + " vezes na String principal");
    }

    public static int recorrenciaSubString(String frase, int indexFrase, String subString, int indexSubString, int recorrencias) {
        int soma = recorrencias;

        if (indexFrase >= frase.length()) return soma;
        else {
            if (subString.charAt(indexSubString) == frase.charAt(indexFrase)) {
                indexSubString++;
                if (indexSubString == subString.length()) { //Sempre que o meu contador de posição passar a ultima pos
                    soma += 1;                             //ição, significa que foi encontrado uma recorrencia então
                    indexSubString = 0;                    //ele retorna para o inicio.
                }
            } else {
                if (indexSubString > 0) {
                    indexSubString = 0;
                    indexFrase--;
                }
            }
            soma = recorrenciaSubString(frase, indexFrase + 1, subString, indexSubString, soma);
            return soma;
        }
    }
}