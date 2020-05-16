package IntroduccionPRGATS.ProgramacionMedia.EjerciciosPOOInternos.Ejercicio6;

import java.util.Scanner;

public class Complejos {

    // Atributos
    Scanner lectura = new Scanner(System.in);

    double r1, r2, i1, i2;

    // Método constructor
    public Complejos(double r1, double r2, double i1, double i2) {
        this.r1 = r1;
        this.r2 = r2;
        this.i1 = i1;
        this.i2 = i2;
    }

    // Métodos Getter & Setter

    // Más métodos
    public double sumaComplejosreales(double r1, double r2) {
        double sumaReal;
        sumaReal = r1 + r2;
        return sumaReal;
    }

    public double sumaComplejosimaginarios(double i1, double i2) {
        double sumaImaginaria;
        sumaImaginaria = i1 + i2;
        return sumaImaginaria;
    }

    public double multiplicacionReal(double r1, double r2, double i1, double i2) {
        double operacionReal, imaginario = -1;
        operacionReal = (r1 * r2 + ((i1 * i2) * (imaginario)));
        return operacionReal;
    }

    public double multiplicacionImaginaria(double r1, double i2, double i1, double r2) {
        double operacionImaginaria;
        operacionImaginaria = (r1 * i2 + i1 * r2);
        return operacionImaginaria;
    }

    public double multiplicacionEnteroComplejareal(double r1, double r2) {
        double operacionRealcompleja;
        operacionRealcompleja = r1 * r2;
        return operacionRealcompleja;
    }

    public double multiplicacionEnteroComplejaimaginaria(double r2, double i1) {
        double operacionImaginariacompleja;
        operacionImaginariacompleja = r2 * i1;
        return operacionImaginariacompleja;
    }

    public boolean igualdadnumerosComplejos(double r1, double r2, double i1, double i2) {

        boolean verdadero = false;

        if (r1 == r2 && i1 == i2) {
            verdadero = true;
        }
        return verdadero;
    }

    // Método para llamar al menú - hecho con IF (se puede hacer con switch)
    public void menu(int opcion) {

        if (opcion == 1) {
            double real1, real2;
            double imaginario1, imaginario2;

            System.out.println("Digite los datos para el primer numero complejo");
            System.out.print("Digiete la parte real del primer numero: ");
            real1 = lectura.nextDouble();
            System.out.print("Digite la parte imaginaria del primer numero: ");
            imaginario1 = lectura.nextDouble();

            System.out.println("\nDigite los datos para el segundo numero complejo");
            System.out.print("Digite la parte real del segundo numero: ");
            real2 = lectura.nextDouble();
            System.out.print("Digite la parte imaginaria del segundo numero: ");
            imaginario2 = lectura.nextDouble();
            sumaComplejosreales(real1, real2);
            sumaComplejosimaginarios(imaginario1, imaginario2);
            System.out.println("\nLa suma es: " + sumaComplejosreales(real1, real2) + " , " +
                    sumaComplejosimaginarios(imaginario1, imaginario2) + "i");
            System.out.println();

        }

        if (opcion == 2) {
            double real1, real2;
            double imaginario1, imaginario2;

            System.out.println("Digite los datos para el primer numero complejo");
            System.out.print("Digiete la parte real del primer numero: ");
            real1 = lectura.nextDouble();
            System.out.print("Digite la parte imaginaria del primer numero: ");
            imaginario1 = lectura.nextDouble();

            System.out.println("\nDigite los datos para el segundo numero complejo");
            System.out.print("Digite la parte real del segundo numero: ");
            real2 = lectura.nextDouble();
            System.out.print("Digite la parte imaginaria del segundo numero: ");
            imaginario2 = lectura.nextDouble();
            multiplicacionReal(real1, real2, imaginario1, imaginario2);
            multiplicacionImaginaria(real1, imaginario2, imaginario1, real2);
            System.out.println("\nLa multiplicacion es: " + multiplicacionReal(real1, real2, imaginario1, imaginario2) +
                    " , " + multiplicacionImaginaria(real1, imaginario2, imaginario1, real2) + "i");
            System.out.println();
        }

        if (opcion == 3) {
            double real1, real2;
            double imaginario1, imaginario2;

            System.out.println("Digite los datos para el primer numero complejo");
            System.out.print("Digiete la parte real del primer numero: ");
            real1 = lectura.nextDouble();
            System.out.print("Digite la parte imaginaria del primer numero: ");
            imaginario1 = lectura.nextDouble();

            System.out.println("\nDigite los datos para el segundo numero complejo");
            System.out.print("Digite la parte real del segundo numero: ");
            real2 = lectura.nextDouble();
            System.out.print("Digite la parte imaginaria del segundo numero: ");
            imaginario2 = lectura.nextDouble();

            if (igualdadnumerosComplejos(real1, real2, imaginario1, imaginario2)) {
                System.out.println("\nSon iguales los numeros complejos");
                System.out.println();
            } else {
                System.out.println("\nNo son iguales los numeros complejos");
                System.out.println();
            }
        }

        if (opcion == 4) {
            double real1, real2;
            double imaginario1;

            System.out.println("Digite los datos para el primer numero complejo");
            System.out.print("Digiete la parte real del primer numero: ");
            real1 = lectura.nextDouble();
            System.out.print("Digite la parte imaginaria del primer numero: ");
            imaginario1 = lectura.nextDouble();

            System.out.println("\nDigite los datos del numero real");
            System.out.print("Digite el numero real: ");
            real2 = lectura.nextDouble();

            multiplicacionEnteroComplejareal(real1, real2);
            multiplicacionEnteroComplejaimaginaria(real2, imaginario1);
            System.out.println("\nLa multiplicación es: " + multiplicacionEnteroComplejareal(real1, real2) + " , " +
                    multiplicacionEnteroComplejaimaginaria(real2, imaginario1) + "i");
            System.out.println();
        }

        if (opcion == 5) {
            System.out.println("Usted está saliendo del programa...");
        }

        if (opcion > 5) {
            System.out.println("Ingrese un número entre el rango indicando\n");
        }
    }
}
