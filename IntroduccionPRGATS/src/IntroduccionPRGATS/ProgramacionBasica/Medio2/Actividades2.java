package IntroduccionPRGATS.ProgramacionBasica.Medio2;

import javax.swing.JOptionPane;

/**
 * @author Oleg
 */
public class Actividades2 {

    public static void main(String[] args) {

//#############################################################################
//# Introducción a los ejercicios - Video 21                                  #
//#############################################################################

        /* Ejercicio 1
           Hacer un programa que lea un número entero y muestre si el número
           es múltiplo de 10.
        */

        int numero;

        numero = Integer.parseInt(JOptionPane.showInputDialog("Escribe tu número"));

        if (numero % 10 == 0) {
            JOptionPane.showMessageDialog(null, "El número es múltiplo de 10");
        } else JOptionPane.showMessageDialog(null, "El número no es múltiplo de 10");

        /* Ejercicio 2
           Pedir dos números y decir cual es el mayor o si son iguales.
        */

        int digito1, digito2;

        digito1 = Integer.parseInt(JOptionPane.showInputDialog("Escribe el primer número"));
        digito2 = Integer.parseInt(JOptionPane.showInputDialog("Escribe el segundo número"));

        if (digito1 < digito2) {
            JOptionPane.showMessageDialog(null, "El número " + digito1 + " es menor que " + digito2);
        } else if (digito1 > digito2) {
            JOptionPane.showMessageDialog(null, "El número " + digito1 + " es mayor que " + digito2);
        } else JOptionPane.showMessageDialog(null, "Los números escritos son los mismos, " + digito2);

//#############################################################################
//# Introducción a los ejercicios - Video 22                                  #
//#############################################################################

        /* Ejercicio 3
           Hacer un programa que lea un carácter por teclado y compruebe si
           es una letra mayúscula.
        */

        char caracter;

        caracter = (JOptionPane.showInputDialog("Escribe una letra para saber si es mayúscula o minúscula").charAt(0));

        if (Character.isUpperCase(caracter)) {
            JOptionPane.showMessageDialog(null, "El caracter es una mayúscula");
        } else JOptionPane.showMessageDialog(null, "El caracter es una minúscula");

        /* Ejercicio 4
           En MegaPlaza se hace un 20% de descuento a los clientes cuya compra
           supere los 300 €. ¿Cuál será la cantidad que pagará una persona por su compra?
        */

        double descuento = 0.20, precioCompra, precioRebajado;

        precioCompra = Integer.parseInt(JOptionPane.showInputDialog("Escribe el precio del producto"));

        if (precioCompra > 300) {
            precioRebajado = precioCompra - precioCompra * descuento;
            JOptionPane.showMessageDialog(null, "El producto que ha escogido vale: " + precioCompra +
                    "€, tiene un precio mayor a 300€" +
                    "\nPor lo tanto le aplicaremos un 20% de descuento" +
                    "\nEl precio final es de: " + precioRebajado + "€");
        } else JOptionPane.showMessageDialog(null, "El precio es de: " + precioCompra + "€");

//#############################################################################
//# Introducción a los ejercicios - Video 23                                  #
//#############################################################################

        /* Ejercicio 5
           Un obrero necesita calcular su salario semanal, el cual se obtiene de la siguiente manera:
           Si trabaja 40 horas o menos se le paga 16 € la hora
           Si trabaja más de 40 horas se le paga 16 € por cada una de las primeras 40 horas y 20 € por cada hora extra
        */

        int horasTrabajadas, trabajaNormal, trabajaExtra, horasExtra;
        final int horasFijas = 40;

        horasTrabajadas = Integer.parseInt(JOptionPane.showInputDialog("Di la cantidad de horas trabajadas: "));

        if (horasTrabajadas <= 40) {
            trabajaNormal = horasTrabajadas * 16;
            JOptionPane.showMessageDialog(null, "Tu cobro has sido de: " + trabajaNormal + "€");
        } else {
            horasExtra = horasTrabajadas - horasFijas;
            trabajaExtra = (horasFijas * 16) + (horasExtra * 20);
            JOptionPane.showMessageDialog(null, "Tu cobro has sido de: " + trabajaExtra + "€");
        }

        /* Ejercicio 5
           Hacer un programa que tome dos números y diga si ambos son pares o impares
        */

        int numero1, numero2;

        numero1 = Integer.parseInt(JOptionPane.showInputDialog("Escribe el primer número: "));
        numero2 = Integer.parseInt(JOptionPane.showInputDialog("Escribe el segundo número: "));

        if (numero1 % 2 == 0) {
            JOptionPane.showMessageDialog(null, "El primer dígito (" + numero1 + ") es par");
        } else JOptionPane.showMessageDialog(null, "El primer dígito (" + numero1 + ") es impar");
        if (numero2 % 2 == 0) {
            JOptionPane.showMessageDialog(null, "El segundo dígito (" + numero2 + ") es par");
        } else JOptionPane.showMessageDialog(null, "El segundo dígito (" + numero2 + ") es impar");

//#############################################################################
//# Introducción a los ejercicios - Video 24                                  #
//#############################################################################

        /* Ejercicio 7
           Pedir tres números y mostrarlos ordenados de mayor a menor
        */

        int x, y, z;

        x = Integer.parseInt(JOptionPane.showInputDialog("Escribe el primer número"));
        y = Integer.parseInt(JOptionPane.showInputDialog("Escribe el segundo número"));
        z = Integer.parseInt(JOptionPane.showInputDialog("Escribe el tercer número"));

        if ((x >= y) && (y >= z)) {
            JOptionPane.showMessageDialog(null, "Los números ordenados son: " + x + " > " + y + " > " + z);
        }
        if ((x >= y) && (z >= y)) {
            JOptionPane.showMessageDialog(null, "Los números ordenados son: " + x + " > " + z + " > " + y);
        }
        if ((y >= x) && (x >= z)) {
            JOptionPane.showMessageDialog(null, "Los números ordenados son: " + y + " > " + x + " > " + z);
        }
        if ((y >= z) && (z >= x)) {
            JOptionPane.showMessageDialog(null, "Los números ordenados son: " + y + " > " + z + " > " + x);
        }
        if ((z >= x) && (x >= y)) {
            JOptionPane.showMessageDialog(null, "Los números ordenados son: " + z + " > " + x + " > " + y);
        }
        if ((z >= y) && (y >= x)) {
            JOptionPane.showMessageDialog(null, "Los números ordenados son: " + z + " > " + x + " > " + y);
        }

        /* Ejercicio 8
           Pedir un número entre 0 y 99.999 y decir cuántas cifras tiene
        */

        int numero3;

        numero3 = Integer.parseInt(JOptionPane.showInputDialog("Escribe un número entre 0 y 99.999"));

        if ((numero3 >= 0) && (numero3 <= 99999)) {
            if (numero3 <= 10) {
                JOptionPane.showMessageDialog(null, "El número " + numero3 + " tiene 1 cifra");
            } else if (numero3 <= 100) {
                JOptionPane.showMessageDialog(null, "El número " + numero3 + " tiene 2 cifra");
            } else if (numero3 <= 1000) {
                JOptionPane.showMessageDialog(null, "El número " + numero3 + " tiene 3 cifra");
            } else if (numero3 <= 10000) {
                JOptionPane.showMessageDialog(null, "El número " + numero3 + " tiene 4 cifra");
            } else {
                JOptionPane.showMessageDialog(null, "El número " + numero3 + " tiene 5 cifra");
            }
        } else JOptionPane.showMessageDialog(null, "El número que ha ingresado no esta entre 0 y 99.999");

//#############################################################################
//# Introducción a los ejercicios - Video 25                                  #
//#############################################################################

        /* Ejercicio 9
           Pedir día, mes y año de una fecha e indicar si la fecha es correcta.
           Suponiendo que todos los meses son de 30 días.
        */

        int dia, mes, anno;

        JOptionPane.showMessageDialog(null, "Ingrese una fecha entre 1 a 30 dias, 1 a 12 meses y del año 1500 al 2200");
        dia = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el dia"));
        mes = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el mes"));
        anno = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el año"));

        if ((dia >= 1) && (dia <= 30)) {
            if ((mes >= 1) && (mes <= 12)) {
                if ((anno >= 1500) && (anno <= 2200)) {
                    JOptionPane.showMessageDialog(null, "La fecha ingresada " + dia + "/" + mes + "/" + anno + " es correcta");
                } else {
                    JOptionPane.showMessageDialog(null, "El año ingresado " + dia + "/" + mes + "/" + anno + " no existe");
                }
            } else {
                JOptionPane.showMessageDialog(null, "El mes ingresado " + dia + "/" + mes + "/" + anno + " no existe");
            }
        } else JOptionPane.showMessageDialog(null, "El día ingresado " + dia + "/" + mes + "/" + anno + " no existe");

        /* Ejercicio 10
           Pedir el día, mes y año de una fecha e indicar si la fecha es correcta.
           Con mese de 28, 30 y 31. Sin años bisiestos (Realizado con bisiestos).
        */

        int dia2, mes2, anno2;

        JOptionPane.showMessageDialog(null, "Ingrese una fecha correcta, con día, mes y año");
        dia2 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el dia"));
        mes2 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el mes"));
        anno2 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el año"));

        if ((anno2 >= 1500) && (anno2 <= 2500)) {
            if ((mes2 >= 1) && (mes2 <= 12)) {
                switch (mes2) {
                    case 1:
                    case 4:
                    case 6:
                    case 8:
                    case 10:
                    case 12:
                        if ((dia2 >= 1) && (dia2 <= 31)) {
                            JOptionPane.showMessageDialog(null, "La fecha ingresada " + dia2 + "/" + mes2 + "/" + anno2 + " es correcta");
                        } else
                            JOptionPane.showMessageDialog(null, "El día ingresado " + dia2 + "/" + mes2 + "/" + anno2 + " no existe");
                        break;

                    case 2:
                        if ((anno2 % 4 == 0) && (anno2 % 100 == 0) && (anno2 % 400 == 0)) {
                            if ((dia2 >= 1) && (dia2 <= 29)) {
                                JOptionPane.showMessageDialog(null, "La fecha ingresada " + dia2 + "/" + mes2 + "/" + anno2 + " es correcta");
                            } else
                                JOptionPane.showMessageDialog(null, "El día ingresado " + dia2 + "/" + mes2 + "/" + anno2 + " no existe");
                        } else if ((dia2 >= 1) && (dia2 <= 28)) {
                            JOptionPane.showMessageDialog(null, "La fecha ingresada " + dia2 + "/" + mes2 + "/" + anno2 + " es correcta");
                        } else
                            JOptionPane.showMessageDialog(null, "El día ingresado " + dia2 + "/" + mes2 + "/" + anno2 + " no existe");
                        break;

                    case 3:
                    case 5:
                    case 7:
                    case 9:
                    case 11:
                        if ((dia2 >= 1) && (dia2 <= 30)) {
                            JOptionPane.showMessageDialog(null, "La fecha ingresada " + dia2 + "/" + mes2 + "/" + anno2 + " es correcta");
                        } else
                            JOptionPane.showMessageDialog(null, "El día ingresado " + dia2 + "/" + mes2 + "/" + anno2 + " no existe");
                        break;
                    default:
                        JOptionPane.showMessageDialog(null, "El mes no existe");
                }
            } else {
                JOptionPane.showMessageDialog(null, "El mes ingresado " + dia2 + "/" + mes2 + "/" + anno2 + " no existe");
            }
        } else {
            JOptionPane.showMessageDialog(null, "El año ingresado " + dia2 + "/" + mes2 + "/" + anno2 + " no existe");
        }

//#############################################################################
//# Introducción a los ejercicios - Video 26                                  #
//#############################################################################

        /* Ejercicio 11
           Construir un programa que simule el funcionamiento de una calculadora
           que puede realizar las cuatro operaciones aritméticas básicas
           (suma, resta, producto y división) con valores numéricos enteros.
           El usuario debe especificar la operación con el primer carácter del
           primer parámetro de la línea de comandos: S o s para la suma, R o r
           para la resta, P, p, M o m para el producto y D o d para la división.
        */

        char primeraEntrada;
        double entradaN1, entradaN2, resulSuma, resulResta, resulMulti, resulDivi;

        JOptionPane.showMessageDialog(null, "Bienvenido a la calculadora básica con decimales");
        JOptionPane.showMessageDialog(null, "Los operadores lógicos son los siguientes");
        primeraEntrada = JOptionPane.showInputDialog("Escribe la operación aritmética que deseas hacer: "
                + "\nPara la suma: S o s\nPara la resta: R o r\nPara la multiplicación: P, p, M o m"
                + "\nPara la división: D o d").charAt(0);
        switch (primeraEntrada) {
            case 'S':
            case 's':
                JOptionPane.showMessageDialog(null, "¡Has elegido la suma!");
                entradaN1 = Double.parseDouble(JOptionPane.showInputDialog("Inserte el primer número"));
                entradaN2 = Double.parseDouble(JOptionPane.showInputDialog("Inserte el segundo número"));
                resulSuma = entradaN1 + entradaN2;
                JOptionPane.showMessageDialog(null, "La suma es: " + resulSuma);
                break;
            case 'R':
            case 'r':
                JOptionPane.showMessageDialog(null, "¡Has elegido la resta!");
                entradaN1 = Double.parseDouble(JOptionPane.showInputDialog("Inserte el primer número"));
                entradaN2 = Double.parseDouble(JOptionPane.showInputDialog("Inserte el segundo número"));
                resulResta = entradaN1 - entradaN2;
                JOptionPane.showMessageDialog(null, "La resta es: " + resulResta);
                break;
            case 'P':
            case 'p':
            case 'M':
            case 'm':
                JOptionPane.showMessageDialog(null, "¡Has elegido la multiplicación!");
                entradaN1 = Double.parseDouble(JOptionPane.showInputDialog("Inserte el primer número"));
                entradaN2 = Double.parseDouble(JOptionPane.showInputDialog("Inserte el segundo número"));
                resulMulti = entradaN1 * entradaN2;
                JOptionPane.showMessageDialog(null, "La multiplicación es: " + resulMulti);
                break;
            case 'D':
            case 'd':
                JOptionPane.showMessageDialog(null, "¡Has elegido la división!");
                entradaN1 = Double.parseDouble(JOptionPane.showInputDialog("Inserte el primer número"));
                entradaN2 = Double.parseDouble(JOptionPane.showInputDialog("Inserte el segundo número"));
                resulDivi = entradaN1 + entradaN2;
                JOptionPane.showMessageDialog(null, "La división es: " + resulDivi);
                break;
            default:
                JOptionPane.showMessageDialog(null, "Ha pulsado una tecla inválida");
        }


        /* Ejercicio 12
           Pedir una nota de 0 a 10 y mostrarla de la forma: Insuficiente,
           Suficiente, Bien, Notable, Sobresaliente, Matrícula de Honor.
        */

        int nota1;

        JOptionPane.showMessageDialog(null, "Ponga la nota del examen del 1 al 10");
        nota1 = Integer.parseInt(JOptionPane.showInputDialog("Inserte la nota: "));

        switch (nota1) {
            case 1:
            case 2:
            case 3:
            case 4:
                JOptionPane.showMessageDialog(null, "La nota obtenida es, Insuficiente");
                break;
            case 5:
                JOptionPane.showMessageDialog(null, "La nota obtenida es, Suficiente");
                break;
            case 6:
                JOptionPane.showMessageDialog(null, "La nota obtenida es, Bien");
                break;
            case 7:
            case 8:
                JOptionPane.showMessageDialog(null, "La nota obtenida es, Notable");
                break;
            case 9:
                JOptionPane.showMessageDialog(null, "La nota obtenida es, Sobresaliente");
                break;
            case 10:
                JOptionPane.showMessageDialog(null, "La nota obtenida es de Matrícula de Honor");
                break;
            default:
                JOptionPane.showMessageDialog(null, "Ha escrito una nota inválida");
        }
//#############################################################################
//# Introducción a los ejercicios - Video 27                                  #
//#############################################################################

        /* Ejercicio 13
           Hacer un programa que simule un cajero automático con un saldo inicial
           de 1000 € y con el siguiente menú de opciones:
           1.- Ingresar dinero a la cuenta
           2.- Retirar dinero de la cuenta
           3.- Salir
        */

        final int dineroInicial = 1000;
        int opciones, ingresarDinero, dineroFinal1;

        JOptionPane.showMessageDialog(null, "Hola, bienvenido a nuestro Cajero Automático");

        opciones = Integer.parseInt(JOptionPane.showInputDialog("Hola bienvenido a la cuenta"
                + "\nUsted tiene una cantidad de dinero inicial de: " + dineroInicial + "€"
                + "\nPuede realizar estas tres opciones:"
                + "\n1.- Ingresar dinero en la cuenta"
                + "\n2.- Retirar dinero de la cuenta"
                + "\n3.- Salir"));

        switch (opciones) {
            case 1:
                ingresarDinero = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad que desea ingresar:"));
                dineroFinal1 = ingresarDinero + dineroInicial;
                JOptionPane.showMessageDialog(null, "La cantidad de dinero actual es de: " + dineroFinal1 + "€");
                break;
            case 2:
                ingresarDinero = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad que desea quitar:"));
                if (ingresarDinero <= 1000) {
                    dineroFinal1 = dineroInicial - ingresarDinero;
                    JOptionPane.showMessageDialog(null, "La cantidad de dinero actual es de: " + dineroFinal1 + "€");
                } else JOptionPane.showMessageDialog(null, "¡Está intentado retirar más dinero del que hay!");
                break;
            case 3:
                JOptionPane.showMessageDialog(null, "Ha salido del Cajero Automático");
                break;
            default:
                JOptionPane.showMessageDialog(null, "Ha pulsado una tecla inválida");
        }

        /* Ejercicio 14
           Hacer un programa que pase de KG a otra unidad de medida de masa,
           mostrar en pantalla un mnú con las opciones posibles
        */

        double entradaKG;
        int opciones1;

        JOptionPane.showMessageDialog(null, "Bienvenido al convertidor de KG");
        entradaKG = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la cantidad en KG que desea convertir"));
        opciones1 = Integer.parseInt(JOptionPane.showInputDialog("Puede pasar el valor en KG a cualquier unidad de medida: "
                + "\n1.- Toneladas \n2.- Hectogramos \n3.- Decagramos \n4.- Gramos "
                + "\n5.- Decigramo \n6.- Centigramo \n7.- Miligramo"));

        switch (opciones1) {
            case 1:
                entradaKG /= 1000;
                JOptionPane.showMessageDialog(null, "El valor en toneladas es de: " + entradaKG);
                break;
            case 2:
                entradaKG *= 10;
                JOptionPane.showMessageDialog(null, "El valor en Hectogramos es de: " + entradaKG);
                break;
            case 3:
                entradaKG *= 100;
                JOptionPane.showMessageDialog(null, "El valor en Decagramos es de: " + entradaKG);
                break;
            case 4:
                entradaKG *= 1000;
                JOptionPane.showMessageDialog(null, "El valor en Gramos es de: " + entradaKG);
                break;
            case 5:
                entradaKG *= 10000;
                JOptionPane.showMessageDialog(null, "El valor en Decigramos es de: " + entradaKG);
                break;
            case 6:
                entradaKG *= 100000;
                JOptionPane.showMessageDialog(null, "El valor en Centigramos es de: " + entradaKG);
                break;
            case 7:
                entradaKG *= 1000000;
                JOptionPane.showMessageDialog(null, "El valor en Miligramo es de: " + entradaKG);
                break;
            default:
                JOptionPane.showMessageDialog(null, "El número elegido no aparece en la lista, ingrese un número del 1 al 7");
        }
    }
}
