// Valores constantes en Java
package IntroduccionPRGATS.ProgramacionMedia.IntermedioPOO.MainClases3;

public class Clases1 {

//#############################################################################
//# Introducción a POO, Constantes - Video 70 - Continuación                  #
//#############################################################################

    // Atributos
    private int edad; // Es una variable, porque cada año cambias de edad
    private final String nombre;

    // Constructor
    public Clases1(int edad, String nombre) {
        this.edad = edad;
        this.nombre = nombre;
    }

    // Getter & Setter
    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    // Método para mostrar los resultados
    public void mostrarResultados() {
        System.out.println("La nombre es: "+nombre);
        System.out.println("La edad es: "+edad);
    }
}
