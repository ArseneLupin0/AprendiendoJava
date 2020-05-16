package IntroduccionPRGPildorasInformaticas.ProgramacionBasica.Medio.I_IntroduccionPOO.POO_V;

public class Coche {

//#############################################################################
//# Introducción a POO V - Píldoras Informáticas - Video 31                   #
//#############################################################################

    private int ruedas, motor, largo, ancho, pesoPlataforma; // Encapsulamos los atributos / propiedades
    private String color;
    private int pesoTotal;
    private boolean asientosCuero, climatizador;

    public Coche() {
        ruedas = 4;
        largo = 2000;
        ancho = 300;
        motor = 1600;
        pesoPlataforma = 500;
    }

    public String dimeDatosGenerales() { // GETTER
        return "La plataforma del vehículo tiene: " + ruedas + " ruedas" + ". Mide " + largo / 1000 +
                " metros con un ancho de " + ancho + " CM y un peso de plataforma de " + pesoPlataforma + " KG";
    }

    public void estableceColor(String colorCoche) { // SETTER
        color = colorCoche;
    }

    public String dimeColor() {
        return "El color del coche es: " + color;
    }

    public void configuraAsiento(String asientosCuero) { // SETTER
        this.asientosCuero = asientosCuero.equalsIgnoreCase("si");
//        if (asientosCuero.equals("si")) {
//            this.asientosCuero = true;
//        } else this.asientosCuero = false;
    }

    public String dimeAsientos() { // GETTER
        if (asientosCuero) { // De por defecto es true
            return "El coche tiene asientos de cuero";
        } else return "El coche tiene asientos de serie";
    }
}