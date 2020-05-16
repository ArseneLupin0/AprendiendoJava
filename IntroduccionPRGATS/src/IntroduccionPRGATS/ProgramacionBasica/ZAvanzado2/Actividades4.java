package IntroduccionPRGATS.ProgramacionBasica.ZAvanzado2;

import java.util.Arrays;
import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 * @author Oleg
 */
public class Actividades4 {

    public static void main(String[] args) {

//#############################################################################
//# Ejercicios de los ARREGLOS / ARRAYS / VECTORES - Video 45                 #
//#############################################################################

        /* Ejercicio 1
            Leer 5 números, guardarlos en un arreglo y mostrarlos en el mismo
            orden introducido.
        */
        int entrada = 0;
        int[] numeros = new int[5];

        for (int i = 0; i < 5; i++) {
            numeros[i] = Integer.parseInt(JOptionPane.showInputDialog((i + 1) + ". Inserte el números"));
        }
        System.out.print("Los números del arreglo son: ");
        for (int numero : numeros) {
            System.out.print(numero + ", ");
        }
        System.out.println("\b\b");

        /* Ejercicio 2
            Leer 5 números, guardarlos en un arreglo y mostrarlos en el orden
            inverso al introducido.
        */

        int entrada2 = 0;
        int[] numeros2 = new int[5];

        for (int i = 0; i < 5; i++) {
            numeros2[i] = Integer.parseInt(JOptionPane.showInputDialog((i + 1) + ". Inserte el número"));
        }
        System.out.print("Los números invertidos del arreglo son: ");
        for (int i = 4; i >= 0; i--) {
            System.out.print(+numeros2[i] + ", ");
        }
        System.out.println("\b\b");

//#############################################################################
//# Ejercicios de los ARREGLOS / ARRAYS / VECTORES - Video 46                 #
//#############################################################################

        /* Ejercicio 3
            Leer 5 números por teclado, almacenarlos en un arreglo y a continuación
            realizar la media de los números positivos, la media de los negativos
            y contar el número de ceros.
        */

        JOptionPane.showMessageDialog(null, "Empieza el ejercicio Nº 3");

        int contador;
        float entrada3, sumaPositivos = 0, sumaNegativos = 0, mediaPositivos, mediaNegativos,
                contadorCeros = 0, contadorPostivos = 0, contadorNegativos = 0;

        contador = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de números a poner en la Array"));
        int[] numeros3 = new int[contador];

        for (int i = 0; i < contador; i++) {
            numeros3[i] = (int) Float.parseFloat(JOptionPane.showInputDialog((i + 1) + ". Inserte el número"));
            if (numeros3[i] < 0) {
                contadorNegativos++;
                sumaNegativos += numeros3[i];
            } else if (numeros3[i] > 0) {
                contadorPostivos++;
                sumaPositivos += numeros3[i];
            } else contadorCeros++;
        }

        if (contadorPostivos == 0) {
            System.out.println("No hay ningún número positivo");
        }
        if (contadorNegativos == 0) {
            System.out.println("No hay ningún número negativo");
        }
        if (contadorPostivos != 0) {
            mediaPositivos = sumaPositivos / contadorPostivos;
            System.out.println("La media de números positivos es de: " + mediaPositivos);
        }
        if (contadorNegativos != 0) {
            mediaNegativos = sumaNegativos / contadorNegativos;
            System.out.println("La media de números negativos es de: " + mediaNegativos);
        }
        if (contadorCeros == 0) {
            System.out.println("No hay ningún 0");
        } else System.out.println("La cantidad de ceros son: " + contadorCeros + " en el Array");

        /* Ejercicio 4
            Leer 10 números enteros, guardarlos en un arreglo. Debemos mostrarlos
            en el siguiente orden: el primer, el último, el segundo, el penúltimo,
            el tercero, etc.
        */

        JOptionPane.showMessageDialog(null, "Empieza el ejercicio 4");
        int contador2;

        contador2 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de números a poner en la Array"));
        int[] numeros4 = new int[contador2];

        for (int i = 0; i < contador2; i++) {
            numeros4[i] = Integer.parseInt(JOptionPane.showInputDialog((i + 1) + ". Ingrese el número"));
        }
        for (int i = 0; i < contador2 / 2; i++) {
            System.out.println((i + 1) + ". " + numeros4[i] + "\n" + (contador2 - i) + ". " + numeros4[contador2 - 1 - i]);
        }

//#############################################################################
//# Ejercicios de los ARREGLOS / ARRAYS / VECTORES - Video 47                 #
//#############################################################################

        /* Ejercicio 5
            Leer por teclado dos tablas de 10 números enteros y mezclarlas en una
            tercera de la forma: el 1º de A, el 1º de B, el 2º de A, el 2º de B...
        */

        JOptionPane.showMessageDialog(null, "Empieza el ejercicio 5");

        int largoArray = Integer.parseInt(JOptionPane.showInputDialog("1. Ingrese "
                + "la cantidad de números que va a haber en los arrays"));
        int largoArray2 = largoArray * 2;

        int[] array1 = new int[largoArray];
        int[] array2 = new int[largoArray];
        int[] array3 = new int[largoArray2];

        JOptionPane.showMessageDialog(null, "Define el primer array");
        System.out.print("Los valores del primer array son: ");
        for (int i = 0; i < largoArray; i++) {
            array1[i] = Integer.parseInt(JOptionPane.showInputDialog((i + 1) + ". Ingrese el valor"));
            System.out.print(array1[i] + ", ");
        }
        System.out.println("\b\b");

        JOptionPane.showMessageDialog(null, "Define el segundo array");
        System.out.print("Los valores del segundo array son: ");
        for (int i = 0; i < largoArray; i++) {
            array2[i] = Integer.parseInt(JOptionPane.showInputDialog((i + 1) + ". Ingrese el valor"));
            System.out.print(array2[i] + ", ");
        }
        System.out.println("\b\b");

        int j = 0;
        for (int i = 0; i < (largoArray); i++) {
            array3[j] = array1[i];
            j++;
            array3[j] = array2[i];
            j++;
        }

        System.out.print("Los valores del tercer array son: ");
        for (int i = 0; i < largoArray2; i++) {
            System.out.print(array3[i] + ", ");
        }
        System.out.println("\b\b");

        /* Ejercicio 6
            Leer los datos correspondiente a dos tablas de 12 elementos numéricos,
            y mezclarlos en una tercera de la forma: 3 de la tabla A, 3 de la tabla B,
            otros 3 de A, otros 3 de la B, etc.
        */

        JOptionPane.showMessageDialog(null, "Empieza el ejercicio 6");

        int largoArray3 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la "
                + "cantidad de números que habrá en los arreglos"));
        int largoArray4 = largoArray3 * 2;

        int[] array4 = new int[largoArray3];
        int[] array5 = new int[largoArray3];
        int[] array6 = new int[largoArray4];

        JOptionPane.showMessageDialog(null, "Define el primer array");
        System.out.print("Los valores del primer array son: ");

        for (int i = 0; i < largoArray3; i++) {
            array4[i] = Integer.parseInt(JOptionPane.showInputDialog((i + 1) + ". Ingrese el valor"));
            System.out.print(array4[i] + ", ");
        }
        System.out.println("\b\b");

        JOptionPane.showMessageDialog(null, "Define el segundo array");
        System.out.print("Los valores del segundo array son: ");

        for (int i = 0; i < largoArray3; i++) {
            array5[i] = Integer.parseInt(JOptionPane.showInputDialog((i + 1) + ". Ingrese el valor"));
            System.out.print(array5[i] + ", ");
        }
        System.out.println("\b\b");

        System.out.println("Los valores del tercer array son: ");
        int j1 = 0;
        for (int i = 0; i < largoArray3; i += 3) {
            array6[j1] = array4[i];
            j1++;
            array6[j1] = array4[i + 1];
            j1++;
            array6[j1] = array4[i + 2];
            j1++;
            array6[j1] = array5[i];
            j1++;
            array6[j1] = array5[i + 1];
            j1++;
            array6[j1] = array5[i + 2];
            j1++;
        }

        System.out.print("Los valores del tercer array son: ");
        for (int i = 0; i < largoArray4; i++) {
            System.out.print(array6[i] + ", ");
        }
        System.out.println("\b\b");

