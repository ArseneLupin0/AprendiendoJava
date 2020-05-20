package IntroduccionPRGPildorasInformaticas.ProgramacionMedia.Basico.I_InterfacesYClasesInternas_VI;

public class Teorico1 {

//#############################################################################
//# Interfaces Y Clases Externas VI - Píldoras Informáticas - Video 54        #
//#############################################################################

    /* --> ¿Clase Interna Locales?
     *
     * Una clase dentro de un método
     *
     * ¿Cuándo se utilizan estos tipos de clases y por qué?
     *
     *      - Son útiles cuando solo se va a utilizar (instanciar) la clase interna una vez. El objetivo es
     *        simplificar aún más el código.
     *
     *      - Su ámbito queda restringido al método donde son declaradas. ¿Ventajas?
     *
     *          · Están muy "encapsuladas". Ni siquiera la clase a la que pertenecen puede acceder a ella.
     *            Tan solo puede acceder a ella el método donde están declaradas.
     *          · El código resulta más simple.
     *
     * Ejemplo de clase:
     *
     * Class Clase_externa {
     *    Public void método() {
     *          class clase_interna_local {
     *              código de la clase interna;
     *          }
     *    código del método;
     *    }
     * Código de la clase externa;
     * }
     *
     */
}
