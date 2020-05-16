package IntroduccionPRGPildorasInformaticas.ProgramacionBasica.Medio.II_Variado.SobrecargaDeConstructores_I;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class UsoEmpleado {

//#############################################################################
//# Sobrecarga de Constructores I - Píldoras Informáticas - Video 39          #
//#############################################################################

    public static void main(String[] args) {
        Empleado[] misEmpleados = new Empleado[4];

        misEmpleados[0] = new Empleado("Paco Gómez", 85000, 1990, Calendar.DECEMBER, 17);
        misEmpleados[1] = new Empleado("Ana López", 95000, 1995, Calendar.JUNE, 2);
        misEmpleados[2] = new Empleado("María Martín", 105000, 2002, Calendar.MARCH, 15);
        misEmpleados[3] = new Empleado("Antonio Fernández");

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

    public Empleado(String nom) {
        this(nom, 30000, 2000, Calendar.JANUARY, 1);
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