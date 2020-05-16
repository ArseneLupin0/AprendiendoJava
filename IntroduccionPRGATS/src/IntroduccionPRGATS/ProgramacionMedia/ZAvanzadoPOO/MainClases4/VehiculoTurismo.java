package IntroduccionPRGATS.ProgramacionMedia.ZAvanzadoPOO.MainClases4;

public class VehiculoTurismo extends Vehiculo {

//#############################################################################
//# Introducción a POO (Avanzado) - Video 78 - Continuación                   #
//#############################################################################

    // Atributos
    private int nPuertas;

    // Constructor
    public VehiculoTurismo(String matricula, String marca, String modelo, int nPuertas) {
        super(matricula, marca, modelo);
        this.nPuertas = nPuertas;
    }

    // Getter & Setter
    public int getnPuertas() {
        return nPuertas;
    }

    // Métodos
    // Overrides
    @Override
    public String toString() {
        return "VehiculoTurismo{" +
                "matricula='" + matricula + '\'' +
                ", marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", nPuertas=" + nPuertas +
                '}';
    }
}
