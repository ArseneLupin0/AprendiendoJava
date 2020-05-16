// Introducción a los métodos, retornos de valores
package IntroduccionPRGATS.ProgramacionMedia.IntermedioPOO;

public class Operacion3 {

//#############################################################################
//# Introducción a POO, Métodos, Retorno de valores - Video 65 Continuación   #
//#############################################################################

    // Atributos

    // Métodos

    // Método para sumar ambos números (declaramos los parámetros locales)
    public int sumar(int numero1, int numero2){
        int suma = numero1 + numero2;
        return suma;
    }

    // Método para restar ambos números
    public int restar(int numero1, int numero2){
        int resta = numero1 - numero2;
        return resta;
    }

    // Método para multiplicar ambos números
    public int multiplicar(int numero1, int numero2){
        int multiplicacion = numero1 * numero2;
        return multiplicacion;
    }

    // Método para dividir ambos números
    public int dividir(int numero1, int numero2){
        int division = numero1 / numero2;
        return division;
    }

    public void mostrarResultados(int suma, int resta, int multiplicacion, int division){
        System.out.println("La suma es: "+suma);
        System.out.println("La resta es: "+resta);
        System.out.println("La multiplicación es: "+multiplicacion);
        System.out.println("La división es: "+division);
    }
}