//#############################################################################
//# Ejercicios de los ARREGLOS / ARRAYS / VECTORES - Video 48                 #
//#############################################################################

        /* Ejercicio 7
            Leer por teclado una serie de 10 números enteros. La aplicación debe
            indicarnos si los números están ordenados de forma creciente,
            decreciente, o si están desordenados.
        */

        JOptionPane.showMessageDialog(null, "Empieza el ejercicio 7");

        int largoArray5 = Integer.parseInt(JOptionPane.showInputDialog("Indique cuantos números quiere que tenga su array"));
        int[] array7 = new int[largoArray5];
        boolean creciente = false, decreciente = false;

        for (int i = 0; i < largoArray5; i++) {
            array7[i] = Integer.parseInt(JOptionPane.showInputDialog((i + 1) + ". Ingrese un número "));
        }

        for (int i = 0; i < largoArray5 - 1; i++) {
            if (array7[i] < array7[i + 1]) {
                creciente = true;
            }
            if (array7[i] > array7[i + 1]) {
                decreciente = true;
            }
        }
        if (creciente == true && decreciente == false) { // Todo Solucionar condiciones, y simplificaciones
            System.out.println("El arreglo está en forma creciente");
        } else if (creciente == false && decreciente == true) {
            System.out.println("El arreglo está en forma decreciente");
        } else if (creciente == true && decreciente == true) {
            System.out.println("El arreglo está desordenada");
        } else if (creciente == false && decreciente == false) {
            System.out.println("Todos los números del arreglo son iguales");
        }

        /* Ejercicio 8
            Diseñar una aplicación que declare una tabla de 10 elemntos enteros.
            Leer mediante el teclado 8 números. Después se debe pedir un número
            y una posición, insertarlo en la posición indicada, desplazando los
            que estén por detrás.
        */

        JOptionPane.showMessageDialog(null, "Ejercicio número 8");

        int largoArray6 = Integer.parseInt(JOptionPane.showInputDialog("Indique la cantidad de número que quiere que tenga el array"));
        int[] array8 = new int[largoArray6];

        for (int i = 0; i < largoArray6 - 2; i++) {
            array8[i] = Integer.parseInt(JOptionPane.showInputDialog((i + 1) + ". Ingrese un número"));
        }

        for (int i = 0; i < 2; i++) {
            int posicion = Integer.parseInt(JOptionPane.showInputDialog((i + 1) + ". Ingrese la posición en la que desee insertar el número (" + (0) + "-" + (largoArray6 - 1) + ")"));
            int nuevoNumero = Integer.parseInt(JOptionPane.showInputDialog((i + 1) + ". Ingrese el número"));
            for (int j2 = largoArray6 - 1; j2 > posicion; j2--) {
                array8[j2] = array8[j2 - 1];
            }

            // Otra forma
//            if (largoArray6 - 1 - posicion >= 0)
//                System.arraycopy(array8, posicion, array8, posicion + 1, largoArray6 - 1 - posicion);
            array8[posicion] = nuevoNumero;
        }

        System.out.print("El array es: ");
        for (int i : array8) {
            System.out.print(i + ", ");
        }
        System.out.println("\b\b");

