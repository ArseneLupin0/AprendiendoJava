package IntroduccionPRGATS.ProgramacionMedia.EjerciciosPOOInternos.Ejercicio5;

public class TriangulosIsosceles {

    // Atributos
    private double ladoIgual, ladoBase;

    // Método constructor
    public TriangulosIsosceles(double ladoIgual, double ladoBase) {
        this.ladoIgual = ladoIgual;
        this.ladoBase = ladoBase;
    }

    // Métodos Getter & Setter

    // Más métodos
    public double calcPerimetro() {
        return (ladoIgual * 2) + ladoBase;
    }

    public double calcArea() {
        return (ladoBase * Math.sqrt((ladoIgual * ladoIgual) - ((ladoBase * ladoBase) / 4))) / 2;
    }

    public String trianguloMayorSuperficie() {
        return "\nEl triángulo con mayor superficie es, " +
                "\nTiene base de: " + ladoBase +
                "\nTiene lado igual de: " + ladoIgual +
                "\nTiene una superficie de " + calcArea();
    }
}
