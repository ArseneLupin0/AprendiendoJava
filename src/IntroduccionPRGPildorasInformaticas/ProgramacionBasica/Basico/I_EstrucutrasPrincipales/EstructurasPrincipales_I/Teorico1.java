package IntroduccionPRGPildorasInformaticas.ProgramacionBasica.Basico.I_EstrucutrasPrincipales.EstructurasPrincipales_I;

public class Teorico1 {

//#############################################################################
//# Introducción a la Programación - Píldoras Informáticas - Video 02         #
//#############################################################################

    /* --> Introducción al Java --> ¿Qué es JRE?
     *
     * J.R.E = Java Runtime Environment (Entorno de ejecución Java). También denominado en sus
     * inicios como J.V.M = Java Virtual Machine (Máquina Virtual de Java).
     *
     * --> ¿Por qué es necesaria su instalación?
     *
     * - Por culpa de la principal característica del lenguaje Java: ser MULTIPLATAFORMA.
     *
     * - La característica de ser multiplataforma implica que un programa escrito en Java debe ser
     *   COMPILADO para posteriormente ser INTERPRETADO por la Máquina Virtual de Java o JRE.
     *
     * --> ¿Qué es compilar?
     *
     * Código Fuente           >>>--Compilador-->>>           Código Máquina
     *
     * -- Esquema de un Programa no Java:
     *
     *                                  Programador
     *                                      |
     *      |-------------------------------|-------------------------------|
     * Versión 1                        Versión 2                       Versión 3
     *      |                               |                               |
     * Ejecutable Windows               Ejecutable Linux                Ejecutable Mac
     *
     * Java evita este esquema, es por eso que es multiplataforma.
     *
     * Código Fuente >>>--Compilador-->>> Bytecodes >>>--JRE-->>> Código Máquina
     *
     * -- Esquema de un Programa Java (Write once, run everywhere):
     *
     *                                  Programador
     *                                      |
     *                              Única versión.java
     *                                      |
     *                                  Compilación
     *                                      |
     *      |-------------------------Bytecodes.class-----------------------|
     *     JRE                             JRE                             JRE
     *      |                               |                               |
     *  Ejecutable Windows            Ejecutable Linux                Ejecutable Mac
     *
     * */

//#############################################################################
//# Introducción a la Programación - Píldoras Informáticas - Video 03         #
//#############################################################################

    /* --> Introducción al Java --> ¿De dónde ha salido? - Características principales
     *
     * Breve historia:
     *      - Año 1991: grupo de ingenieros de Sun Micro-systems (liderado por James Gosling y Patrick Naughton)
     *        tenía que desarrollar un lenguaje de programación que se pudiera utilizar en pequeños
     *        electrodomésticos.
     *
     *          - Código pequeño.
     *          - Código compacto.
     *          - Neutro respecto arquitectura.
     *
     *      - Java, proviene del café cuenta la leyenda que los programadores estaban siempre tomando café, y
     *        vulgarmente se le decía JAVA. Por eso la referencia a la taza de café.
     *
     * Fracaso comercial:
     *      - De 1991 a 1994 intentaron vender la tecnología a diferentes empresas del ámbito tecnológico.
     *        No hubo éxito.
     *      - El proyecto liderado por Gosling y Naughton se quedó en stand-by.
     *      - Corría el año 1994 e Internet se hacía más grande... Pensaron que las características de Java
     *        se ajustaban como un guante a la naturaleza de Internet.
     *
     * Alternativa --> Navegador (HotJava) - 1996:
     *      - Inventemos un navegador ligero, capaz de correr en cualquier plataforma y que pueda ejecutar
     *        código en su interior (Applets).
     *
     *
     * Características Principales:
     *
     *      - Sencillo: en el sentido de que se intentó quitar las características más engorrosas de otros
     *        lenguajes de programación (aritméticas de punteros, ficheros de encabezado etc) y sobretodo
     *        que ocupa poco.
     *
     *      - Orientado a objetos.
     *
     *      - Distribuido: buen tratamiento de redes. Buena programación para Internet.
     *
     *      - Seguro: como fue pensado para programar en red (Internet) se hizo seguro.
     *          - Leer o escribir ficheros sin permiso.
     *          - Desbordar la pila de ejecución.
     *          - Corrupción de memoria.
     *
     *      - Neutro.
     *
     *      - Adaptable: tipo de datos primitivos iguales en todas las plataformas.
     *
     *      - Interpretado.
     *
     *      - Alto rendimiento
     * */

//#############################################################################
//# Introducción a la Programación - Píldoras Informáticas - Video 04         #
//#############################################################################

    /* --> Tipos de programas Java
     *
     *  - Aplicaciones de consola.
     *  - Aplicaciones de propósito general.
     *  - Applets
     *
     * --> Anatomía de un programa Java (Java es case sensitive)
     *
     * public class PrimerEjemplo {
     *      public static void main (String args[]) {
     *          System.out.println("Hola alumnos!")
     *      }
     * }
     *
     * */

    public static void main(String[] args) {
        System.out.println("Hola alumnos!");
    }
}

