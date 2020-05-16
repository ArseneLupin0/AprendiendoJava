package IntroduccionPRGPildorasInformaticas.ProgramacionBasica.Medio.V_ClasesAbstractas_I_II;

public abstract class UsoPerosna {

//#############################################################################
//# Clases abstractas I Y II - Píldoras Informáticas - Video 45-46            #
//#############################################################################

    private String nombre;

    public UsoPerosna(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public abstract String dameDescripcion();

    @Override
    public abstract String toString();
}
