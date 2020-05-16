package IntroduccionPRGATS.ProgramacionZAvanzada.IntermedioPOO;

import java.util.Arrays;
import java.util.List;

public class ZInicio {
    public static void main(String[] args) {
        List<Integer> lista = Arrays.asList(1, 4, 6, 4, 6, 7, 8, 9, 1, 10);
        lista.forEach(System.out::print);
        System.out.println("\n"+lista.stream().mapToInt(v -> v).filter((x -> x >= 5)).sum());
    }

// INTRODUCCIÓN A POO - Entornos gráficos //

//#############################################################################
//# Introducción a POO (Entornos gráficos) - Video 87-90 (MainClases1)        #
//#############################################################################

/* Introducción a POO con Entornos gráficos:
    Es una forma especial de programar, más cercana a como expresaríamos las cosas en la vida real que
    otros tipos de programación. Aparte aquí vamos a ver entornos gráficos, tales como botones...

   Ventanas JFrame:
    Todas las propiedades, las iremos documentando en el propio archivo de Java.

   Ventanas y Paneles:
    La diferencia entre ventanas y paneles, está en que una ventana es lo principal y el panel es donde ponemos el
    resto de cosas.

    Ejemplo:

    Imaginaros que el JFrame es el escritorio (o una mesa), si nosotros queremos añadir etiquetas (escribir),
    escribiremos directamente en la mesa, sin tener un papel en el cuál escribir para no "manchar la mesa". Por lo
    tanto el JFrame lo usamos como mesa, y el JPanel (contenedor de componentes) como un manto que va siempre encima
    de nuestro JFrame.
    Tod esto sirve para organizarnos mucho mejor.

    Sumario de los vídeos:

    87 - Creación de JFrame.
    88 - Cierre de Ventana algunas propiedades más.
    89 - Posicionamiento de ventanas y colores.
    90 - Creación de JPanel y añadirlo a nuestra ventana.
*/

//#############################################################################
//# Introducción a POO (Entornos gráficos) - Video 91-96 (MainClases1)        #
//#############################################################################

/* Creación de etiquetas:
    Estructura:

    JFrame --->> JPanel --->> Etiqueta

    Sumario de vídeos:

    91 - Creación de etiqueta
    92 - Nuevas propiedades para nuestra etiqueta
    93 - Cambiar ubicación del texto
    94 - Modificar la fuente del texto. Estructura setFont(new Font(name, style, size));
    95 - Agregar una etiqueta tipo imagen
           1.- JLabel etiqueta2 = new JLabel(new ImageIcon("Ruta"));

           2.- ImageIcon imagen = new ImageIcon("Ruta");
             - JLabel etiqueta2 = new JLabel(imagen);

           3.- JLabel etiqueta2 = new JLabel();
             - etiqueta2.setIcon(new ImageIcon("Ruta"));
    96 - Propiedad, para cambiar el tamaño de imagen: getScaledInstance(300,300, Image.SCALE_SMOOTH)
           1.- Por defecto hay que modificar dos parámetros
           2.- En 300x300, podemos poner etiqueta.getWidth, etiqueta.getHeight
*/

//#############################################################################
//# Introducción a POO (Entornos gráficos) - Video 97-99 (MainClases1)        #
//#############################################################################

/* Creación de botones:
    Estructura:

    JFrame --->> JPanel --->> Botones

    Sumario de vídeos:

    97 - Creación de boton, desactivar funciones de botón y dar funciones con alt + letra
    98 - Personalizar el boton y letra
    99 - Cambiar tipo de fondo del botón, poner una imagen de fondo

*/

//#############################################################################
//# Introducción a POO (Entornos gráficos) - Video 100 (MainClases1)          #
//#############################################################################

/* Creación de Radio de Botones:
    Estructura:

    JFrame --->> JPanel --->> RadioBotones

    Sumario de vídeos:

    100 - Creación de un radioBotón, con algunas propiedades

*/

//#############################################################################
//# Introducción a POO (Entornos gráficos) - Video 101 (MainClases1)          #
//#############################################################################

/* Creación de Caja Texto:
    Estructura:

    JFrame --->> JPanel --->> CajaTexto

    Sumario de vídeos:

    101 - Creación de una caja de texto

*/

//#############################################################################
//# Introducción a POO (Entornos gráficos) - Video 102 (MainClases1)          #
//#############################################################################

/* Creación de un Área de Texto:
    Estructura:

    JFrame --->> JPanel --->> AreaTexto

    Sumario de vídeos:

    102 - Creación de una Área de Texto

*/

//#############################################################################
//# Introducción a POO (Entornos gráficos) - Video 103 (MainClases1)          #
//#############################################################################

/* Creación de listas desplegables:
    Estructura:

    JFrame --->> JPanel --->> ListaDesplegable

    Sumario de vídeos:

    103 - Creación de una ListaDesplegable

*/

//#############################################################################
//# Introducción a POO (Entornos gráficos) - Video 104 (MainClases2)          #
//#############################################################################

/* Creación de Eventos - Oyente de acción:
    Estructura:

    JFrame --->> JPanel --->> ActionListener (clase abstracta / anónima)

    Sumario de vídeos:

    104 - Creación de eventos de oyente, en botón

*/

//#############################################################################
//# Introducción a POO (Entornos gráficos) - Video 105 (MainClases2)          #
//#############################################################################

/* Creación de Eventos - Oyente de Ratón:
    Estructura:

    JFrame --->> JPanel --->> MouseListener (clase abstracta / anónima)

    Sumario de vídeos:

    105 - Creación de eventos para Oyente de Ratón, existen 5 tipos

*/

//#############################################################################
//# Introducción a POO (Entornos gráficos) - Video 106 (MainClases2)          #
//#############################################################################

/* Creación de Eventos - Oyente de Teclado:
    Estructura:

    JFrame --->> JPanel --->> KeyListener (clase abstracta / anónima)

    Sumario de vídeos:

    106 - Creación de eventos para Oyente de Teclado, existen 3 tipos

*/
}