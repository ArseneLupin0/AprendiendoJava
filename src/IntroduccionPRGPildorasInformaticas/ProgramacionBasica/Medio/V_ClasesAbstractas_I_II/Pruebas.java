package IntroduccionPRGPildorasInformaticas.ProgramacionBasica.Medio.V_ClasesAbstractas_I_II;

import java.util.Calendar;

public class Pruebas {

//#############################################################################
//# Clases abstractas I Y II - Píldoras Informáticas - Video 45-46            #
//#############################################################################
    public static void main(String[] args) {

        UsoPerosna[] lasPersonas = new UsoPerosna[2];

        lasPersonas[0] = new Empleados("Luis Conde", 30000, 2000, Calendar.AUGUST, 7);
        lasPersonas[1] = new Alumno("Ana López", "Biológicas");

        for (UsoPerosna p :
                lasPersonas) {
            System.out.println(p.getNombre() + ", " + p.dameDescripcion());
        }

        System.out.println();

        for (UsoPerosna e :
                lasPersonas) {
            System.out.println("Nombre: " + e.getNombre()
                    + " Descripción: " + e.dameDescripcion() // Polimorfismos en acción.
                    + " Datos: " + e.toString());
        }
    }
}