package poo.ejsstatic;

public class Persona {
    private static int contador = 0;
    protected String nombre;
    protected String apellidos;

    public Persona(String nombre, String apellidos) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        contador++;
    }

    public String presentarse() {
        return "Hola, soy: " + this.nombre;
    }

    public String presentarse(String saludo) {
        return saludo + presentarse();
    }

    public static void reportarPersonas() {
        System.out.println("Cantidad de personas instanciadas: " + contador);
    }
}

class Programador extends Persona {
    public Programador(String nombre, String apellidos) {
        super(nombre, apellidos);
    }

    @Override
    public String presentarse() {
        return "Hola, soy " + nombre + ", un programador";
    }
}
