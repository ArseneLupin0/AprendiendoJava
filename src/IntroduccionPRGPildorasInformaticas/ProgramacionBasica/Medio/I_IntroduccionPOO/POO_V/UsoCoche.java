package IntroduccionPRGPildorasInformaticas.ProgramacionBasica.Medio.I_IntroduccionPOO.POO_V;

public class UsoCoche {

//#############################################################################
//# Introducción a POO V - Píldoras Informáticas - Video 31                   #
//#############################################################################

    public static void main(String[] args) {

        Coche miCoche = new Coche();

        miCoche.estableceColor("Marrón");

        System.out.println(miCoche.dimeDatosGenerales());

        System.out.println(miCoche.dimeColor());

        miCoche.configuraAsiento("Si");

        System.out.println(miCoche.dimeAsientos());
    }
}