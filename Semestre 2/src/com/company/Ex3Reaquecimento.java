package com.company;
import java.util.Scanner;
public class Ex3Reaquecimento {
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        int n;
        System.out.println("Entre com um numero: ");
        n = in.nextInt();
        if(vePrimo(n) == false){
            System.out.println("Numero par");
        }else{
            System.out.println("Numero impar");
        }
    }
    public static boolean vePrimo(int n){
        if(n % 2 == 0){
            return false;
        }else
        {
            return true;
        }
    }
}
