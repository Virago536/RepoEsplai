package org.example;

import java.util.InputMismatchException;
import java.util.Scanner;

public class CountVowels {
    public static int contarVocales(String palabra) {
        int count = 0;
        String vowels = "aeiouAEIOU";
        for (char ch:palabra.toCharArray()) {
            if (vowels.indexOf(ch) != -1)
                count++;
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.print("Ingresa una palabra: ");
            String word = sc.nextLine();
            System.out.println("Cantidad de vocales: " + contarVocales(word));
        } catch (InputMismatchException e) {
            System.out.println("Input error");
        } finally {
            sc.close();
        }
    }
}
