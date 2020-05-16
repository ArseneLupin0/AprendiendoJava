// Valores constantes en Java
package IntroduccionPRGATS.ProgramacionMedia.IntermedioPOO.MainClases3;

public class MainClases2 {

//#############################################################################
//# Introducción a POO, Constantes - Video 70 - Continuación                  #
//#############################################################################

    public static void main(String[] args) {
        Clases1 objeto1 = new Clases1(18, "Paco");

        objeto1.mostrarResultados();

        objeto1.setEdad(21);
        System.out.println(objeto1.getEdad());
    }
}
