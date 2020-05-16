package IntroduccionPRGPildorasInformaticas.ProgramacionBasica.Medio.I_IntroduccionPOO.POO_IV;

public class Coche {

//#############################################################################
//# Introducción a POO IV - Píldoras Informáticas - Video 30                  #
//#############################################################################

    private int ruedas, motor, largo, ancho, pesoPlataforma; // Encapsulamos los atributos / propiedades
    String color;
    int pesoTotal;
    boolean asientosCuero, climatizador;

    public Coche() {
        ruedas = 4;
        largo = 2000;
        ancho = 300;
        motor = 1600;
        pesoPlataforma = 500;
    }

    public String dimeLargo() { // GETTER
        return "El largo del coche es: " + largo;
    }

    public void estableceColor() { // SETTER
        color = "Azul";
    }

    public String dimeColor() {
        return "El color del coche es: " + color;
    }
}