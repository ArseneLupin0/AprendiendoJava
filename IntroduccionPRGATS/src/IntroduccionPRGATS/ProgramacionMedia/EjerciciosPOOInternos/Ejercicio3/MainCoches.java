package IntroduccionPRGATS.ProgramacionMedia.EjerciciosPOOInternos.Ejercicio3;

import java.util.Scanner;

public class MainCoches {

//#############################################################################
//# Ejercicio 3 - POO - Video 73                                              #
//#############################################################################

    /* Ejercicio 3
        Construir un programa que dada una serie de vehículos caracterizados por su marca,
        modelo y precio, imprima las propiedades del vehículo más barato. Para ello, se
        deberán leer por teclado las características de cada vehículo y crear clase que
        represente a cada uno de ellos.
     */

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String marca, modelo;
        double precio;
        int nCoches, indiceBarato;

        System.out.print("Ingrese la cantidad de coches: ");
        nCoches = entrada.nextInt();
        
        // Creamos los objetos para los coches
        Coches[] coches = new Coches[nCoches];

        for (int i = 0; i < coches.length; i++) {
            entrada.nextLine();
            System.out.println("\nDigite las caracterísiticas del  coche "+(i+1)+": ");
            System.out.print("Introduzca Marca: ");
            marca = entrada.nextLine();
            System.out.print("Introduzca el modelo: ");
            modelo = entrada.nextLine();
            System.out.print("Introduzca el precio: ");
            precio = entrada.nextDouble();

            coches[i] = new Coches(marca, modelo, precio);
        }

        indiceBarato = indiceCocheMasBarato(coches);
        System.out.println("\nEl coche más barato es: ");
        System.out.print(coches[indiceBarato].mostrarDatos());
            
//        Coches coche1 = new Coches("Ferrari","Aperta", 3400000 );
//        Coches coche2 = new Coches("Aston","Valkyrie", 3500000 );
//        Coches coche3 = new Coches("Rolls-Royce","Sweptail ", 11000000 );
//        Coches coche4 = new Coches("Bugatti","Sweptail ", 11000000 );
//        Coches coche5 = new Coches("Bugatti","La Voiture Noire ", 16500000 );
    }

    public static int indiceCocheMasBarato(Coches[] coches) {
        double precio;
        int indice = 0;

        precio = coches[0].getPrecio();
        for (int i = 1; i < coches.length; i++) {
            if (coches[i].getPrecio() < precio) {
                precio = coches[i].getPrecio();
                indice = i;
            }
        }
        return indice;
    }
}
