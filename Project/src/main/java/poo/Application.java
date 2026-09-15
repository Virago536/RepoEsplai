package poo;

import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        Screen basicScreenLG = new Screen("LG");
        Screen basicScreenMagic = new Screen("Magic");
        Scanner sc = new Scanner(System.in);

        basicScreenLG.render();
        basicScreenMagic.render();
        try {
            System.out.print("Ingrese una marca: ");
            String b = sc.nextLine();
            Screen basicScreenMSI = new Screen(b);
            basicScreenMSI.render();
        } catch(InvalidData e) {
            System.out.println("Datos invalidos");
        } finally {
            sc.close();
        }
    }
}
