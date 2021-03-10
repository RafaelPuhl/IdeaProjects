package E2FundamentosSilvia;

import java.util.Scanner;

public class InteractiveSubString {
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

        reccorrencia = recorrenciaSubString(frase, subString);
        System.out.println("A SubString aparece " + reccorrencia + " vezes na String principal");
    }

    public static int recorrenciaSubString(String frase, String subString) {
        int posicaoSubString, contRecorrencia;
        posicaoSubString = 0;
        contRecorrencia = 0;


        for (int i = 0; i < frase.length(); i++) {
            if (subString.charAt(posicaoSubString) == frase.charAt(i)) {
                posicaoSubString++;
                if (posicaoSubString == subString.length()) { //Sempre que o meu contador de posição passar a ultima pos
                    contRecorrencia++;                       //ição, significa que foi encontrado uma recorrencia então
                    posicaoSubString = 0;                    //ele retorna para o inicio.
                }
            } else {
                if (posicaoSubString > 0) {
                    posicaoSubString = 0;
                    i--;
                }
            }
        }
        return contRecorrencia;
    }
}
