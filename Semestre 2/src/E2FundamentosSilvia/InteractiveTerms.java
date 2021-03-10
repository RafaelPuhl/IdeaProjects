package E2FundamentosSilvia;

import java.util.Scanner;

public class InteractiveTerms {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        long num;
        System.out.println("Entre com o numero de termos da serie: ");

        while (true){
            num = ReaderHelper.readInteger(in);
            if(num <= 0){
                System.out.println("Valor invalido, entre com um valor valido inteiro e positivo: ");
                continue;
            }
            break;
        }
        System.out.println(numericSeries(num));
    }

    public static double numericSeries(long terms) {
        double sum, dividend, divider;
        sum = 0;
        dividend = 1;
        divider = 0;

        for (int i = 0; i < terms; i++) {
            dividend = dividend + 2;
            divider++;
            sum = sum + dividend / Math.pow(divider, 2);
        }
        return sum;
    }
}
