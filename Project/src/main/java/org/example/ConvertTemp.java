package org.example;

public class ConvertTemp {
    public static void main(String[] args) {
        double cel = 25;
        double far = (cel * 9/5) + 32;
        System.out.println("Temperatura en Celsius: " + cel);
        System.out.println("Temperatura en Fahrenheit: " + far);
    }
}
