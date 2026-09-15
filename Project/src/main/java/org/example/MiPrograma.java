package org.example;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MiPrograma {
        public static void main(String[] args) {
            Scanner entrada = new Scanner(System.in);


                System.out.print("¿Cuál es tu nombre? ");
                String nombre = entrada.nextLine();
                System.out.print("¿Cuál es tu edad? ");

            try (entrada) {
                byte edad = entrada.nextByte();
                byte otrovalor = (byte)(10/edad);
                //int edad = entrada.nextInt();
                System.out.println("Hola " + nombre + ", tienes " + edad + " años");
            } catch (InputMismatchException e) {
                System.out.println("Error al ingresar la edad , debe ser numerica");
            } catch (ArithmeticException e) { System.out.println("Error aritmetico"); }
        }}
