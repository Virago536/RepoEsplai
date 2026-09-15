package org.example;

import java.util.InputMismatchException;
import java.util.Scanner;

public class SimpleCalculator {
    public static double sumar(double a, double b) {
        return a + b;
    }
    public static double restar(double a, double b) {
        return a - b;
    }
    public static double multiplicar(double a, double b) {
        return a * b;
    }
    public static double dividir(double a, double b) {
        return a / b;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.print("Ingresa el primer numero: ");
            int num1 = sc.nextInt();
            System.out.print("Ingresa el segundo numero: ");
            int num2 = sc.nextInt();
            System.out.print("Ingresa la operación (+, -, *, /): ");
            String op = sc.next();
            switch (op) {
                case "+":
                    System.out.println("Resultado: " + sumar(num1, num2));
                    break;
                case "-":
                    System.out.println("Resultado: " + restar(num1, num2));
                    break;
                case "*":
                    System.out.println("Resultado: " + multiplicar(num1, num2));
                    break;
                case "/":
                    System.out.println("Resultado: " + dividir(num1, num2));
                    break;
                default:
                    System.out.println("operacion no valida");
            }
        } catch (InputMismatchException e) {
            System.out.println("numero no valido");
        } finally {
            sc.close();
        }
    }
}
