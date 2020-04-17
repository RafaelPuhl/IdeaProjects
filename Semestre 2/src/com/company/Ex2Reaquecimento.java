package com.company;
import java.lang.reflect.Array;
import java.util.Scanner;
public class Ex2Reaquecimento {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n;
        System.out.println("Entre com o numero: ");
        n = in.nextInt();
        for (int numeros: retornaArray(n))
        {
                System.out.println(numeros);
        }
    }
    public static int [] retornaArray(int n){
        int [] resultado = new int [n];
        for (int i = 0; i < n; i++) {
            resultado[i] = i;
        }
        return resultado;

    }

}