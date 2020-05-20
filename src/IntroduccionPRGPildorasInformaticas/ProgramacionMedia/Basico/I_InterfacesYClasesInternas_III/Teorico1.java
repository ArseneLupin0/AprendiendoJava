package IntroduccionPRGPildorasInformaticas.ProgramacionMedia.Basico.I_InterfacesYClasesInternas_III;

public class Teorico1 {

//#############################################################################
//# Interfaces Y Clases Externas III - Píldoras Informáticas - Video 51       #
//#############################################################################

    /* --> ¿Propiedades?
     *
     *
     * No se puede instanciar
     * Principio de sustitución
     *
     * Clase Empleado
     *       |
     * Clase Jefatura
     *
     * Empleado director_comercial = new Jefatura("Sandra", 85000, 2012, Calendar.JUNE, 5); ✔✔
     *
     * ----------------------------------------------------------------------------
     *
     * Interface Comparable
     *         |
     *    Clase Empleado
     *
     * Comparable ejemplo = new Comparable(); ❌❌ No se pueden instanciar, pero si el principio de sustitución
     * Comparable ejemplo = new Empleado("Sandra", 85000, 2012, Calendar.JUNE, 5); ✔✔
     *
     * Instaceof --> Para saber si es una instancia de una interfaz Empleado o de jefatura.
     */
}
