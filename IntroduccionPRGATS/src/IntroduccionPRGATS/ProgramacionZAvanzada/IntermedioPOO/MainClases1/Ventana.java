package IntroduccionPRGATS.ProgramacionZAvanzada.IntermedioPOO.MainClases1;

import javax.swing.*;
import java.awt.*;

public class Ventana extends JFrame { // Al poner this., nos referimos a la ventana

//#############################################################################
//# Introducción a POO (Entornos gráficos) - Video 87-90 (MainClases1)        #
//#############################################################################

    // Instanciamos nuestro panel / Creamos el panel.
    JPanel panel = new JPanel();

    public Ventana() {

        // Establecemos el tamaño de la ventana.
        this.setSize(500, 500);

        // Hacemos que el boton de la X cierre.
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        // Sirve para establecer el título de la ventana.
        this.setTitle("Bienvenido al primer programa");

        // Establecemos la posición inicial de la ventana.
        this.setLocation(100, 200);

        // Englobamos a "setSize" y a "setLocation".
        this.setBounds(100, 200, 500, 500);

        // Establecemos la ventana en el centro de la pantalla.
        this.setLocationRelativeTo(null);

        // Establecer el poder cambiar de tamaño la ventana.
//        this.setResizable(false);

        // Establecemos un tamaño mínimo para nuestra ventana.
        this.setMinimumSize(new Dimension(200, 200));

        // Establecemos un color para la ventana.
        this.getContentPane().setBackground(Color.blue);

        iniciarComponentes();
    }

    private void iniciarComponentes() {
        colocarPaneles();
//        colocarEtiquetas();
//        colocarBotones();
//        colocarRadioBotones();
//        colocarBotonesDeActivacion();
//        colocarCajaTexto();
//        colocarAreasDeTexto();
        colocarListasDesplegables();
    }

    private void colocarPaneles() {
        // Instanciamos nuestro panel
        panel = new JPanel();

        // Desactivar el diseño del panel
        panel.setLayout(null);

        // Le damos un color a nuestro panel, no a nuestra ventana.
//        panel.setBackground(Color.green);

        // Agregamos el panel a la ventana.
        this.getContentPane().add(panel);
    }

    private void colocarEtiquetas() {

        // Creación de etiqueta. // Centrar etiqueta.
        JLabel etiqueta = new JLabel(/*"Hola mundo", SwingConstants.CENTER*/);

        // Establecemos el texto de la etiqueta.
        etiqueta.setText("Hola mundo");

        etiqueta.setBounds(120, 10, 250, 50);

        // Centramos el texto de nuestra etiqueta.
        etiqueta.setHorizontalAlignment(SwingConstants.CENTER);

        // Establecemos un color de letra para nuestra etiqueta.
        etiqueta.setForeground(Color.YELLOW);

        // Establecer a nuestra etiqueta que se pueda cambiar de fondo.
        etiqueta.setOpaque(true);

        // Cambiamos el color - Necesitamos desactivar el diseño de la etiqueta.
        etiqueta.setBackground(Color.BLACK);

        // Establecemos la fuente par nuestro texto.
        etiqueta.setFont(new Font("chiller", Font.BOLD, 23));

        // Agregamos la etiqueta al panel.
        panel.add(etiqueta);

        // Etiqueta 2 - etiqueta tipo imagen
        // Ponemos una imagen en nuestra etiqueta
        ImageIcon imagen = new ImageIcon("src\\IntroduccionPRGATS.ProgramacionZAvanzada\\IntermedioPOO\\MainClases1\\imagen.png");
        JLabel etiqueta2 = new JLabel();
        etiqueta2.setBounds(47, 62, 400, 400);

        // Metemos nuestra imagen en nuestra etiqueta y le damos un tamaño
        etiqueta2.setIcon(new ImageIcon(imagen.getImage().getScaledInstance(etiqueta2.getWidth(), etiqueta2.getHeight(), Image.SCALE_SMOOTH)));
        panel.add(etiqueta2);
    }

    private void colocarBotones() {

        // Botón 1
        JButton boton1 = new JButton("Click");
        boton1.setBounds(100, 100, 100, 40);
        boton1.setEnabled(true); // Activar o desactivar funciones del botón
        boton1.setMnemonic('a'); // Establecemos alt + letra (como si hiciéramos click)
        boton1.setForeground(Color.BLUE);
        boton1.setFont(new Font(Font.MONOSPACED, Font.BOLD, 18));
        panel.add(boton1);

        // Botón 2
        JButton boton2 = new JButton();
        boton2.setBounds(100, 200, 100, 40);
//        boton2.setOpaque(true);
        ImageIcon clicAqui = new ImageIcon("src\\IntroduccionPRGATS.ProgramacionZAvanzada\\IntermedioPOO\\MainClases1\\imagen2.png");
        boton2.setIcon(new ImageIcon(clicAqui.getImage().getScaledInstance(boton2.getWidth(), boton2.getHeight(), Image.SCALE_SMOOTH)));
        boton2.setBackground(Color.BLUE); // Establecemos color de fondo del botón
        panel.add(boton2);
    }

    public void colocalRadioBotones() {

        // Creación de un Radio de botones
        JRadioButton radioButon1 = new JRadioButton("Opción 1", true);
        radioButon1.setBounds(50, 100, 200, 50);
//        radioButon1.setEnabled(false);
        radioButon1.setText("Programación");
        radioButon1.setFont(new Font("cooper black", Font.PLAIN, 20));
        panel.add(radioButon1);

        JRadioButton radioButon2 = new JRadioButton("Opción 2", false);
        radioButon2.setBounds(50, 150, 100, 50);
        panel.add(radioButon2);

        JRadioButton radioButon3 = new JRadioButton("Opción 3", false);
        radioButon3.setBounds(50, 200, 100, 50);
        panel.add(radioButon3);

        ButtonGroup grupoRadioBotones = new ButtonGroup(); // Creación del grupo de radio botones
        grupoRadioBotones.add(radioButon1); // Agregar botones al grupo
        grupoRadioBotones.add(radioButon2);
        grupoRadioBotones.add(radioButon3);
    }

    public void colocarCajaTexto() {
        JTextField cajaTexto = new JTextField();
        cajaTexto.setBounds(50, 50, 100, 30);
        cajaTexto.setText("Hola mundo"); // Poner un texto predefinido

        System.out.println("Texto de la caja: " + cajaTexto.getText());
        panel.add(cajaTexto);
    }

    public void colocarAreasDeTexto() {
        JTextArea areaTexto = new JTextArea();
        areaTexto.setBounds(20, 20, 300, 200);
        areaTexto.setText("Escribe el texto aquí...");
        areaTexto.append("\nEscribe por aquí..."); // Añade más texto al área de texto
        areaTexto.setEditable(true); // Establecer editado del área de texto
        System.out.println("El texto es: " + areaTexto.getText());
        panel.add(areaTexto);
    }

    public void colocarListasDesplegables() {
        String[] paises = {"España", "Francia", "Perú", "Colombia"};

        JComboBox<String> listaDesplegable1 = new JComboBox<>(paises);

        listaDesplegable1.setBounds(20, 20, 100, 30);
        listaDesplegable1.addItem("Argentina"); // Agregar un item después de iniciarlo
        listaDesplegable1.setSelectedItem("Argentina"); // Seleccionar un objeto por defecto
        panel.add(listaDesplegable1);
    }
}
