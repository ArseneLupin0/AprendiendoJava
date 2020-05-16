package IntroduccionPRGPildorasInformaticas.ProgramacionBasica.Medio.V_ClasesAbstractas_I_II;

import java.util.Date;
import java.util.GregorianCalendar;

public class Empleados extends UsoPerosna{

//#############################################################################
//# Clases abstractas I Y II - Píldoras Informáticas - Video 45-46            #
//#############################################################################

    private String nombre;
    private double sueldo;
    private Date altaContrato;
    private int id;
    private static int idSiguiente=1;

    public Empleados(String nombre, double sue, int agno, int mes, int dia) {
        super(nombre);
        sueldo = sue;
        GregorianCalendar calendario = new GregorianCalendar(agno, mes, dia);
        altaContrato = calendario.getTime();

        id = idSiguiente;
        idSiguiente++;
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

    public static String dameIdSiguiente() {
        return "El Id siguiente es: " + idSiguiente;
    }

    @Override
    public String toString() {
        return "Empleado{" +
                "nombre=" + getNombre() +
                ", id=" + id +
                ", sueldo=" + sueldo +
                ", altaContrato=" + altaContrato +
                '}';
    }

    @Override
    public String dameDescripcion() {
        return "Este empleado tiene un Id= " + id + " con un Sueldo= " + sueldo;
    }
}