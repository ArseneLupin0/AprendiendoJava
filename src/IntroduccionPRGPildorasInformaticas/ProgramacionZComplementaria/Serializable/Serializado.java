package IntroduccionPRGPildorasInformaticas.ProgramacionZComplementaria.Serializable;

import java.io.*;
import java.util.Date;
import java.util.GregorianCalendar;

public class Serializado {
    public static void main(String[] args) {
        Administrador jefe = new Administrador("Juan", 80000, 2005, 12, 15);

        jefe.setIncentivo(5000);

        Empleado[] perEmpleados = new Empleado[3];

        perEmpleados[0] = jefe;
        perEmpleados[1] = new Empleado("Ana", 25000, 2008, 10, 1);
        perEmpleados[2] = new Empleado("Luis", 18000, 2012, 9, 15);

        try {
            ObjectOutputStream escribiendo = new ObjectOutputStream(new FileOutputStream("H:\\CFGS\\zPlantillas\\PR - Ayuda\\Ensayo 3 -POO - Intellij\\src\\IntroduccionPRGPildorasInformaticas\\ProgramacionZComplementaria\\Serializable\\Empleado.dat"));
            escribiendo.writeObject(perEmpleados);
            escribiendo.close();

            ObjectInputStream recuperandoFichero = new ObjectInputStream(new FileInputStream("H:\\CFGS\\zPlantillas\\PR - Ayuda\\Ensayo 3 -POO - Intellij\\src\\IntroduccionPRGPildorasInformaticas\\ProgramacionZComplementaria\\Serializable\\Empleado.dat"));

            Empleado[] personalRecuperado = (Empleado[]) recuperandoFichero.readObject(); //Creamos array porque hay un array en archivo

            for (Empleado e :
                    personalRecuperado) {
                System.out.println(e);
            }
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}

class Empleado implements Serializable {
    private String nombre;
    private double sueldo;
    private Date fechaContrato;

    public Empleado(String nombre, double sueldo, int agnom, int mes, int dia) {
        this.nombre = nombre;
        this.sueldo = sueldo;

        GregorianCalendar calendario = new GregorianCalendar(agnom, mes, dia);

        fechaContrato = calendario.getTime();
    }

    public String getNombre() {
        return nombre;
    }

    public double getSueldo() {
        return sueldo;
    }

    @Override
    public String toString() {
        return "Empleado{" +
                "nombre='" + nombre + '\'' +
                ", sueldo=" + sueldo +
                ", fechaContrato=" + fechaContrato +
                '}';
    }
}

class Administrador extends Empleado {

    private double incentivo;

    public Administrador(String nombre, double sueldo, int agnom, int mes, int dia) {
        super(nombre, sueldo, agnom, mes, dia);

        incentivo = 0;
    }

    public double getSueldo() {
        double sueldoBase = super.getSueldo();
        return sueldoBase + incentivo;
    }

    public void setIncentivo(double b) {
        incentivo = b;
    }

    @Override
    public String toString() {
        return super.toString() + " Incentivo=" + incentivo;
    }
}