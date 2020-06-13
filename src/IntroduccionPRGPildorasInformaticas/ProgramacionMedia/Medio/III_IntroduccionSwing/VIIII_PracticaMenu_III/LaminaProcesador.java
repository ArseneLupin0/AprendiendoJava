package IntroduccionPRGPildorasInformaticas.ProgramacionMedia.Medio.III_IntroduccionSwing.VIIII_PracticaMenu_III;

import javax.swing.*;
import javax.swing.text.StyledEditorKit;
import java.awt.*;

public class LaminaProcesador extends JPanel {

//#############################################################################
//# Introducción a Procesador Textos - Píldoras Informáticas - Video 106      #
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
                if (tipo_Letra.equalsIgnoreCase("Arial")) {
                    elemMenu.addActionListener(new StyledEditorKit.FontFamilyAction("cambiaLetra", "Arial"));
                } else if (tipo_Letra.equalsIgnoreCase("Courier New")) {
                    elemMenu.addActionListener(new StyledEditorKit.FontFamilyAction("cambiaLetra", "Courier New"));
                } else if (tipo_Letra.equalsIgnoreCase("Verdana")) {
                    elemMenu.addActionListener(new StyledEditorKit.FontFamilyAction("cambiaLetra", "Verdana"));
                }
                break;
            }
            case 2: {
                estilo.add(elemMenu);
                if (estilos == Font.BOLD) {
                    elemMenu.addActionListener(new StyledEditorKit.BoldAction());
                } else if (estilos == Font.ITALIC) {
                    elemMenu.addActionListener(new StyledEditorKit.ItalicAction());
                }
                break;
            }
            case 3:
                tamagno.add(elemMenu);
                elemMenu.addActionListener(new StyledEditorKit.FontSizeAction("CambiaTamaño", tam));
                break;
        }
    }
}