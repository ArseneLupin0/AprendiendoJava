package IntroduccionPRGATS.ProgramacionZAvanzada.IntermedioPOO.MainClases2;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Ventana extends JFrame {

//#############################################################################
//# Introducción a POO (Entornos gráficos) - Video 104-105 (MainClases2)      #
//#############################################################################

    JPanel panel;
    JLabel saludo;
    JTextField cajaTexto;
    JButton boton;
    JTextArea areaTexto;

    public Ventana() {
        this.setSize(520, 500);
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
        this.setTitle("Probando Eventos");

        iniciarComponentes();
    }

    private void iniciarComponentes() {
        colocarPanel();
//        colocarEtiqueta();
        colocarCajaDeTexto();
//        colorEtiqueta2();
//        colocarBoton();
        colocarAreaTexto();
    }

    private void colocarPanel() {
        panel = new JPanel();
        panel.setLayout(null);
        this.add(panel);
    }

    private void colocarEtiqueta() {
        JLabel etiqueta = new JLabel("Ingrese su nombre:");
        etiqueta.setBounds(30, 10, 200, 30);
        etiqueta.setFont(new Font("cooper black", Font.BOLD, 18));
        panel.add(etiqueta);
    }

    private void colorEtiqueta2() {
        saludo = new JLabel();
        saludo.setBounds(50, 200, 300, 40);
        saludo.setFont(new Font("arial", Font.PLAIN, 15));
        panel.add(saludo);
    }

    private void colocarCajaDeTexto() {
        cajaTexto = new JTextField();
//        cajaTexto.setBounds(30, 50, 300, 30); // Para el ActionListener
        cajaTexto.setBounds(20, 30, 150, 30); // Para el teclado
        panel.add(cajaTexto);

        eventosDelTeclado();
    }

    private void colocarBoton() {
        boton = new JButton("¡Pulsa aquí");
//        boton.setBounds(150, 100, 150, 40); // para la otra prueba
        boton.setBounds(150, 350, 150, 40);
        panel.add(boton);

//        actionListener();
        eventoOyenteDeRaton();
    }

    private void colocarAreaTexto() {
        areaTexto = new JTextArea();
        areaTexto.setBounds(20, 20, 200, 300);
        panel.add(areaTexto);

        JScrollPane scroll = new JScrollPane(areaTexto, ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED,
                ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER); // Añadimos scroll a la caja
//        scroll.setBounds(20, 20, 220, 300); // Bounds para el ratón
        scroll.setBounds(230, 30, 250, 300); // Bounds para teclado
        panel.add(scroll);
    }

    private void actionListener() {

        // Agregando Evento de tipo ActionListener
        ActionListener oyenteDeAccion =
                new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                saludo.setText("Hola " + cajaTexto.getText());
            }
        };
        boton.addActionListener(oyenteDeAccion);
    }

    private void eventoOyenteDeRaton() {
        // Agregando oyente de Ratón - MouseListener
        MouseListener oyenteDeRaton = new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent mouseEvent) {
                areaTexto.append("Clic de ratón\n");
            }

            @Override
            public void mousePressed(MouseEvent mouseEvent) {
                areaTexto.append("Ratón presionado\n");
            }

            @Override
            public void mouseReleased(MouseEvent mouseEvent) {
                areaTexto.append("Clic de ratón (válido fuera de botón)\n");
            }

            @Override
            public void mouseEntered(MouseEvent mouseEvent) {
                areaTexto.append("Ratón ha entrado en botón\n");
            }

            @Override
            public void mouseExited(MouseEvent mouseEvent) {
                areaTexto.append("Ratón ha salido del botón\n");
            }
        };
        boton.addMouseListener(oyenteDeRaton);
    }

    private void eventosDelTeclado() {
        // Agregando oyente de Teclado - KeyListener
        KeyListener eventoTeclado = new KeyListener() {
            @Override
            public void keyTyped(KeyEvent keyEvent) {
//                areaTexto.append("Tecla de caracteres (unicode)\n");
            }

            @Override
            public void keyPressed(KeyEvent keyEvent) {
//                areaTexto.append("Tecla presionada (cualquiera)\n");
            }

            @Override
            public void keyReleased(KeyEvent keyEvent) {
//                areaTexto.append("Tecla presionada / soltada (cualquiera)\n");
                if (keyEvent.getKeyChar() == 't') {
                    areaTexto.append("Tecla presionada T\n");
                }
                if (keyEvent.getKeyChar() == '\n') {
                    areaTexto.append("Tecla presionada Enter\n");
                }
                if (keyEvent.getKeyChar() == ' ') {
                    areaTexto.append("Tecla presionada Espacio\n");
                }
            }
        };
        cajaTexto.addKeyListener(eventoTeclado);
    }
}