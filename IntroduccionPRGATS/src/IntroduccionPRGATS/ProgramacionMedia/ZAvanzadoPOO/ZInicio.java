package IntroduccionPRGATS.ProgramacionMedia.ZAvanzadoPOO;

    /**
     * @version 1.2
     * @author Oleg
     *
     */

public class ZInicio {

// INTRODUCCIÓN A POO //

//#############################################################################
//# Introducción a POO (Avanzado) - Video 75 (MainClases1)                    #
//#############################################################################

/* Introducción a POO, nivel avanzado:
    Vamos a ver cosas como por ejemplo, herencia en POO, sobre-escritura de
    miembros, clases y métodos abstractos y el polimorfismo con algunos
    ejercicios para así comprenderlos mejor su funcionamiento.
*/

/* HERENCIA EN POO
    ¿Qué es la herencia?

    La herencia es una forma de reutilización de software en la que se crea una
    nueva clase al absorber los miembros de una ya existente.

        Persona (Clase Padre-Super Clase)       Estudiantes (Clase Hija-Sub Clase)
        -nombre: String                         -nombre: String
        -apellidos: String                      -apellidos: String
        -edad: int                              -edad: int
                                                -codigoEstudiante: int
                                                -notaFinal: float
       #---------------------------------#   <<#---------------------------------#
        + Persona(nombre, apellido, edad)       + Estudiante(nombre, apellido, edad,
                                                  codigoEstudiante, notaFinal)
        + getNombre(): String                   + getNombre(): String
        + getApellido(): String                 + getApellido(): String
        + getEdad(): int                        + getEdad(): int
                                                +mostarDatos(): void

    Para heredar de una clase hay que poner extends y el nombre de la clase.

*/

/* Encapsulamiento en herencias:
    Al utilizar dos clases, podemos crear atributos con modificadores de acceso
    privadas o públicas en este caso al crearla privadas:
        -Privadas: acceso al atributo en la misma clase, por eso se crean los métodos
                   Getter & Setter.
        -Públicas: acceso al atributo en cualquiera de las clases.
        -Protected: acceso al atributo en la misma clase y en las clases hijas.

*/

//#############################################################################
//# Introducción a POO (Avanzado) - Video 76 (MainClases2)                    #
//#############################################################################

/* SOBRE ESCRITURA DE MIEMBROS EN POO
    ¿Qué es la sobre escritura de miembros?

    Con miembro nos referimos a lo que es un atributo o un método.
    No nos podemos confundir con esto

        public class Persona {
            public void cantar() {
                System.out.println("Estoy cantando");
            }
            public void cantar(String cancion) {
                System.out.println("Estoy cantando " + cancion);
            }
        }

    Esto es una sobrecarga de miembros o de métodos, donde solo se involucra 1 clase.

 ---------------------------------------------------------------------------------------

    Nos referimos a sobre escritura de miembros cuando en una clase heredamos de subclases
    donde a la vez tenemos que sobre escribir en la clase hija sobre la clase padre.

    Por ejemplo tenemos una estructura:

                                     Animal
                                + comer(): void  (comer acción generalizada)

        Persona                      Perro                         Vaca
     + comer(): void            + comer(): void              + comer(): void

     (es un caso específico,    (es otro caso específico,    (caso específico donde,
     donde la persona come      donde el perro come en un    la vaca come en el campo
     con tenedor, un plato,     bol, o en un cuenco)         y come pasto...)
     un cuchillo etc)


    Lo que vamos a hacer en estos métodos hijos es una sobre escritura del miembro padre
    por lo que nosotros "personalizamos" de nuevo el como comen en cada sub-clase.
*/

//#############################################################################
//# Introducción a POO (Avanzado) - Video 77 (MainClases3)                    #
//#############################################################################

/* MÉTODOS Y CLASES ABSTRACTAS EN POO
    ¿Qué son los métodos abstractos y las clases abstractas?

    Es cuando necesitamos crear una clase padre, pero aún no sabemos que especificaciones
    le podemos dar a dicha clase, por eso la ponemos en abstracta, ya que en las subclases
    es cuando le decimos al método lo que realmente es (lo veremos en ejemplos).

    Algunas de las características de la clase abstracta son:
     - Se utilizan sólo como super clases.
     - No se pueden instanciar objetos.
     - Sirve para proporcionar una super clase apropiada a partir de la cuál heredan otras clases
     - TIP, cuando haya un método abstracto, la clase tiene que ser si o sí abstracta

    Por ejemplo tenemos una estructura abstracta:

                                    SerVivo
                             + alimentarse(): void  (acción general, muy genérico)

        Planta                                              Animal
     + alimentarse(): void                             + alimentarse(): void

     (tenemos un primer caso,                          (segundo caso, donde no
     por lo cual sabemos como                          sabemos exactamente como
     se alimenta una planta)                           se alimenta, dependiendo
                                                       del animal que tengamos)

                                            AnimalCarnívoro                    AnimalHerbivoro
                                        + alimentarse(): void               + alimentarse(): void

                                        (ya sabemos de que se               (ya sabemos de que se
                                        puede alimentar el                  puede alimentar el
                                        animal)                             animal)
*/

//#############################################################################
//# Introducción a POO (Avanzado) - Video 78 (MainClases4)                    #
//#############################################################################

/* POLIMORFISMO EN JAVA

    ¿De dónde viene polimorfismo?

     - Poli - Muchos
                            Muchas formas de dar a un objeto
     - Morfismo - Formas

    ¿Qué es el polimorfismo?

    Son la muchas formas que puede tomar un objeto dependiendo del contexto donde lo utilicemos.

    Algunas de las características del polimorfismo son:
     - En una relación de tipo herencia, un objeto de la superclase puede almacenar un objeto de cualquiera
       de sus subclases.
     - Esto significa que la clase padre o superclase es compatible con los tipos que derivan de ella.
       Pero no al revés.

    Por ejemplo tenemos una estructura del polimorfismo, donde tenemos herencia:

                                               Vehiculo
                                        # matricula: String
                                        # marca: String
                                        # modelo: String
                                        + mostrarDatos(): String

          VehiculoTurismo                   VehiculoDeportivo               VehiculoFurgoneta
     - numeroPuertas: int               - cilindrada: int               - carga: int
     + mostrarDatos(): String           + mostrarDatos(): String        + mostrarDatos(): String

     ***Las tres últimas clases como podemos observar heredan de la clase padre, que en este caso es
     "Vehiculo", en las otras clases especificamos el tipo de vehiculo que vamos a usar y que características
     queremos meterle extra. Ejemplo gráfico.
*/

//#############################################################################
//# Introducción a POO (Avanzado) - Video 83 (MainClases5)                    #
//#############################################################################

/* ¿Qué son las excepciones?
        Cuando un programa en Java viola las restricciones semánticas del lenguaje (se produce un error), la máquina
        virtual Java comunica este hecho al programa mediante una Excepción.

        Excepción == Error

        Muchas clases de errores pueden provocar una excepción desde un desbordamiento de memoria o un disco duro
        estropeado, un intento de dividir por cero o intentar acceder a un vector fuera de sus límites. Cuando esto
        ocurre, la máquina virtual Java crea un objeto de la clase Exception.

        API de Java para ver tipos de excepciones: https://docs.oracle.com/javase/8/docs/api/
*/


//#############################################################################
//# Introducción a POO (Avanzado) - Video 84 (MainClases6)                    #
//#############################################################################

/* Jerarquía de excepciones (básico):

                                                        Throwable
                                                            |
                              |-----------------------------|-----------------------------|
                              |                                                           |
                          Exception                                                     Error
                (Errores que se pueden solucionar)                 (Errores de Hardware, no se pueden solucionar)
                              |
                              |
               |--------------|--------------|
               |                             |
               |                             |
           IOException                RunTimeException
   (Excepciones verificadas)    (Excepciones NO verificadas)


           **Error: Son las que se producen por el hardware, es decir que un disco duro está dañado o algún componente
                    del ordenador no funciona correctamente. Este error no depende del programador por lo tanto éste no
                    lo puede solucionar.

           **Exception: Son los tipos de errores arrojados por Java, que en éste caso si tienen solución.

             **IOException: Se refiere a las excepciones verificas, donde no depende completamente del programador,
                            pero si tienen solución, un ejemplo: sería en el cual tenemos un programa que depende de
                            un archivo y se encuentra en X ubicación, si el archivo se borra por algún casual, nuestro
                            programa no podrá encontrarlo y entonces dara este tipo de excepción.

             **RunTimeException: Se refiere a las excepciones NO verificas, donde depende completamente del programador,
                                 si hubiese algún fallo al programar, como hemos visto en el caso anterior, al dividir
                                 un número por cero lanzará este error, porque es el error del programador. Por el cuál
                                 todas estas excepciones se tienen en cuenta en el código.
*/

//#############################################################################
//# Introducción a POO (Avanzado) - Video 85 (MainClases7)                    #
//#############################################################################

/* Tratamiento de excepciones:
    En un primer caso, Java nos obliga a tratar de solucionar esas excepciones o de evitarlas.

        - Declaramos la excepción que se puede dar en el método (Cuando no queremos capturar el error, se evita)
        - Capturarla con un Try - Catch (Aquí se intenta capturar el error, no se evita)

    Lo veremos más a fondo en las prácticas
*/

//#############################################################################
//# Introducción a POO (Avanzado) - Video 86 (MainClases8)                    #
//#############################################################################

/* Tratamiento de excepciones verificadas con Try - Catch:
    En un primer caso, vamos a hacer el tratamiento de excepciones con Try - Catch.

    Una estructura puede ser la siguiente:

        try {
            sentencia que pueda dar un error
        } catch (el error que capturamos) {
            sentencia para solucionar / describir el error
        } finally {
            esto es opcional, se ejecuta como si el try ha sido exitoso, como si no lo ha sido.
        }

    Esto lo que hace es guardar el objeto, por lo tanto nuestro programa continuará ejecutándose aunque haya errores.

    Lo veremos más a fondo en las prácticas
*/
}