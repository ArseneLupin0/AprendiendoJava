package IntroduccionPRGATS.ProgramacionMedia.ZAvanzadoPOO.MainClases1;

public class Persona {

//#############################################################################
//# Introducción a POO (Avanzado) - Video 75 - Continuación                   #
//#############################################################################

    // Atributos
    private String nombre;
    private String apellido;
    private int edad;

    // Atributos Protected
    /*protected String nombre;
    protected String apellido;
    protected int edad;*/

    // Constructor
    public Persona(String nombre, String apellido, int edad) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
    }

    // Getter & Setter
    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public int getEdad() {
        return edad;
    }
}
