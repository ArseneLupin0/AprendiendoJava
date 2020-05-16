package IntroduccionPRGATS.ProgramacionBasica.Medio4;

import javax.swing.JOptionPane;

/**
 * @author Oleg
 */
public class Actividades3 {

    public static void main(String[] args) {

//#############################################################################
//# Introducción a los ejercicios - Ciclos While - Video 31                   #
//#############################################################################

        /* Ejercicio 1
           Leer un número y mostrar su cuadrado, repetir el proceso hasta que
           se introduzca un número negativo.
        */
        JOptionPane.showMessageDialog(null, "Empieza el Ejercicio 1"
                + "\nLeer un número y mostrar su cuadrado, número negativo para parar.");

        int numero, cuadrado;

        numero = Integer.parseInt(JOptionPane.showInputDialog("Digite un número"));

        while (numero >= 0) {
            cuadrado = (int) Math.pow(numero, 2);
            JOptionPane.showMessageDialog(null, "El cuadrado de " + numero + " es: " + cuadrado);

            numero = Integer.parseInt(JOptionPane.showInputDialog("Digite otro número"));
        }
        JOptionPane.showMessageDialog(null, "El número escrito es negativo");

        /* Ejercicio 2
           Leer un número e indicar si es positivo o negativo. El proceso se
           repetirá hasta que se introduzca un 0.
        */

        int numero2;

        JOptionPane.showMessageDialog(null, "Empieza el Ejercicio 2"
                + "\nLeer un número, indica si es positivo o negativo, hasta ue se ingrese un 0");
        numero2 = Integer.parseInt(JOptionPane.showInputDialog("Inserte un número"));

        while (numero2 != 0) {
            if (numero2 > 0) {
                JOptionPane.showMessageDialog(null, "El número ingresado es positivo (" + numero2 + ")");
            } else {
                JOptionPane.showMessageDialog(null, "El número ingresado es negativo (" + numero2 + ")");
            }
            numero2 = Integer.parseInt(JOptionPane.showInputDialog("Inserte un número"));
        }
        JOptionPane.showMessageDialog(null, "El número introducido es 0");

//#############################################################################
//# Introducción a los ejercicios - Ciclos While - Video 32                   #
//#############################################################################

        /* Ejercicio 3
           Leer números hasta que se introduzca un 0. Para cada uno indicar si
           es par o impar.
        */

        int numero3;

        JOptionPane.showMessageDialog(null, "Empieza el Ejercicio 3"
                + "\nLeer un número, para saber si es par o impar, hasta que se introduzca un 0.");
        numero3 = Integer.parseInt(JOptionPane.showInputDialog("Inserte un número"));

        while (numero3 != 0) {
            if (numero3 % 2 == 0) {
                JOptionPane.showMessageDialog(null, "El número " + numero3 + " es un número par");
            } else {
                JOptionPane.showMessageDialog(null, "El número " + numero3 + " es un número impar");
            }
            numero3 = Integer.parseInt(JOptionPane.showInputDialog("Inserte un número"));
        }
        JOptionPane.showMessageDialog(null, "El número introducido es 0");

        /* Ejercicio 4
           Pedir números hasta que se teclee uno negativo, y mostrar cuántos
           números se han introducido.
        */

        int numero4, contador = 0;

        JOptionPane.showMessageDialog(null, "Empieza el Ejercicio 4"
                + "\nPedir números hasta uno negativo, mostrar cuantos número se han introducido");

        do {
            numero4 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un número"));
            contador++;
        }
        while (numero4 >= 0);

        JOptionPane.showMessageDialog(null, "Total de número insertados: " + contador);

//#############################################################################
//# Introducción a los ejercicios - Ciclos While - Video 33                   #
//#############################################################################

        /* Ejercicio 5
           Realizar un juego para adivinar un número. Para ello generar un número 
           aleatorio entre 0-100, y luego ir pidiendo números indicando "es mayor"
           o "es menor" según sea mayor o menor con respecto a N. El proceso termina 
           cuando el usuario acierta y mostrar el número de intentos.
        */

        int numero5, aleatorio, contador2 = 1;

        JOptionPane.showMessageDialog(null, "Empieza el Ejercicio 5"
                + "\nJuego de adivinanza entre 0 y 100");
        aleatorio = (int) (Math.random() * 100);
        JOptionPane.showMessageDialog(null, "El número aleatorio sea ha generado: X");

        numero5 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un número del 1-100"));

        if (numero5 != aleatorio) {
            while (aleatorio != numero5) {
                if ((numero5 <= 100) && (numero5 >= 0)) {
                    while (aleatorio != numero5) {
                        if ((numero5 > aleatorio) && (numero5 <= 100) && (numero5 >= 0)) {
                            JOptionPane.showMessageDialog(null, "Tu número es menor que aleatorio"
                                    + "\nLlevas " + contador2 + " intentos");
                        } else if ((numero5 < aleatorio) && (numero5 <= 100) && (numero5 >= 0)) {
                            JOptionPane.showMessageDialog(null, "Tu número es mayor que aleatorio"
                                    + "\nLlevas " + contador2 + " intentos");
                        } else {
                            JOptionPane.showMessageDialog(null, "El número ingresado no está en el rango del 1-100");
                        }
                        numero5 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese otro número"));
                        contador2++;
                    }
//                } else if (numero5 == aleatorio) { // El corrector dice que esta sentencia no es necesario, por probar!
//                    JOptionPane.showMessageDialog(null, "¡Has averiguado el número y es: " + numero5 + "!"
//                            + "\nLo has adivinado en: " + contador2 + " intentos");
                } else {
                    contador2++;
                    numero5 = Integer.parseInt(JOptionPane.showInputDialog("El número ingresado no está en el rango del 1-100"
                            + "\nLlevas " + contador2 + " intentos sumando este intento"));
                }
            }
            JOptionPane.showMessageDialog(null, "¡Has averiguado el número y es: " + numero5 + "!"
                    + "\nLo has adivinado en: " + contador2 + " intentos");
        } else
            JOptionPane.showMessageDialog(null, "¡Extraordinario, has averiguado el número en un intento: " + numero5 + "!");

        /* Ejercicio 6
           Pedir números hasta que se teclee un 0, mostrar la suma de todos los
           números introducidos.
        */

        int numero6, suma = 0;

        JOptionPane.showMessageDialog(null, "Empieza el Ejercicio 6");
        JOptionPane.showMessageDialog(null, "Introduce números para sumarlos y parar con un 0");

        do {
            numero6 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un número"));
            suma += numero6;
        }
        while (numero6 != 0);
        JOptionPane.showMessageDialog(null, "La suma de todos los números es de: " + suma);


//#############################################################################
//# Introducción a los ejercicios - Ciclos While, do y for - Video 34         #
//#############################################################################

        /* Ejercicio 7
           Pedir números hasta que se introduzca uno negativo, y calcular la media.
        */

        int numero7, media, suma2 = 0;

        JOptionPane.showMessageDialog(null, "Empieza el Ejercicio 7");

        do {
            numero7 = Integer.parseInt(JOptionPane.showInputDialog("Introduce un número"));
            suma2 += numero7;
        }
        while (numero7 >= 0);
        suma2 -= numero7; //Restamos el propio número negativo para que no repercuta en la operación
        media = suma2 / 2;
        JOptionPane.showMessageDialog(null, "La media de los números introducidos es: " + media);

        /* Ejercicio 8
           Pedir un número N, y mostrar todos los números del 1 al N
        */
        JOptionPane.showMessageDialog(null, "Empieza el Ejercicio 8");

        int numero8;

        numero8 = Integer.parseInt(JOptionPane.showInputDialog("Introduce el número hasta donde quieres que se pare la serie"));
        System.out.print("Los números son: ");

        for (int i = 0; i <= numero8; i++) {
            System.out.print(i + ", ");
        }
        System.out.println("\b\b");

//#############################################################################
//# Introducción a los ejercicios - Ciclos While, do y for - Video 35         #
//#############################################################################

        /* Ejercicio 9
           Escribir todos los números del 100 al 0 de 7 en 7.
        */

        JOptionPane.showMessageDialog(null, "Empieza el Ejercicio 9");

        System.out.print("Los números del 100 al 0 en 7 en 7 son: ");
        for (int i = 100; i >= 0; i -= 7) {
            System.out.print(i + ", ");
        }
        System.out.println("\b\b");
        
        /* Ejercicio 10
           Pedir 10 números y escribir la suma total.
        */

        JOptionPane.showMessageDialog(null, "Empieza el Ejercicio 10");

        int numero9, suma3 = 0;

        for (int i = 1; i <= 10; i++) {
            numero9 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el " + i + " número"));
            suma3 += numero9;
        }
        JOptionPane.showMessageDialog(null, "La suma de los 10 digitos es de: " + suma3);

//#############################################################################
//# Introducción a los ejercicios - Ciclos While, do y for - Video 36         #
//#############################################################################

        /* Ejercicio 11
           Diseñar un programa que muestre el producto de los 10 primeros números
           impares, cada número impar con su respectivo producto
        */

        JOptionPane.showMessageDialog(null, "Empieza el Ejercicio 11");

        int producto;

        for (int i = 1; i <= 19; i += 2) {
            System.out.print("El producto de: " + i);
            producto = i * i;
            System.out.print(" es " + producto + "\n");
        }
        
        /* Ejercicio 12
           Pedir un número y calcular su factorial
        */
        JOptionPane.showMessageDialog(null, "Empieza el Ejercicio 12");

        int factorial = 1, numero10;

        do {
            numero10 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un número a factorizar"));
            for (int i = numero10; i >= 1; i--) {
                factorial *= i;
            }
            if (numero10 == 0) {
                JOptionPane.showMessageDialog(null, "0 no tiene factorial");
            } else {
                JOptionPane.showMessageDialog(null, "El factorial de " + numero10 + " es: " + factorial);
                factorial = 1;
            }
        }
        while (numero10 != 0);
        JOptionPane.showMessageDialog(null, "El programa ha finalizado");

//#############################################################################
//# Introducción a los ejercicios - Ciclos While, do y for - Video 37         #
//#############################################################################

        /* Ejercicio 13
           Pedir 10 números. Mostrar la media de los números positivos, la media
           de los números negativos y la cantidad de ceros.
        */
        JOptionPane.showMessageDialog(null, "Empieza el Ejercicio 13");

        float numero11, suma4 = 0, suma5 = 0, media1 = 0, media2 = 0, contador3 = 0, contador4 = 0, contador5 = 0;

        for (int i = 1; i <= 10; i++) {
            numero11 = Integer.parseInt(JOptionPane.showInputDialog("Escribe el " + i + " número"));
            if (numero11 > 0) {
                contador3++;
                suma4 += numero11;
                media1 = suma4 / contador3;
            }
            if (numero11 < 0) {
                contador4++;
                suma5 += numero11;
                media2 = suma5 / contador4;
            }
            if (numero11 == 0) {
                contador5++;
            }
        }
        if (contador3 == 0) {
            System.out.println("No se ha ingresado ningún número positivo\n");
        }
        if (contador4 == 0) {
            System.out.println("No se ha ingresado ningún número negativo\n");
        }
        if (contador5 == 0) {
            System.out.println("No se ha ingresado ningún 0\n");
        }
        if (contador3 > 0) {
            System.out.println("Los números positivos ingresados son: " + contador3);
            System.out.println("La media de los números positivos es: " + media1);
        }
        if (contador4 > 0) {
            System.out.println("\nLa suma de números negativos es: " + contador4);
            System.out.println("La media de los números negativos es: " + media2);
        }
        if (contador5 != 0) {
            System.out.println("\nLos ceros indicados son: " + contador5);
        }
        
        /* Ejercicio 14
           Pedir 10 sueldos. Mostrar su suma y cuantos hay mayores de 1000€.
        */
        JOptionPane.showMessageDialog(null, "Empieza el Ejercicio 14");

        int numero12, suma6 = 0, contador6 = 0;

        for (int i = 1; i <= 10; i++) {
            numero12 = Integer.parseInt(JOptionPane.showInputDialog("Ingresa el " + i + " sueldo"));
            suma6 += numero12;
            if (numero12 >= 1000) {
                contador6++;
            }
        }
        if (contador6 == 0) {
            JOptionPane.showMessageDialog(null, "La suma de todos los sueldos es: " + suma6
                    + "\nNo hay ningún sueldo que sobrepase los 1000€");
        } else JOptionPane.showMessageDialog(null, "La suma de todos los sueldos es: " + suma6
                + "\nHay " + contador6 + " que sobrepasan el sueldo de 1000€");


//#############################################################################
//# Introducción a los ejercicios - Ciclos While, do y for - Video 38         #
//#############################################################################

        /* Ejercicio 15
           Dadas las edades y alturas de 5 alumnos, mostrar la edad y la estatura 
           media, la cantidad de alumnos mayores de 18 años y la cantidad de    
           alumnos que miden más de 175 (cm)
        */
        JOptionPane.showMessageDialog(null, "Empieza el Ejercicio 15");

        float edad, altura, mediaEdad, mediaAltura, sumaEdad = 0, sumaAltura = 0, ingresar;
        int contadorEdad = 0, contadorAltura = 0;

        ingresar = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de alumnos que quiere registrar"));

        for (int i = 1; i <= ingresar; i++) {
            edad = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la edad del " + i + " alumno"));
            altura = Integer.parseInt(JOptionPane.showInputDialog("Ahora ingrese la altura del " + i + " alumno"));
            sumaEdad += edad;
            sumaAltura += altura;
            if (edad >= 18) {
                contadorEdad++;
            }
            if (altura >= 175) {
                contadorAltura++;
            }
        }
        mediaEdad = sumaEdad / ingresar;
        mediaAltura = sumaAltura / ingresar;
        JOptionPane.showMessageDialog(null, "La suma de las edades son: " + sumaEdad +
                "\nLa suma de las alturas (cm) son: " + sumaAltura +
                "\nLa media de las edades es de: " + mediaEdad +
                "\nLa media de las alturas es de: " + mediaAltura +
                "\nLa cantidad de alumnos que supera mayor de edad es de: " + contadorEdad +
                "\nLas personas que superan los 175 son: " + contadorAltura);
        
        /* Ejercicio 16 
           Pide un número (que debe estar entre 0 y 10) y mostrar la tabla de
           multiplicar de dicho número.
        */
        JOptionPane.showMessageDialog(null, "Empieza el Ejercicio 16");

        int entradaNumero, multiplicacion;

        entradaNumero = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el número para obtener la tabla de multiplicar"));

        if ((entradaNumero <= 10) && (entradaNumero >= 1)) {
            System.out.println("Tabla multiplicar del: " + entradaNumero);
            for (int i = 1; i <= 10; i++) {
                multiplicacion = entradaNumero * i;
                System.out.println(entradaNumero + " x " + i + " = " + multiplicacion);
            }
        } else JOptionPane.showMessageDialog(null, "El número indicado no esta en el intervalo de 0 y 10");

//#############################################################################
//# Introducción a los ejercicios - Ciclos While, do y for - Video 39         #
//#############################################################################

        /* Ejercicio 17
           Una empresa que se dedica a la venta de desinfectantes necesita un 
           programa para gestionar facturas. En cada factura figura: el código 
           del artículo, la cantidad vendida en litros y el precio por litro. 
           Se pide de 5 facturas introducidas: Facturación total, cantidad en 
           litros vendidos del artículo 1 y cuantas facturas se emitieron de 
           más de 600€.
        */
        JOptionPane.showMessageDialog(null, "Empieza el Ejercicio 17");

        double codArticulo, cantidadLitros, precioLitro, facturacionTotal = 0, cantidadArt, articulo1 = 0, contadorFacturas = 0, importeFactura;

        cantidadArt = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de artículos que desea registrar"));

        for (int i = 1; i <= cantidadArt; i++) {
            codArticulo = Float.parseFloat(JOptionPane.showInputDialog("Ingrese el código del artículo Nº " + i));
            cantidadLitros = Float.parseFloat(JOptionPane.showInputDialog("Ingrese la cantidad vendida en litros Nº " + i));
            precioLitro = Float.parseFloat(JOptionPane.showInputDialog("Ingrese el precio por litro Nº " + i));
            importeFactura = precioLitro * cantidadLitros;
            facturacionTotal += importeFactura;
            if (codArticulo == 1) {
                articulo1 += cantidadLitros;
            }
            if (facturacionTotal >= 600) {
                contadorFacturas++;
            }
        }
        System.out.println("La facturación total de los " + cantidadArt + "  artículos es de: " + facturacionTotal);
        System.out.println("La cantidad vendida en litro del artículo 1 es de: " + articulo1);
        if (contadorFacturas == 0) {
            System.out.println("No ha habido ninguna factura mayor a 600 €");
        } else System.out.println("Ha habido un total de " + contadorFacturas + " factura/as mayor a 600 €");
        
        /* Ejercicio 18
           Hacer unas modificaciones al ejercicio anterior suponiendo que no se
           introduce el precio por litro. Solo existen 3 productos con precios:
           1 - 0,6 €/litro
           2 - 3 €/litro
           3 - 1,25 €/litro
        */
        JOptionPane.showMessageDialog(null, "Empieza el Ejercicio 18");

        int codigoArt2, litros2, litrosArt12 = 0, conteoMas600 = 0;
        float precioArt2 = 0, importeFactura2, facturacionTotal2 = 0;


        for (int i = 1; i <= 5; i++) {
            codigoArt2 = Integer.parseInt(JOptionPane.showInputDialog("Articulo N" + i + "\nDigite el codigo: "));
            litros2 = Integer.parseInt(JOptionPane.showInputDialog("Articulo N" + i + "\nDigite la cantidad de litros: "));

            switch (codigoArt2) {
                case 1:
                    precioArt2 = (float) 0.6;
                    break;
                case 2:
                    precioArt2 = 3;
                    break;
                case 3:
                    precioArt2 = (float) 1.25;
                    break;
                default:
                    System.out.println("Digite un producto valido.");
                    break;
            }

            importeFactura2 = (float) litros2 * precioArt2;
            facturacionTotal2 += importeFactura2;

            if (codigoArt2 == 1) {
                litrosArt12 += litros2;
            }
            if (importeFactura2 > 600) {
                conteoMas600++;
            }
        }
        System.out.println("Facturación total: " + facturacionTotal2);
        System.out.println("Cantidad en litros vendidos del artículo Nº1: " + litrosArt12);
        System.out.println("Cantidad de facturas mayores a 600: " + conteoMas600);

//#############################################################################
//# Introducción a los ejercicios - Ciclos While, do y for - Video 40         #
//#############################################################################

        /* Ejercicio 19
           Dada 6 notas, escribir la cantidad de alumnos aprobados, 
           condicionados (=4) y suspensos.
        */
        JOptionPane.showMessageDialog(null, "Empieza el Ejercicio 19");

        int notas, entradaNota, contadorSuspenso = 0, contadorCondicionado = 0, contadorAprobado = 0;

        notas = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de notas que desea poner"));

        for (int i = 1; i <= notas; i++) {
            entradaNota = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la nota"));
            switch (entradaNota) {
                case 1:
                case 2:
                case 3:
                    JOptionPane.showMessageDialog(null, "Este examen está suspenso");
                    break;
                case 4:
                    JOptionPane.showMessageDialog(null, "Este examen esta condicionado");
                    break;
                case 5:
                case 6:
                case 7:
                case 8:
                case 9:
                case 10:
                    JOptionPane.showMessageDialog(null, "Este examen esta aprobado");
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Ingrese una nota entre 1-10");
            }
            if (entradaNota <= 3) {
                contadorSuspenso++;
            } else if (entradaNota == 4) {
                contadorCondicionado++;
            } else contadorAprobado++;
        }

        System.out.println("Cantidad de suspensos: " + contadorSuspenso);
        System.out.println("Cantidad de condicionados: " + contadorCondicionado);
        System.out.println("Cantidad de aprobados: " + contadorAprobado);
        
        /* Ejercicio 20
           Pedir un número N, introducir N sueldos, y mostrar el sueldo máximo.
        */
        JOptionPane.showMessageDialog(null, "Empieza el Ejercicio 20");

        int numero13, sueldo, sueldoMax = 0;

        numero13 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese los Nº de sueldos que quiere añadir"));

        for (int i = 1; i <= numero13; i++) {
            sueldo = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el sueldo del Nº " + i));
            if (sueldo >= sueldoMax) {
                sueldoMax = sueldo;
            }
        }
        System.out.println("El sueldo más alto es de: " + sueldoMax);

//#############################################################################
//# Introducción a los ejercicios - Ciclos While, do y for - Video 41         #
//#############################################################################

        /* Ejercicio 21
           Pedir 10 números, y mostrar al final si se ha introducido algún
           número negativo.
        */
        JOptionPane.showMessageDialog(null, "Empieza el Ejercicio 21");

        int numero14, pedirNumeros;
        boolean negativo = false;

        numero14 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de números a pedir"));

        for (int i = 1; i <= numero14; i++) {
            pedirNumeros = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un número"));
            if (pedirNumeros < 0) {
                negativo = true;
            }
        }
        if (negativo) {
            System.out.println("Si hay números negativos");
        } else System.out.println("No hay números negativos");

        /* Ejercicio 22
           Pedir 5 calificaciones de alumnos y decir al final si hay algún suspenso.
        */
        JOptionPane.showMessageDialog(null, "Empieza el Ejercicio 22");

        int numero15;
        float calificaciones;
        boolean suspenso = false;

        numero15 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de notas a pedir"));

        for (int i = 1; i < numero15; i++) {
            calificaciones = Float.parseFloat(JOptionPane.showInputDialog("Escriba la nota del alumno Nº" + i));
            if (calificaciones < 5) {
                suspenso = true;
            }
        }
        if (suspenso) {
            System.out.println("Existen suspensos");
        } else System.out.println("No hay ningún suspenso");
    }
}