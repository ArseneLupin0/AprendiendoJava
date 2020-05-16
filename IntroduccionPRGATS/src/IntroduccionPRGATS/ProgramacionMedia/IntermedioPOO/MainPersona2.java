// Introducción a los métodos, método de sobrecarga de constructores
package IntroduccionPRGATS.ProgramacionMedia.IntermedioPOO;

public class MainPersona2 {

//#############################################################################
//# Introducción a POO, Sobrecarga de Constructores - Video 67 continuación   #
//#############################################################################

    public static void main(String[] args) {
        Persona2 p1 = new Persona2("Oliver", 19);
        p1.correr();

        Persona2 p2 = new Persona2("12345678F");
        p2.correr(18);
    }
}
