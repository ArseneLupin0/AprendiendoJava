package IntroduccionPRGPildorasInformaticas.ProgramacionBasica.Medio.II_Variado.Final_I;

public class Empleados {

//#############################################################################
//# Constantes Uso Final I - Píldoras Informáticas - Video 36                 #
//#############################################################################

    private final String nombre; // Nadie ni nada podrá cambiar esta variable una vez que se le asigna el nombre.
    private String seccion;

    public Empleados(String nom) {
        nombre = nom;
        seccion = "Administración";
    }

    public void cambiaSeccion(String seccion) {
        this.seccion = seccion;
    }

    @Override
    public String toString() {
        return "Empleados{" +
                "nombre='" + nombre + '\'' +
                ", seccion='" + seccion + '\'' +
                '}';
    }
}