//#############################################################################
//# Ejercicios de los ARREGLOS / ARRAYS / VECTORES - Video 49                 #
//#############################################################################

        /* Ejercicio 9
            Crear un programa que lea por teclado una tabla de 10 números enteros
            y la desplace una posición hacia abajo: el primero pasa a ser el
            segundo, el segundo pasa a ser el tercero y así sucesivamente.
            El último pasa a ser primero.
        */

        JOptionPane.showMessageDialog(null, "Empieza el ejercicio 9");

        int largoArray7 = Integer.parseInt(JOptionPane.showInputDialog("Indique la cantidad de número que quiere que tenga el array"));
        int[] array9 = new int[largoArray7];

        for (int i = 0; i < largoArray7; i++) {
            array9[i] = Integer.parseInt(JOptionPane.showInputDialog((i + 1) + ". Ingrese un número"));
        }
        int ultimo = array9[largoArray7 - 1];

        System.out.print("El arreglo es: ");
        for (int i : array9) {
            System.out.print(i + ", ");
        }
        System.out.println("\b\b");

        for (int i = largoArray7 - 2; i >= 0; i--) { // Avanzar una posición abajo en el arreglo
            array9[i + 1] = array9[i];
        }

        // Otra forma
//        System.arraycopy(array9, 0, array9, 1, largoArray7 - 2 + 1);

        array9[0] = ultimo;

        System.out.print("El nuevo arreglo es: ");
        for (int i : array9) {
            System.out.print(i + ", ");
        }
        System.out.println("\b\b");

        /* Ejercicio 10
            Crear un programa que lea por teclado una tabla de 10 números enteros
            y la desplace N posiciones en el arreglo (N es digitado por el usuario).
        */

        JOptionPane.showMessageDialog(null, "Empieza el ejercicio 10");

        int largoArray8 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidiad de números que quiera que tenga el array"));
        int[] array10 = new int[largoArray8];
        int[] array11 = new int[largoArray8];

        for (int i = 0; i < largoArray8; i++) {
            array10[i] = Integer.parseInt(JOptionPane.showInputDialog((i + 1) + ". Ingrese un número"));
        }

        System.out.print("El array es: ");
        for (int i : array10) {
            System.out.print(i + ", ");
        }
        System.out.println("\b\b");

        int posicion = Integer.parseInt(JOptionPane.showInputDialog("Ingrese cuantas posiciones quiere mover el arreglo"));

        for (int i = 0; i < largoArray8; i++) {
            array11[(posicion + i) % largoArray8] = array10[i];
        }

        System.out.print("El valor del nuevo array es: ");
        for (int i : array11) {
            System.out.print(i + ", ");
        }
        System.out.println("\b\b");

