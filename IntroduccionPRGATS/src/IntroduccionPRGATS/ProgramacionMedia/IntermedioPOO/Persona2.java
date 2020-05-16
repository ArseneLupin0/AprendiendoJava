// Introducción a los métodos, método de sobrecarga de constructores
package IntroduccionPRGATS.ProgramacionMedia.IntermedioPOO;

public class Persona2 {

    // Atributos
    String nombre;
    int edad;
    String dni;

    // Métodos y parámetros

    public Persona2 (String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public Persona2(String dni) {
        this.dni = dni;
    }

    public void correr() {
        System.out.println("Soy "+nombre+", tengo "+edad+" años y estoy corriendo una maratón");
    }

    public void correr(int km) {
        System.out.println("He corrido "+km+" kilómetros y mi DNI es: "+dni);
    }
}
