package org.example;

import java.util.InputMismatchException;
import java.util.Scanner;

public class PrimeValidator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean prime = true;
        try {
            System.out.print("Ingresa un numero: ");
            int num = sc.nextInt();
            if (num <= 1)
                System.out.println(num + " no es primo");
            else {
                for (int i = 2; i < num/2; i++) {
                    if (num % i == 0)
                        prime = false;
                }
                System.out.println(num + (prime ? " es un numero primo" : " no es un numero primo"));
            }
        } catch (InputMismatchException e) {
            System.out.println("Numero no valido");
        } finally {
            sc.close();
        }
    }
}
