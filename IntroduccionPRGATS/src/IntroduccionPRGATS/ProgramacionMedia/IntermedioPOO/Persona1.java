// Introducción a los métodos, método constructor
package IntroduccionPRGATS.ProgramacionMedia.IntermedioPOO;

public class Persona1 {

//#############################################################################
//# Introducción a POO, Métodos, Método constructor - Video 66 Continuación   #
//#############################################################################

    // Atributos
    String nombre;
    int edad;

    // Métodos
//    public Persona1(String _nombre, int _edad){
//        nombre = _nombre;
//        edad = _edad;
//    }

    // Otra forma (más usada) - ya que lo genera automático java

    public Persona1(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public void mostrarDatos(){
        System.out.println("El nombre es: "+nombre);
        System.out.println("La edad es: "+edad);
    }
}
