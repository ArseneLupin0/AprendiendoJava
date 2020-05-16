package IntroduccionPRGATS.ProgramacionMedia.EjerciciosPOOInternos.Ejercicio1;

public class ProgramaCuadrilatero {

//#############################################################################
//# Ejercicio 1 - POO - Video 72                                              #
//#############################################################################

    /* Ejercicio 1
        Construir un programa que calcule el área y el perímetro de un cuadrilátero
        dada la longitud de sus dos lados. Los valores de la longitud deberán introducirse
        por líena de ordenes. Si es un cuadrado, sólo se proporcionará la longitud de uno
        de los lados al constructor.
     */

    // Atributos
    private double lado1;
    private double lado2;

    // Constructores
    public ProgramaCuadrilatero(double lado1, double lado2) {
        this.lado1 = lado1;
        this.lado2 = lado2;
    }

    public ProgramaCuadrilatero(double lado1) {
        this.lado1 = this.lado2 = lado1;
    }

    // Getter & Setter
    public double getAreaCuadri() {
        double areaCuadri = lado1 * lado2;
        return areaCuadri;
    }

    public double getPerimetroCuadri() {
        double perimetroCuadri = (2*lado1) + (2*lado2);
        return perimetroCuadri;
    }

    public double getAreaCuadrado() {
        double areaCuadrado = lado1 * 4;
        return areaCuadrado;
    }

    public double getPerimetroCuadrado() {
        double perimetroCuadri = lado1*lado1;
        return perimetroCuadri;
    }

    // Métodos
}
