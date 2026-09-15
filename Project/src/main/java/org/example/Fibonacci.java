package org.example;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Fibonacci {
    public static void makeFibo(int count) {
        int num1 = 0;
        int num2 = 1;
        for (int i = 0; i < count; i++) {
            System.out.println(num1);
            int next = num1 + num2;
            num1 = num2;
            num2 = next;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.print("Cuantos terminos de fibonacci deseas?" );
            int num = sc.nextInt();
            makeFibo(num);
        } catch (InputMismatchException e) {
            System.out.println("Numero no valido");
        }
    }
}