//#############################################################################
//# Ejercicios de los ARREGLOS / ARRAYS / VECTORES - Video 50                 #
//#############################################################################

        /* Ejercicio 11 - By my self
            Leer 5 elementos numéricos que se introducirán ordenados de forma
            creciente. Éstos los guardaremos en una tabla de tamaño 10. Leer
            un número N, e insertarlo en el lugar adecuado para que la tabla
            continue ordenada.
        */

        JOptionPane.showMessageDialog(null, "Empieza el ejercicio 11");

        boolean ordenadoCreciente = true, seRepite = false, esPar = true;
        int largoarray9, sitioNumero = 0, z = 0;
        do {
            largoarray9 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese cuantos valores quiere que tenga su array"));
            if (largoarray9 % 2 != 0) {
                JOptionPane.showMessageDialog(null, "El largo del array es impar, y tiene que ser par");
                esPar = false;
            } else esPar = true;

        } while (!esPar);

        int[] array12 = new int[largoarray9];

        do {
            for (int i = 0; i < (largoarray9 / 2); i++) {
                array12[i] = Integer.parseInt(JOptionPane.showInputDialog((i + 1) + ". Ingrese el número"));
            }

            for (int i = 0; i < (largoarray9 / 2) - 1; i++) {
                if (array12[i] < array12[i + 1]) {
                    ordenadoCreciente = true;
                    seRepite = false;
                }
                if (array12[i] > array12[i + 1]) {
                    ordenadoCreciente = false;
                    seRepite = false;
                }
                if (array12[i] == array12[i + 1]) {
                    seRepite = true;
                    ordenadoCreciente = true;
                }
            }

            if (!ordenadoCreciente) {
                JOptionPane.showMessageDialog(null, "El arreglo no está ordenado de forma creciente, digite de nuevo");
            }

            if (seRepite) {
                JOptionPane.showMessageDialog(null, "El arreglo tiene todos los números repetidos, digite de nuevo");
            }

        } while (!ordenadoCreciente || seRepite);

        System.out.print("Los primeros " + (largoarray9 / 2) + " números de su arreglo son: ");
        for (int i : array12) {
            System.out.print(i + ", ");
        }
        System.out.println("\b\b");
        do {
            int inserta = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un número nuevo al Array"));
            while (array12[z] <= inserta && z < largoarray9) { // TODO Problema de último AND, de Always True Solucionar
                sitioNumero++;
                z++;
            }

            for (int i = largoarray9 / 2; i >= sitioNumero; i--) {
                array12[i + 1] = array12[i];
            }

            // Otra forma
//            if (largoarray9 / 2 + 1 - sitioNumero >= 0)
//                System.arraycopy(array12, sitioNumero, array12, sitioNumero + 1, largoarray9 / 2 + 1 - sitioNumero);

            array12[sitioNumero] = inserta;

            System.out.print("El nuevo arreglo queda: ");
            for (int i : array12) {
                System.out.print(i + ", ");
            }

            System.out.println("\b\b");

            sitioNumero = 0;
            z = 0;

        } while (array12[largoarray9 - 1] == 0); // Sin resolver en formato bucle

        // Ejercicio 11 resuelto

        JOptionPane.showMessageDialog(null, "Ejercicio 11 - Forma fácil");

        int[] array13 = new int[10];
        boolean creciente2 = true;
        JOptionPane.showMessageDialog(null, "Su arreglo tiene 10 números que ingresar");

        do {
            for (int i = 0; i < 5; i++) {
                array13[i] = Integer.parseInt(JOptionPane.showInputDialog((i + 1) + ". Digite un número"));
            }

            for (int i = 0; i < 4; i++) {
                if (array13[i] < array13[i + 1]) {
                    creciente2 = true;
                }
                if (array13[i] > array13[i + 1]) {
                    creciente2 = false;
                    break;
                }
            }

            if (!creciente2) {
                JOptionPane.showMessageDialog(null, "El arreglo no está ordenado correctamente");
            }
        } while (!creciente2);

        System.out.print("Su arreglo es: ");

        for (int i : array13) {
            System.out.print(i + ", ");
        }
        System.out.println("\b\b");

        int numero = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese su número a añadir al arreglo")),
                j3 = 0, sitioNumero2 = 0;

        while (array13[j3] < numero && j3 < 5) {
            sitioNumero2++;
            j3++;
        }

        for (int i = 4; i >= sitioNumero2; i--) {
            array13[i + 1] = array13[i];
        }

        // Otra forma
