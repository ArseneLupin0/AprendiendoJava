package IntroduccionPRGPildorasInformaticas.ProgramacionBasica.Medio.I_IntroduccionPOO.POO_IX;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class UsoEmpleado {

//#############################################################################
//# Introducción a POO IX - Píldoras Informáticas - Video 35                  #
//#############################################################################

    public static void main(String[] args) {
        /*Empleado empleado1 = new Empleado("Paco Gómez", 85000, 1990, Calendar.DECEMBER, 17);
        Empleado empleado2 = new Empleado("Ana López", 95000, 1995, Calendar.JUNE, 2);
        Empleado empleado3 = new Empleado("María Martín", 105000, 2002, Calendar.MARCH, 15);

        empleado1.subeSueldo(5);
        empleado2.subeSueldo(5);
        empleado3.subeSueldo(5);

        System.out.println(empleado1.toString());
        System.out.println(empleado2.toString());
        System.out.println(empleado3.toString());*/

        Empleado[] misEmpleados = new Empleado[3];

        misEmpleados[0] = new Empleado("Paco Gómez", 85000, 1990, Calendar.DECEMBER, 17);
        misEmpleados[1] = new Empleado("Ana López", 95000, 1995, Calendar.JUNE, 2);
        misEmpleados[2] = new Empleado("María Martín", 105000, 2002, Calendar.MARCH, 15);

//        for (int i = 0; i < misEmpleados.length; i++) {
//            misEmpleados[i].subeSueldo(5);
//            System.out.println(misEmpleados[i].toString());
//        }

        for (Empleado e : misEmpleados) {
            e.subeSueldo(5);
            System.out.println(e.toString());
        }
    }
}

class Empleado {

    private String nombre;
    private double sueldo;
    private Date altaContrato;

    public Empleado(String nom, double sue, int agno, int mes, int dia) {
        nombre = nom;
        sueldo = sue;
        GregorianCalendar calendario = new GregorianCalendar(agno, mes, dia);

        altaContrato = calendario.getTime();
    }

    public String DameNombre() { // GETTER
        return nombre;
    }

    public double dameSueldo() { // GETTER
        return sueldo;
    }

    public Date dameFechaContrato() {
        return altaContrato;
    }

    public void subeSueldo(double porcentaje) { // SETTER
        double aumento = sueldo * porcentaje / 100;

        sueldo += aumento;
    }

    @Override
    public String toString() {
        return "Empleado{" +
                "nombre='" + nombre + '\'' +
                ", sueldo=" + sueldo +
                ", altaContrato=" + altaContrato +
                '}';
    }
}
