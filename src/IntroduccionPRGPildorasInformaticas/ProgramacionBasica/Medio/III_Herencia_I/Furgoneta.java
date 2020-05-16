package IntroduccionPRGPildorasInformaticas.ProgramacionBasica.Medio.III_Herencia_I;

public class Furgoneta extends Coche {

//#############################################################################
//# Herencia I - Píldoras Informáticas - Video 40                             #
//#############################################################################
    private int capacidadCarga;
    private int plazasExtra;

    public Furgoneta(int plazasExtra, int capacidadCarga) {
        super(); // Llamar al constructor de la clase padre

        this.capacidadCarga = capacidadCarga;
    }
}
