package IntroduccionPRGPildorasInformaticas.ProgramacionBasica.Medio.I_IntroduccionPOO.POO_IV;

public class UsoCoche {

//#############################################################################
//# Introducción a POO IV - Píldoras Informáticas - Video 30                  #
//#############################################################################

    public static void main(String[] args) {

        Coche renault = new Coche(); // Instanciar una clase. Ejemplar de clase.
        Coche miCoche = new Coche();

//        miCoche.estableceColor();

        System.out.println(miCoche.dimeColor());

        System.out.println(renault.dimeLargo());

//        System.out.println("Este coche tiene " + renault + " ruedas.");
    }
}