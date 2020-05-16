package IntroduccionPRGPildorasInformaticas.ProgramacionBasica.Medio.III_Herencia_I;

import javax.swing.*;

public class UsoCoche {

//#############################################################################
//# Herencia I - Píldoras Informáticas - Video 40                             #
//#############################################################################

    public static void main(String[] args) {

        Coche miCoche = new Coche();

        miCoche.estableceColor(JOptionPane.showInputDialog("Introduce color: "));

        System.out.println(miCoche.dimeDatosGenerales());

        System.out.println(miCoche.dimeColor());

        miCoche.configuraAsiento(JOptionPane.showInputDialog("¿Tiene asientos de cuero?, si/no: "));

        System.out.println(miCoche.dimeAsientos());

        miCoche.configuraClimatizador(JOptionPane.showInputDialog("¿Tiene climatizador?, si/no: "));

        System.out.println(miCoche.dimeClimatizador());

        System.out.println(miCoche.dimePesoCoche());

        System.out.println("EL precio final del coche es: " + miCoche.precioFinal());
    }
}