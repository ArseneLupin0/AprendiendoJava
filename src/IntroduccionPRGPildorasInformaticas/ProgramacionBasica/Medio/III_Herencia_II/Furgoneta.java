package IntroduccionPRGPildorasInformaticas.ProgramacionBasica.Medio.III_Herencia_II;

public class Furgoneta extends Coche {

//#############################################################################
//# Herencia II - Píldoras Informáticas - Video 41                            #
//#############################################################################
    private int capacidadCarga;
    private int plazasExtra;

    public Furgoneta(int plazasExtra, int capacidadCarga) {
        super(); // Llamar al constructor de la clase padre

        this.capacidadCarga = capacidadCarga;
        this.plazasExtra = plazasExtra;
    }

    @Override
    public String toString() {
        return "Furgoneta{" +
                "capacidadCarga=" + capacidadCarga +
                ", plazasExtra=" + plazasExtra +
                '}';
    }
}
