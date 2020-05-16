package IntroduccionPRGATS.ProgramacionBasica.Basico3;

import java.util.Scanner;

/**
 * @author Oleg
 */
public class Actividades1 {

    public static void main(String[] args) {

//#############################################################################
// Introducción a los ejercicios - Video 15                                   #
//#############################################################################

        /* Ejercicio 1 - Extendido
           Hacer qun programa que calcule e imprima la suma de tres calificaciones.
        */

        float nota1, nota2, nota3, total, media, media1;
        Scanner entrada1 = new Scanner(System.in);
        System.out.print("Introduce la primera nota: ");
        nota1 = entrada1.nextFloat();

        Scanner entrada2 = new Scanner(System.in);
        System.out.print("Introduce la segunda nota: ");
        nota2 = entrada2.nextFloat();

        Scanner entrada3 = new Scanner(System.in);
        System.out.print("Introduce la tercera nota: ");
        nota3 = entrada3.nextFloat();

        total = (nota1 + nota2 + nota3); // Sumamos las 3 notas
        total = (float) (Math.round(total * 100) / 100d); // Redondeamos el total a 2 decimales
        media = (total / 3); // Obtenemos la media
        media = (float) (Math.round(media * 100) / 100d);
        media1 = (float) (Math.round(media * 1) / 1d); // Redondeamos a 0 decimales
        System.out.println("La suma de las tres notas es: " + total + ""
                + "\nLa media es: " + media + ""
                + "\nLa media redondeada es: " + media1);

        /* Ejercicio 2 - Extendido
           Hacer qun programa que calcule el salario semanal de un empleado a
           partir de sus horas semanales trabajas y de su salario por hora.
        */

        int salarioHora, hSemanales, salarioSemanal, salarioMensual, salarioAnual;
        Scanner entradaDinero = new Scanner(System.in);

        System.out.print("\nIngrese su salario por hora: ");
        salarioHora = entradaDinero.nextInt();

        System.out.print("Cantidad de horas trabajadas en la semana: ");
        hSemanales = entradaDinero.nextInt();

        salarioSemanal = salarioHora * hSemanales;
        salarioMensual = salarioSemanal * 4;
        salarioAnual = salarioMensual * 12;

        System.out.println("Su salario semanal es de: " + salarioSemanal + " €"
                + "\nSu salario mensual es de: " + salarioMensual + " €"
                + "\nSu salario anual es de: " + salarioAnual + " €");


//#############################################################################
//# Introducción a los ejercicios - Video 16                                  #
//#############################################################################

        /* Ejercicio 3
           Guillermo tiene N dolares. Luis tiene la mitad de lo que posee Guillermo.
           Juan tiene la mitad de lo que poseen Luis y Guillermo juntos.
           Hacer un programa que calcule e imprima la cantidad de dinero que tienen entre los tres.
        */

        int dineroGuille, dineroLuis, dineroJuan;
        Scanner entrada4 = new Scanner(System.in);
        System.out.print("\nIntroduce una cantidad de dinero: ");
        dineroGuille = entrada4.nextInt();

        dineroLuis = dineroGuille / 2; // Dinero final de Luis
        dineroJuan = (dineroGuille + dineroLuis) / 2; // Dinero final de Juan
        int totalEuros = dineroGuille + dineroLuis + dineroJuan; // Dinero total entre los 3 (suma)

        System.out.println("\nEl dinero que posee Guille es de: " + dineroGuille + " €" +
                "\nEl dinero que posee Luis es de: " + dineroLuis + " €" +
                "\nEl dinero que posee Juan es de: " + dineroJuan + " €" +
                "\nLa cantidad total de dinero que tienen entre los tres es de: " + totalEuros + " €");

        /* Ejercicio 4
           Una compañía de venta de carros usados, paga a su personal de ventas un salario de 1000€ mensuales,
           más una comision de 150€ por cada carro vendido, más el 5% del valor de la venta por carro.
           Cada mes el capturista de la empresa ingresa en la computadora los datos pertinentes.
           Hacer un programa que calcule e imprima el salario mensual de un vendedor dado.
        */

        final double salarioMensualFijo = 1000;
        double carro, valorUnicoCarro, valorCarro, valorFinalCarro, ingresosFinales;
        System.out.print("\nDinero mensual fijo en banco: " + salarioMensualFijo);
        Scanner entrada5 = new Scanner(System.in);

        System.out.print("\nIntroduce la cantidad de carros vendidos extra: "); // Introducimos la cantidad de carros vendidos
        carro = entrada5.nextInt();

        System.out.print("Introduce el valor del carro: "); //Introducimos el valor que cuesta cada carro
        valorCarro = entrada5.nextInt();
        valorUnicoCarro = carro * 150; // Calculamos el dinero extra que ganamos al vender X carros
        valorFinalCarro = valorUnicoCarro + (valorCarro * 0.05); // Calculamos el 5% del valor del carro y despues lo sumamos al dinero extra que ganamos por X carros

        System.out.print("Dinero vendido de " + carro + " carros es igual a: " + valorUnicoCarro +
                "\nDinero extra en total por todos los carros: " + valorFinalCarro);

        ingresosFinales = valorFinalCarro + salarioMensualFijo + valorCarro; // Sumamos todas las cantidades

        System.out.println("\nEl ingreso mensual, dependiendo de los carros vendidos es de: " + ingresosFinales);

//#############################################################################
//# Introducción a los ejercicios - Video 17                                  #
//#############################################################################

        /* Ejercicio 5
           La calificación final de un estudiante de Informática se calcula con
           base a las calificaciones de cuatro aspectos de su rendimiento académico:
           participación, primer examen parcial, segundo examen parcial y examen final.
           Sabiendo que las calificaciones anteriores entran a la calificación
           final con ponderaciones del 10%, 25%, 25% y 40%. Hacer un programa
           que calcule e imprima la calificación obtenida por un estudiante.
        */

        double caliFinal, participacion, primerExamen, segundoExamen, finalExamen;
        Scanner entrada6 = new Scanner(System.in);

        System.out.print("\nIntroduce la nota de participación entre 0-10: ");
        participacion = entrada6.nextDouble();
        participacion *= 0.10;

        System.out.print("Introduce la nota del primer examen entre 0-10: ");
        primerExamen = entrada6.nextDouble();
        primerExamen *= 0.25;

        System.out.print("Introduce la nota del segundo examen entre 0-10: ");
        segundoExamen = entrada6.nextDouble();
        segundoExamen *= 0.25;

        System.out.print("Introduce la nota final del examen entre 0-10: ");
        finalExamen = entrada6.nextDouble();
        finalExamen *= 0.40;

        caliFinal = participacion + primerExamen + segundoExamen + finalExamen;
        System.out.print("La nota de calificación final es de un: " + caliFinal);

        /* Ejercicio 6
           Hacer un programa que calcule el cuadrado de una suma
        */

        double x, y, cuadradoSuma;
        Scanner entrada8 = new Scanner(System.in);
        System.out.println("\n\nEcuación para calcular el cuadrado de una suma" +
                "\nEcuación: (a+b)^2=a^2+b^2*2ab");

        // Obtenemos los números por teclado
        System.out.print("Ingrese el primer dígito: ");
        x = entrada8.nextDouble();

        System.out.print("Ingrese el segundo dígito: ");
        y = entrada8.nextDouble();

        // Calculamos el cuadrado de la suma
        cuadradoSuma = (Math.pow(x, 2) + Math.pow(y, 2)) + (2 * x * y);
        System.out.println("El cuadrado de la suma de: (" + x + "+" + y + ")^2 = " + cuadradoSuma);

//#############################################################################
//# Introducción a los ejercicios - Video 18                                  #
//#############################################################################

        /* Ejercicio 7
           Construir un programa que, dado un número toal de horas, devuelve el
           número de semanas días y horas equivalentes. Por ejemplo, dado un total
           de 100 horas debe mostrar 5 semanas, 6 días y 16 horas.
        */

        int totalHoras, semanas, dias, horas;
        Scanner entrada9 = new Scanner(System.in);
        System.out.print("\nIntroduce el número total de horas: ");

        totalHoras = entrada9.nextInt();
        semanas = totalHoras / 24 / 7;
        dias = totalHoras % 168 / 24;
        horas = totalHoras % 24;

        System.out.println("Estas son las semanas: " + semanas + ", los días: " + dias + ", las horas restantes: " + horas);

        /* Ejercicio 8
           Construir un programa que calcule y muestre por pantalla las raíces
           de la ecuación de segundo grado de coeficientes reales.
        */

        double a1, x1, b1, c1, x2;
        Scanner entrada10 = new Scanner(System.in);
        System.out.println("\nFórmula para calcular una ecuación de segundo grado");
        System.out.println("Ecuación: (ax)^2+bx+c=0");

        System.out.print("Digite el valor de A: ");
        a1 = entrada10.nextFloat();
        System.out.print("Digite el valor de B: ");
        b1 = entrada10.nextFloat();
        System.out.print("Digite el valor de C: ");
        c1 = entrada10.nextFloat();

        double formula = (b1 * b1) - 4 * a1 * c1;
        x1 = (-(b1) + Math.sqrt(formula)) / (2 * a1);
        x2 = (-(b1) - Math.sqrt(formula)) / (2 * a1);

        System.out.println("El valor en positivo es: " + x1);
        System.out.println("El valor en negativo es: " + x2);
    }
}