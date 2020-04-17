package com.company;
import java.util.Scanner;
public class ExemploDeVetor {
    public static void main(String[] args) {
        int vet1[] = new int[10];
        for (int i = 0; i < vet1.length; i++) {
            vet1[i] = (i+1)*10;
            System.out.println(vet1[i]);
        }
    }
}