//        if (5 - sitioNumero2 >= 0) System.arraycopy(array13, sitioNumero2, array13, sitioNumero2 + 1, 5 - sitioNumero2);

        array13[sitioNumero2] = numero;

        System.out.print("El array ordenado es: ");

        for (int i : array13) {
            System.out.print(i + "-");
        }
        System.out.println("\b");

        /* Ejercicio 12
            Leer por teclado una tabla de 10 elementos numéricos enteros y una
            posición (entre 0 y 9). Eliminar el elemento situado en la posición
            dada sin dejar huecos.
        */

        JOptionPane.showMessageDialog(null, "Empieza el ejercicio 12");

        int largoArray10 = Integer.parseInt(JOptionPane.showInputDialog("Indique cuantos elementos quiere que tenga su array"));
        int[] array14 = new int[largoArray10];
        int posicion1;

        for (int i = 0; i < largoArray10; i++) {
            array14[i] = Integer.parseInt(JOptionPane.showInputDialog((i + 1) + ". Ingrese el valor del número"));
        }

        System.out.print("Su array es: ");

        for (int i : array14) {
            System.out.print(i + ", ");
        }
        System.out.println("\b\b");

        do {
            posicion1 = Integer.parseInt(JOptionPane.showInputDialog("Digite una posición del array, entre 1-10"));
        } while (posicion1 < 0 || posicion1 > largoArray10);

        for (int i = posicion1 - 1; i < largoArray10 - 1; i++) {
            array14[i] = array14[i + 1];
        }

        // Otra forma
//        if (largoArray10 - 1 - posicion1 - 1 >= 0)
//            System.arraycopy(array14, posicion1 - 1 + 1, array14, posicion1 - 1, largoArray10 - 1 - posicion1 - 1);

        System.out.print("El nuevo array es: ");

        for (int i = 0; i < largoArray10 - 1; i++) {
            System.out.print(array14[i] + ", ");
        }
        System.out.println("\b\b");

