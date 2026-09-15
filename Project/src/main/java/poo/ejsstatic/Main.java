package poo.ejsstatic;

public class Main {
    static void main() {
        var p1 = new Persona(
                "Alvaro",
                "Millan"
        );

        var p2 = new Persona(
                "Fulgencio",
                "Gil"
        );

        Persona.reportarPersonas();
    }
}
