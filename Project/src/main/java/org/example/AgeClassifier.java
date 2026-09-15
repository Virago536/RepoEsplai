package org.example;

import java.util.InputMismatchException;
import java.util.Scanner;

public class AgeClassifier {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.print("Ingrese una edad: ");
            int age = sc.nextInt();
            if (age < 0) {
                System.out.println("No existe edad negativa");
            } else if (age < 13) {
                System.out.println("Niño");
            } else if (age < 18) {
                System.out.println("Adolescente");
            } else if (age < 66) {
                System.out.println("Adulto");
            } else {
                System.out.println("Adulto mayor");
            }
        } catch (InputMismatchException e) {
            System.out.println("Edad no valida");
        } finally {
            sc.close();
        }
    }
}
