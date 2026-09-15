package org.example;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MarksSystem {
    public static double calcularPromedio(double[] calificaciones) {
        double avg = 0;
        for (double mark:calificaciones)
            avg += mark;
        return avg/calificaciones.length;
    }
    public static String obtenerEstado(double promedio) {
        if (promedio > 60)
            return "Aprobado";
        else
            return "Reprobado";
    }
    public static void mostrarEstadisticas(int aprobados, int reprobados, double promedioClase) {
        System.out.println("\nEstadisticas" +
                "\nAprobados: " + aprobados +
                "\nReprobados: " + reprobados +
                "\nPromedio de la clase: " + promedioClase
        );
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[] marks = new double[5];
        try {
            for (int i = 1; i <= 5; i++) {
                System.out.print("Ingresa la calificacion del estudiante " + i + ": ");
                marks[i-1] = sc.nextDouble();
            }
            int passed = 0;
            int fail = 0;
            int count = 1;
            System.out.println("\nResultados");
            for (double mark:marks) {
                System.out.println("Estudiante " + count + ": Promedio " + mark + " - " + obtenerEstado(mark));
                if (mark > 60)
                    passed++;
                else
                    fail++;
            }
            mostrarEstadisticas(passed, fail, calcularPromedio(marks));
        } catch (InputMismatchException e) {
            System.out.println("Nota no valida");
        } finally {
            sc.close();
        }
    }
}
