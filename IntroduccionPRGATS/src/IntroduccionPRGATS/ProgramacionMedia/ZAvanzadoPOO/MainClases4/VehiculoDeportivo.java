package IntroduccionPRGATS.ProgramacionMedia.ZAvanzadoPOO.MainClases4;

public class VehiculoDeportivo extends Vehiculo {

//#############################################################################
//# Introducción a POO (Avanzado) - Video 78 - Continuación                   #
//#############################################################################

    // Atributos
    private int caballos;

    // Constructor
    public VehiculoDeportivo(String matricula, String marca, String modelo, int caballos) {
        super(matricula, marca, modelo);
        this.caballos = caballos;
    }

    // Getter & Setter
    public int getCaballos() {
        return caballos;
    }

    // Métodos
    // Overrides
    @Override
    public String toString() {
        return "VehiculoDeportivo{" +
                "matricula='" + matricula + '\'' +
                ", marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", caballos=" + caballos +
                '}';
    }
}
