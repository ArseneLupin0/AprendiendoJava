package IntroduccionPRGATS.ProgramacionMedia.ZAvanzadoPOO.ZEjercicioFinal1;

public class Triangulo extends Poligonos{

//#############################################################################
//# Introducción a POO (Avanzado) - Video 79-82 - Ejercicio Final 1           #
//#############################################################################

    // Atributos
    private double lado1;
    private double lado2;
    private double lado3;

    // Constructor
    public Triangulo(double lado1, double lado2, double lado3) {
        super(3);
        this.lado1 = lado1;
        this.lado2 = lado2;
        this.lado3 = lado3;
    }

    // Getters && Setters
    public double getLado1() {
        return lado1;
    }

    public double getLado2() {
        return lado2;
    }

    public double getLado3() {
        return lado3;
    }

    // Métodos
    @Override
    public double area() {
        double p = (lado1 + lado2 + lado3) / 2;
        return Math.sqrt(p * (p - lado1) * (p - lado2) * (p - lado3));
    }

    @Override
    public String toString() {
        return "Triángulo:" +
                "\nNúmero de lados: " + numeroLados +
                "\nLado1: " + lado1 +
                ", Lado2: " + lado2 +
                ", Lado3: " + lado3;
    }
}