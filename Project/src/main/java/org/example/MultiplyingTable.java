package org.example;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MultiplyingTable {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.print("Ingresa un numero: ");
            int num = sc.nextInt();
            System.out.println("Tabla del " + num);
            for (int i = 1; i <= 10; i++) {
                System.out.println(num + " x " + i + " = " + (num * i));
            }
        } catch (InputMismatchException e) {
            System.out.println("Numero no valido");
        } finally {
            sc.close();
        }
    }
}
