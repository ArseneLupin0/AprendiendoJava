package IntroduccionPRGATS.ProgramacionMedia.ZAvanzadoPOO.ZEjercicioFinal1;

public abstract class Poligonos {

//#############################################################################
//# Introducción a POO (Avanzado) - Video 79-82 - Ejercicio Final 1          #
//#############################################################################

    // Atributos
    protected int numeroLados;

    // Constructor
    public Poligonos(int numeroLados) {
        this.numeroLados = numeroLados;
    }

    // Getter && Setter
    public int getNumeroLados() {
        return numeroLados;
    }

    // Métodos
    public abstract double area();

    @Override
    public String toString() {
        return "Poligonos{" +
                "numeroLados=" + numeroLados +
                '}';
    }
}
