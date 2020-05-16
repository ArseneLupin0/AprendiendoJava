package IntroduccionPRGATS.ProgramacionMedia.EjerciciosPOOInternos.Ejercicio4;

import java.util.Scanner;

public class MainAtletismo {

//#############################################################################
//# Ejercicio 4 - POO - Vídeo 73                                              #
//#############################################################################

    /* Ejercicio 4
        Construir un programa para una competencia de atletismo, el programa debe gestionar
        una serie de atletas caracterizados por su número de atleta, nombre y tiempo de
        carrera, al final el programa debe mostrar los datos del atleta ganador.
     */

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int nAtleta, tiempoMin, nAtletas, atletaGanador;
        String nombre;

        System.out.print("Ingrese el número de atletas que compiten en la competición: ");
        nAtletas = entrada.nextInt();

        Atletismo[] atleta = new Atletismo[nAtletas];

        for (int i = 0; i < atleta.length; i++) {
            entrada.nextLine();
            System.out.println("\nCaracterísiticas del "+(i+1)+" atleta: ");
            System.out.print("Ingrese el número del atleta a participar: ");
            nAtleta = entrada.nextInt();
            entrada.nextLine();
            System.out.print("Ingrese el nombre del atleta: ");
            nombre = entrada.nextLine();
            System.out.print("Ingrese el tiempo en min que ha tardado en hacer la carrera: ");
            tiempoMin = entrada.nextInt();

            atleta[i] = new Atletismo(nAtleta, nombre, tiempoMin);
        }

        atletaGanador = atletaGanador(atleta);
        System.out.println("\nEl atleta con menor tiempo es: ");
        System.out.print(atleta[atletaGanador].mostrarDatos());
    }

    public static int atletaGanador(Atletismo[] atleta){
        int atletaMinutos;
        int indice = 0;

        atletaMinutos = atleta[0].getTiempoMin();
        for (int i = 1; i < atleta.length; i++) {
            if (atleta[i].getTiempoMin() < atletaMinutos) {
                atletaMinutos = atleta[i].getTiempoMin();
                indice = i;
            }
        }
        return indice;
    }
}
