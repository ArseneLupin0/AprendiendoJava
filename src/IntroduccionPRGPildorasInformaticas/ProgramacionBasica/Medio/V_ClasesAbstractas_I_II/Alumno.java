package IntroduccionPRGPildorasInformaticas.ProgramacionBasica.Medio.V_ClasesAbstractas_I_II;

public class Alumno extends UsoPerosna {

//#############################################################################
//# Clases abstractas I Y II - Píldoras Informáticas - Video 45-46            #
//#############################################################################

    private String carrera;

    public Alumno(String nombre, String carrera) {
        super(nombre);
        this.carrera = carrera;
    }

    @Override
    public String dameDescripcion() {
        return "Este alumno está estudiando la carrera de " + carrera;
    }

    @Override
    public String toString() {
        return "Alumno{" +
                "carrera='" + carrera + '\'' +
                '}';
    }
}
