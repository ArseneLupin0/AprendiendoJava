package IntroduccionPRGATS.ProgramacionMedia.ZAvanzadoPOO.MainClases1;

public class Estudiante /* Con esto heredamos de Persona */ extends Persona {

//#############################################################################
//# Introducción a POO (Avanzado) - Video 75 - Continuación                   #
//#############################################################################

    // Atributos
    private int codigoEstudiante;
    private float notaFinal;

    // Método constructor
    public Estudiante(String nombre, String apellido, int edad, int codigoEstudiante, float notaFinal) {
        super(nombre, apellido, edad);
        this.codigoEstudiante = codigoEstudiante;
        this.notaFinal = notaFinal;
    }

    // Getter & Setter

    // Más métodos
    /*public void mostrarDatos() {
        System.out.println("Nombre: " + nombre + "\nApellido: " + apellido + "\nEdad: " + edad +
                "\nCódigo de estudiante: " + codigoEstudiante + "\nNota final: " + notaFinal);
    }*/
    public void mostrarDatos() {
        System.out.println("Nombre: " + getNombre() + "\nApellido: " + getApellido() + "\nEdad: " + getEdad() +
                "\nCódigo de estudiante: " + codigoEstudiante + "\nNota final: " + notaFinal);
    }
}
