package IntroduccionPRGATS.ProgramacionMedia.ZAvanzadoPOO.ZEjercicioFinal1;

public class Rectangulo extends Poligonos {

//#############################################################################
//# Introducción a POO (Avanzado) - Video 79-82 - Ejercicio Final 1           #
//#############################################################################

    // Atributos
    private double lado1;
    private double lado2;

    // Constructor
    public Rectangulo(double lado1, double lado2) {
        super(2);
        this.lado1 = lado1;
        this.lado2 = lado2;
    }

    // Getter && Setters
    public double getLado1() {
        return lado1;
    }

    public double getLado2() {
        return lado2;
    }

    // Métodos
    @Override
    public double area() {
        return lado1 * lado2;
    }

    @Override
    public String toString() {
        return "Rectángulo:" +
                "\nNúmero de lados: " + numeroLados +
                "\nLado1: " + lado1 +
                ", Lado2: " + lado2;
    }
}
