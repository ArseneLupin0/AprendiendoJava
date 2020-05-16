package IntroduccionPRGATS.ProgramacionMedia.ZAvanzadoPOO.MainClases4;

public class VehiculoFurgoneta extends Vehiculo {

//#############################################################################
//# Introducción a POO (Avanzado) - Video 78 - Continuación                   #
//#############################################################################

    // Atributos
    private int carga;

    // Constructor
    public VehiculoFurgoneta(String matricula, String marca, String modelo, int carga) {
        super(matricula, marca, modelo);
        this.carga = carga;
    }

    // Getter & Setter
    public int getCarga() {
        return carga;
    }

    // Métodos
    // Overrides
    @Override
    public String toString() {
        return "VehiculoFurgoneta{" +
                "matricula='" + matricula + '\'' +
                ", marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", carga=" + carga +
                '}';
    }
}
