package IntroduccionPRGATS.ProgramacionMedia.IntermedioPOO;

/**
 * @author Oleg
 */

public class ZInicio {

// INTRODUCCIÓN A POO //

//#############################################################################
//# Introducción a POO (Programación Orientada a Objetos) - Video 61          #
//#############################################################################

/* Introducción a POO:
    Es una forma especial de programar, más cercana a como expresaríamos las
    cosas en la vida real que otros tipos de programación.
*/

/* Como se piensa en objetos...

    Coche (objeto)
        - Atributos (características)
            -Color
            -Marca
            -KM
        - Métodos (acciones)
            -Encender
            -Acelerar
            -Frenar

    3/2 (tres medios)
        - Atributos (características)
            -Numerador
            -Denominador
        - Métodos (acciones)
            -Simplificarse
            -Sumarse con otra fracción
            -Restarse con otra fracción
*/

/* Introducción a las clases:
    Es un conjunto de objetos con características similares. Tiene atributos y métodos
    A partir de una clase, podemos instanciar objetos, o crearlos.
        Coche ----------->>>     Coche1   ------------   Coche2
        -color                      - Blanco                - Rojo
        -marca                      - Audi                  - Ferrari
        -km (recorridos)            - 0KM                   - 100KM
        -encender()
        -acelerar()
        -frenar()
*/

//#############################################################################
//# Introducción a POO, Creación de Clases y Objetos - Video 62               #
//#############################################################################

/* Introducción para crear una clase:

    public --> Modificador de acceso
    Coche  --> Nombre de la clase (la primera letra siempre en mayúscula y
               normalmente en singular)

    Creación de clase ------------
    public class Coche {

    }

    Coche   --> Nombre de la clase
    coche1  --> Nombre del objeto
    new     --> Para crear objetos
    Coche() --> Constructores (método especial)

    Creación de objeto
    Coche coche1 = new Coche()
    Coche coche2 = new Coche()
*/

/* Creación de documento
    Qué es un paquete: es un conjunto de clases, una carpeta donde meterás todas tus clases

        1.- Creamos proyecto, sin el Main.
        2.- Creamos nuestra propia fuente de paquetes y le damos un nombre.
        3.- Creamos un archivo, el cual será nuestra clase.
*/

//#############################################################################
//# Introducción a POO, Creación de Métodos - Video 63                        #
//#############################################################################

/* Concepto de método:
    Un método es una acción o comportamiento de los objetos. Ejemplo:

    public --> Modificador de acceso
    void   --> Valor de retorno, siempre y cuando no retornemos nada en valor, si
               retornamos un número ponemos un int...
    método --> Nombre del método
    () --> Dentro van los argumentos

        public void método (argumentos){

        }
*/

//#############################################################################
//# Introducción a POO, Creación de Parámetros y Argumentos - Video 64        #
//#############################################################################

/* Concepto de Parámetro y Argumento:
    Parámetro: es una declaración de variable u objeto.
    Argumento: es un valor que solo se envía.

    miAuto (nuestro objeto) -- Lo aceleramos
        miAuto.acelerar();

    No sabemos cuanto acelerar, por eso existen los Parámetros y Argumentos

    Ejemplo práctico:

    public void método(Int a, String b   ){
                                                Declaración de método(Parámetro)
    }

    objeto.método(1,"Hola");                    Invocación de método(Argumento)
*/

//#############################################################################
//# Introducción a POO, Métodos, Retorno de valores - Video 65                #
//#############################################################################

/* Retorno de valores:
    Estos significa que nos va a retornar un valor entero de tipo INT, por lo
    tanto almacenará el valor de suma.

    public INT sumar(int a, int b){
        int suma = a +b
        return suma;
    }

    int suma = objeto.sumar(3,5);
    System.out.println("La suma es: "+suma);
    ---- O ----
    System.out.println("La suma es: "+objeto.sumar(3,5));

    public STRING saludar(String nombre){
        String saludo = "Hola"+nombre;
        return saludo;
    }

    String saludo = objeto.saludo("Oleg");
    System.out.println(saludo);
    ---- O ----
    System.out.println(objeto.saludo("Oleg"));
*/

//#############################################################################
//# Introducción a POO, Métodos, Método constructor - Video 66                #
//#############################################################################

/* ¿Qué es un método constructor?
    Un constructor es un método especial de una clase que se invoca siempre que
    se crea un objeto de esa clase.

   Cuando creamos un objeto ocurren 3 cosas
    1.- Se asigna memoria para el objeto.
    2.- Se inicializan los atributos de ese objeto.
    3.- Se invoca al constructor de la clase que puede ser uno entra varios.

    Persona p1 = new Persona();

   Características de los constructores:
    1.- Tienen el mismo nombre de la Clase.
    2.- No devuelve ningún valor.
    3.- Debe declararse como público.
*/

//#############################################################################
//# Introducción a POO, Sobrecarga de Constructores - Video 67                #
//#############################################################################

/* Sobrecarga de constructores
    Muy parecido a lo anterior, solo que está vez no lo haremos manualmente, si
    no que lo hará nuestro entorno de desarrollo.
    La sobrecarga de constructores es cuando en un objeto solo le queremos dar x parámetros sin darlos todos,
    es decir, si en una persona tenemos registrada Nombre, Edad y DNI:
    Paco, 18, 12345678F
    Si introducimos otra persona, y hacemos referencia a otro constructor como por ejemplo:
    null, 0, 12345679F
    de esta manera si podemos añadir un nuevo objeto sin la necesidad de saber su nombre o edad, la podemos
    añadir más tarde cuando queramos.
*/

//#############################################################################
//# Introducción a POO, Modificadores de Acceso - Video 68                    #
//#############################################################################

/* ¿Qué es un modificador de acceso?
    La palabra que va justo antes del atributo, para así poder especificar el tipo de atributo:

    - int atributo1  >> Por defecto
    - Public         >> Modificador public
    - Private        >> Modificador private

    Esto significa que no hemos especificado nada y coge el modificador de acceso por defecto.
    Eso dice que atributo1 puede ser accedido por todas las clases que están en el mismo paquete.

    Si en un caso queremos hacer un objeto de un paquete a otro paquete, lo que debemos hacer es
    importar el paquete on una ruta absoluta.
    Para instanciar el objeto, no podemos hacerlo hasta que el atributo le asignemos el modificador
    de acceso de tipo public:

    public int atributo1

    Con eso podremos movernos sobre todos los paquetes.

    Si asignamos el modificador private

    private in atributo1

    Solo tendremos acceso en la misma clase, no podremos instanciar en ningún otro paquete ni en
    ninguna otra clase que no sea la misma donde está el atributo creado.
 */

//#############################################################################
//# Introducción a POO, Encapsulamiento y métodos de acceso - Video 69        #
//#############################################################################

/* Encapsulamiento y métodos de acceso (Setters Y Getters)
    Encapsulamiento, se encarga de ocultar tanto nuestro atributos como nuestros métodos, para que solo
    puedan ser accedidos desde la misma clase, previene errores cuando tenemos un programa muy extenso.

    Métodos de acceso

    - Setters: establecen valores, por lo cual inicializan el atributo
    - Getters: cogen los valores Setters, para que puedan ser accedidos por otras clases y paquetes.
               De manera que el Getter siempre retorna un valor.

 */

//#############################################################################
//# Introducción a POO, Constantes - Video 70                                 #
//#############################################################################

/*  ¿Qué es una constante?
     Es una espacio de memoria en el cual vas a almacenar un valor que no va a ser alterado por nada.
     No se le pueden aplicar Setters, porque el valor no puede ser cambiado.
*/

//#############################################################################
//# Introducción a POO, Miembros estáticos de una clase - Video 71            #
//#############################################################################

/*  ¿Que son los miembros estáticos?
     Estos son los atributos y métodos de una clase.

     Al crear un objeto de una clase, los atributos son copiados de la clase y todos los objetos
     tienen acceso a los atributos menos el Static.

     El Static directamente pertenece a la clase y no al objeto. Por lo tanto cuando hacemos un cambio
     a un atributo con Static, significa que TODOS los OBJETOS pertenecientes a la clase van a tener lo
     mismo que declaramos en el atributo static.

     Los métodos que se declaran con static, se pueden llamar haciendo uso de la clase y después el
     método:

     ClassName.método
*/
}

























