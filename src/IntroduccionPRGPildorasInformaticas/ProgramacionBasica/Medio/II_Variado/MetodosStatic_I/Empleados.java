package IntroduccionPRGPildorasInformaticas.ProgramacionBasica.Medio.II_Variado.MetodosStatic_I;

public class Empleados {

//#############################################################################
//# Constantes Metodos Static I - Píldoras Informáticas - Video 38            #
//#############################################################################

    private final String nombre; // Nadie ni nada podrá cambiar esta variable una vez que se le asigna el nombre.
    private String seccion;
    private int id;
    private static int idSiguiente=1;

    public Empleados(String nom) {
        nombre = nom;
        seccion = "Administración";
        id = idSiguiente;
        idSiguiente++;
    }

    public void cambiaSeccion(String seccion) {
        this.seccion = seccion;
    }

    public static String dameIdSiguiente() {
        return "El Id siguiente es: " + idSiguiente;
    }

    @Override
    public String toString() {
        return "Empleados{" +
                "nombre='" + nombre + '\'' +
                ", seccion='" + seccion + '\'' +
                ", id=" + id +
                '}';
    }
}