//#############################################################################
//# Ejercicios de los ARREGLOS / ARRAYS / VECTORES - Video 51                 #
//#############################################################################

        /* Ejercicio 13
            Leer 10 enteros en una tabla. Guardar en otra tabla los elemntos
            pares de la primera, y a continuación los elementos impares.
        */

        JOptionPane.showMessageDialog(null, "Empieza el ejercicio 13");

        int largoArray11 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el largo del array"));
        int[] array15 = new int[largoArray11];
        int esPar2 = 0, esImpar = 0, largoPar = 0, largoImpar = 0;

        for (int i = 0; i < largoArray11; i++) {
            array15[i] = Integer.parseInt(JOptionPane.showInputDialog((i + 1) + ". Ingrese un número"));

            if (array15[i] % 2 == 0) {
                largoPar++;
            } else {
                largoImpar++;
            }
        }

        System.out.print("Tu array es: ");
        for (int i : array15) {
            System.out.print(i + ", ");
        }
        System.out.println("\b\b");

        int[] array16 = new int[largoPar];
        int[] array17 = new int[largoImpar];

        for (int i = 0; i < largoArray11; i++) {
            if (array15[i] % 2 == 0) {
                array16[esPar2] = array15[i];
                esPar2++;
            } else {
                array17[esImpar] = array15[i];
                esImpar++;
            }
        }

        System.out.print("Hay " + largoPar + " pares en el array: ");
        for (int i : array16) {
            System.out.print(i + ", ");
        }
        System.out.println("\b\b");

        System.out.print("Hay " + largoPar + " impares en el array: ");
        for (int i : array17) {
            System.out.print(i + ", ");
        }
        System.out.println("\b\b");

        /* Ejercicio 14
            Leer dos series de 10, enteros que estarán ordenados
            crecientemente. Copiar (fusionar) las dos tablas en una tercera, de
            forma que sigan ordenados.
        */

        JOptionPane.showMessageDialog(null, "Empieza el ejercicio 14");

        int largoArray12 = Integer.parseInt(JOptionPane.showInputDialog("Ingresa el largo del primer array"));
        int largoArray13 = Integer.parseInt(JOptionPane.showInputDialog("Ingresa el largo del segundo array"));
        int largoArray14 = largoArray12 + largoArray13;

        int[] array18 = new int[largoArray12];
        int[] array19 = new int[largoArray13];
        int[] array20 = new int[largoArray14];

        JOptionPane.showMessageDialog(null, "Ingresa los valores de tu primer array");
        for (int i = 0; i < largoArray12; i++) {
            array18[i] = Integer.parseInt(JOptionPane.showInputDialog((i + 1) + ". Ingresa el número"));
        }
        JOptionPane.showMessageDialog(null, "Ingresa los valores de tu segundo array");
        for (int i = 0; i < largoArray13; i++) {
            array19[i] = Integer.parseInt(JOptionPane.showInputDialog((i + 1) + ". Ingresa el número"));
        }

        System.out.print("El primer array es: ");
        for (int i : array18) {
            System.out.print(i + ", ");
        }
        System.out.println("\b\b");

        System.out.print("El segundo array es: ");
        for (int i : array19) {
            System.out.print(i + ", ");
        }
        System.out.println("\b\b");

        int j4 = 0, contador1 = 0;
        for (; contador1 < largoArray12; contador1++) {
            array20[j4] = array18[contador1];
            j4++;
        }

        contador1 = largoArray12;
        for (int i = 0; i < largoArray13; i++) {
            array20[contador1] = array19[i];
            contador1++;
        }

        System.out.print("Los valores del tercer array son: ");
        for (int i : array20) {
            System.out.print(i + ", ");
        }
        System.out.println("\b\b");

        Arrays.sort(array20);
        System.out.print("Los valores del tercer array ordenados son: " + Arrays.toString(array20).substring(1));
        System.out.println("\b");

