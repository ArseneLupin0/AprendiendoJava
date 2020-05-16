package IntroduccionPRGATS.ProgramacionMedia.ZAvanzadoPOO.MainClases2;

public class Persona extends Animal {

//#############################################################################
//# Introducción a POO (Avanzado) - Video 76 - Continuación                   #
//#############################################################################

    // Atributos
    // Constructor
    // Getter & Setter
    // Nuevos métodos
    @Override
    public void comer() {
        System.out.println("Estoy comiendo sentado y con cubiertos");
    }

    // Si comentamos la línea e instanciamos un objeto de la clase Persona, obtendremos
    // el resultado de la herencia de la clase Animal, porque no hemos sobre escrito.
}
