package org.example;

import java.util.InputMismatchException;
import java.util.Scanner;

public class PairsAddition {
    public static void main(String[] args) {
        int num = 0;
        for (int i = 1; i <= 100; i++) {
            if (i % 2 == 0)
                num += i;
        }
        System.out.println("La suma de numeros pares del 1 al 100 es: " + num);
    }
}
