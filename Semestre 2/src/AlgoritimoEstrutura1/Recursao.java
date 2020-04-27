package AlgoritimoEstrutura1;

public class Recursao {
    public static double fatorial(int n){
        double fat = -1;
        if(n == 0 || n ==1){
            fat = 1;
        }else{
            fat = n*fatorial(n-1);
        }
        return fat;
    }
    public static int somatorio(int n){
        int soma = 0;
        for (int i = n; i >= 0 ; i--) {
            soma += i;
        }
        return soma;
    }
}
