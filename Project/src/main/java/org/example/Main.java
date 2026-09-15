package org.example;
import attackontitan.inner.Eren;
import attackontitan.inner.Erwin;
import attackontitan.outer.Annie;

import java.util.Scanner;

public class Main {
    static void main() {
        /*Scanner sc = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = sc.nextLine();
        System.out.println("Say hello to java, " + name);*/

        Eren eren = new Eren();
        Erwin erwin = new Erwin();
        Annie annie = new Annie();

        System.out.println("Informacion Erwing:");
        System.out.println(erwin.tellMeWhatYouKnow() + "\n");
        System.out.println("Informacion Annie:");
        System.out.println(annie.tellMeWhatYouKnow() + "\n");
        System.out.println("Informacion Eren:");
        System.out.println(eren.tellMeWhatYouKnow() + "\n");
    }
}
