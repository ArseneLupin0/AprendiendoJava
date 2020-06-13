package IntroduccionPRGPildorasInformaticas.ProgramacionMedia.Medio.III_IntroduccionSwing.VIIII_PracticaMenu_II;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LaminaProcesador extends JPanel {

//#############################################################################
//# Introducción a Procesador Textos - Píldoras Informáticas - Video 105      #
//#############################################################################

    private JMenu fuente, estilo, tamagno;
    private JTextPane area;
    private Font letras;

    public LaminaProcesador() {
        setLayout(new BorderLayout());

        JMenuBar menuPrincipal = new JMenuBar();
        area = new JTextPane();
        JScrollPane scrollArea = new JScrollPane(area);

        fuente = new JMenu("Fuente");
        estilo = new JMenu("Estilo");
        tamagno = new JMenu("Tamaño");

        menuPrincipal.add(fuente);
        menuPrincipal.add(estilo);
        menuPrincipal.add(tamagno);

        // Menú 1
        creacionMenus("Arial", 1, "Arial", 0, 0);
        creacionMenus("Courier New", 1, "Courier New", 0, 0);
        creacionMenus("Verdana", 1, "Verdana", 0, 0);

        // Menú 2
        creacionMenus("Negrita", 2, "", Font.BOLD, -1);
        creacionMenus("Cursiva", 2, "", Font.ITALIC, -1);

        // Menú 3
        creacionMenus("12", 3, "", -1, 12);
        creacionMenus("16", 3, "", -1, 16);
        creacionMenus("20", 3, "", -1, 20);
        creacionMenus("24", 3, "", -1, 24);

        JPanel panelCentrado = new JPanel();
        panelCentrado.add(menuPrincipal);

        add(panelCentrado, BorderLayout.NORTH);
        menuPrincipal.setMargin(new Insets(5, 50, 5, 5));
        add(scrollArea, BorderLayout.CENTER);
    }

    public void creacionMenus(String nombre, int tipo, String tipo_Letra, int estilos, int tam) {
        JMenuItem elemMenu = new JMenuItem(nombre);
        switch (tipo) {
            case 1: {
                fuente.add(elemMenu);
                break;
            }
            case 2: {
                estilo.add(elemMenu);
                break;
            }
            case 3:
                tamagno.add(elemMenu);
                break;
        }
        elemMenu.addActionListener(new GestionEventos(nombre, tipo_Letra, estilos, tam));
    }

    private class GestionEventos implements ActionListener {
        String tipoTexto, menu;
        int estiloLetra, tamagnoLetra;

        public GestionEventos(String elemento, String texto2, int estilo2, int tamLetra) {
            tipoTexto = texto2;
            estiloLetra = estilo2;
            tamagnoLetra = tamLetra;
            menu = elemento;
        }

        @Override
        public void actionPerformed(ActionEvent actionEvent) {
            letras = area.getFont();

            if (menu.equalsIgnoreCase("Arial") || menu.equalsIgnoreCase("Courier New") || menu.equalsIgnoreCase("Verdana")) {
                estiloLetra = letras.getStyle();
                tamagnoLetra = letras.getSize();
            } else if (menu.equalsIgnoreCase("Cursiva") || menu.equalsIgnoreCase("Negrita")) {
                if ((letras.getStyle() == Font.BOLD || letras.getStyle() == Font.ITALIC)) {
                    estiloLetra = 3;
                }
                tipoTexto = letras.getFontName();
                tamagnoLetra = letras.getSize();
            } else if (menu.equalsIgnoreCase("12") || menu.equalsIgnoreCase("16") ||
                    menu.equalsIgnoreCase("20") || menu.equalsIgnoreCase("24")) {
                estiloLetra = letras.getStyle();
                tipoTexto = letras.getFontName();
            }

            area.setFont(new Font(tipoTexto, estiloLetra, tamagnoLetra));
        }
    }
}