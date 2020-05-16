// Introducción a los métodos - Parámetros y Argumentos
package IntroduccionPRGATS.ProgramacionMedia.IntermedioPOO;

public class Operacion2 {

//#############################################################################
//# Introducción a POO, Parámetros y Argumentos - Video 64 Continuación       #
//#############################################################################

    // Atributos
    int suma;
    int resta;
    int multiplicacion;
    int division;

    // Métodos

    // Método para sumar ambos números (declaramos los parámetros locales)
    public void sumar(int numero1, int numero2){
        suma = numero1 + numero2;
    }

    // Método para restar ambos números
    public void restar(int numero1, int numero2){
        resta = numero1 - numero2;
    }

    // Método para multiplicar ambos números
    public void multiplicar(int numero1, int numero2){
        multiplicacion = numero1 * numero2;
    }

    // Método para dividir ambos números
    public void dividir(int numero1, int numero2){
        division = numero1 / numero2;
    }

    public void mostrarResultados(){
        System.out.println("La suma es: "+suma);
        System.out.println("La resta es: "+resta);
        System.out.println("La multiplicación es: "+multiplicacion);
        System.out.println("La división es: "+division);
    }
}
