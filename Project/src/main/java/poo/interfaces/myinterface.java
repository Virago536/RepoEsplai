
void main() {
    var p = new Persona("Alvaro", "Millan");

    AccesoDatos acceso = new AccesoDatosMongo();
    AgregarPersonaServicio agregarServicio= new AgregarPersonaServicio();
    agregarServicio.agregar(p, acceso);
}

class Persona {
    private String nombre;
    private String apellido;

    public Persona(String nombre, String apellido) {
        this.nombre = nombre;
        this.apellido = apellido;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }
}

class AgregarPersonaServicio {
    public void agregar(Persona p, AccesoDatos accesoDatos) {
        accesoDatos.agregar(p);
    }
}

interface AccesoDatos {
    void agregar(Persona persona);
    void buscar(Persona persona);
}

class AccesoDatosSQL implements AccesoDatos {

    @Override
    public void agregar(Persona persona) {
        IO.println("""
            INSERT INTO personas (nombre, apellido)
            VALUES( '%s', '%s')""".formatted(persona.nombre, persona.apellido)
        );
    }

    @Override
    public void buscar(Persona persona) {
        IO.println("""
                SELECT * FROM persona WHERE nombre = '%s'""".formatted(persona.nombre)
        );
    }
}

class AccesoDatosMongo implements AccesoDatos {

    @Override
    public void agregar(Persona persona) {
        IO.println("""
                db.personas.insert(
                    {
                        'nombre': '%s'
                        'apellido': '%s'
                    })""".formatted(persona.nombre, persona.apellido)
        );
    }

    @Override
    public void buscar(Persona persona) {
        IO.println("""
            db.personas.find({ 'nombre': '%s' })""".formatted(persona.nombre)
        );
    }
}