//#############################################################################
//# Ejercicios de los ARREGLOS / ARRAYS / VECTORES - Video 52                 #
//#############################################################################

        /* Ejercicio 15
            Leer 10 enteros ordenados crecientemente. Leer N y buscarlo en la
            tabla. Se debe mostrar la posición en que se encuentra. Si no está,
            indicarlo con un mensaje.
        */

        JOptionPane.showMessageDialog(null, "Empieza el ejercicio 15");

        int largoarray14 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el largo del array"));
        int[] array21 = new int[largoarray14];

        for (int i = 0; i < largoarray14; i++) {
            array21[i] = Integer.parseInt(JOptionPane.showInputDialog((i + 1) + ". Ingrese el número"));
        }

        System.out.print("Tu array es: ");
        for (int i : array21) {
            System.out.print(i + ", ");
        }
        System.out.println("\b\b");

        System.out.print("Tu array ordenado es: ");
        Arrays.sort(array21);
        for (int i : array21) {
            System.out.print(i + ", ");
        }
        System.out.println("\b\b");

        int entrada1, i = 0;
        do {
            entrada1 = Integer.parseInt(JOptionPane.showInputDialog("Ingresa un número a buscar en el array"));

            while (i < largoarray14 - 1 && array21[i] < entrada1) {
                i++;
            }

            if (array21[i] == largoarray14) {
                System.out.println("El número no existe en el array");
            } else {
                if (array21[i] == entrada1) {
                    System.out.println("Su número " + entrada1 + " se encuentra en la posición " + (i + 1));
                } else {
                    System.out.println("El número no existe en el array");
                }
            }
        } while (entrada1 < 0 && entrada1 >= largoarray14); // TODO Pequeño error de que siempre es falso chequear

        /* Ejercicio 16
            Queremos desarrollar una aplicación que nos ayude a gestionar las
            notas de un centro educativo. Cada grupo (o clase) está compuesto
            por 5 alumnos. Se pide leer las notas del primer, segundo y tercer
            trimestre de un grupo. Debemos mostrar al final: la nota media del
            grupo en cada trimestre, y la media del alumno que se encuentra en
            la posición N (N se lee por teclado).
        */

        JOptionPane.showMessageDialog(null, "Empieza el ejercicio 16");

        Scanner entrada5 = new Scanner(System.in);
        float[] array22 = new float[5];
        float[] array23 = new float[5];
        float[] array24 = new float[5];

        float mediaPrimerSum = 0, mediaSegundoSum = 0, mediaTercerSum = 0;
        float mediaPrimera, mediaSegunda, mediaTercera;
        int digite, nAlumno;
        float mediaAlumno;

        System.out.println("\tNOTAS DEL PRIMER TRIMESTRE");
        for (int i2 = 0; i2 < 5; i2++) {
            System.out.print("Nota del alumno " + (i2 + 1) + ": ");
            array22[i2] = entrada5.nextFloat();
            mediaPrimerSum += array22[i2];
        }

        System.out.println("\tNOTAS DEL SEGUNDO TRIMESTRE");
        for (int i1 = 0; i1 < 5; i1++) {
            System.out.print("Nota del alumno " + (i1 + 1) + ": ");
            array23[i1] = entrada5.nextFloat();
            mediaSegundoSum += array23[i1];
        }

        System.out.println("\tNOTAS DEL TERCER TRIMESTRE");
        for (int i3 = 0; i3 < 5; i3++) {
            System.out.print("Nota del alumno " + (i3 + 1) + ": ");
            array24[i3] = entrada5.nextFloat();
            mediaTercerSum += array24[i3];
        }

        mediaPrimera = mediaPrimerSum / 5;
        mediaSegunda = mediaSegundoSum / 5;
        mediaTercera = mediaTercerSum / 5;

        System.out.println("\t\nNOTA MEDIA DEL GRUPO 1 - 1º TRIMESTRE");
        System.out.println("Nota media: " + mediaPrimera);
        System.out.println("\t\nNOTA MEDIA DEL GRUPO 1 - 2º TRIMESTRE");
        System.out.println("Nota media: " + mediaSegunda);
        System.out.println("\t\nNOTA MEDIA DEL GRUPO 1 - 3º TRIMESTRE");
        System.out.println("Nota media: " + mediaTercera);

        do {
            System.out.print("\n\tElija la opción"
                    + "\n1.- Nombra número de alumno"
                    + "\n2.- Salir"
                    + "\nElija la opción: ");
            digite = entrada5.nextInt();
            switch (digite) {
                case 1:
                    System.out.print("Digite el alumno del cuál quiera conocer su media: ");
                    nAlumno = entrada5.nextInt();
                    mediaAlumno = (array22[nAlumno - 1] + array23[nAlumno - 1] + array24[nAlumno - 1]) / 3;
                    System.out.println("La media del alumno " + nAlumno + " es de: " + mediaAlumno);
                    break;
                case 2:
                    System.out.println("\nNos vemos!");
            }
        } while (digite != 2);
    }
}