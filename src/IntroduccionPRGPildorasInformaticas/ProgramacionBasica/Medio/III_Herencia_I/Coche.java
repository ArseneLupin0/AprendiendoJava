package IntroduccionPRGPildorasInformaticas.ProgramacionBasica.Medio.III_Herencia_I;

public class Coche {

//#############################################################################
//# Herencia I - Píldoras Informáticas - Video 40                             #
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

    public void configuraClimatizador(String climatizador) { //SETTER
        this.climatizador = climatizador.equalsIgnoreCase("Si");
//        if (climatizador.equalsIgnoreCase("Si")) {
//            this.climatizador = true;
//        } else this.climatizador = false;
    }

    public String dimeClimatizador() { //GETTER
        if (climatizador) {
            return "El coche incorpora climatizador";
        } else return "El coche lleva aire acondicionado";
    }

    public String dimePesoCoche() { // GETTER + SETTER A LA VEZ, porque establece y da un retorno
        int pesoCarroceria = 500;
        pesoTotal = pesoPlataforma + pesoCarroceria;

        if (asientosCuero) pesoTotal += 50;
        if (climatizador) pesoTotal += 20;

        return "El peso del coche es " + pesoTotal;
    }

    public int precioFinal() { //GETTER
        int precioFinal = 10000;

        if (asientosCuero) precioFinal += 2000;

        if (climatizador) precioFinal += 1500;

        return precioFinal;
    }
}