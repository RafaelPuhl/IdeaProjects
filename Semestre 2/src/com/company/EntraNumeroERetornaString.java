package com.company;

import org.jetbrains.annotations.Contract;

import java.util.Scanner;

public class EntraNumeroERetornaString {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Entre com um numero");
        int n;
        n = in.nextInt();
        System.out.println(retornaString(n));
    }

    @Contract(pure = true)
    private static String retornaString(int a) {
        String str = "";
        for (int i = 0; i < a; i++) {
            str = str + i;
        }
        return (str);
    }
}

