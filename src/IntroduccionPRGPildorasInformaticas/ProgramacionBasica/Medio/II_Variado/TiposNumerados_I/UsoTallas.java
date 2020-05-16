package IntroduccionPRGPildorasInformaticas.ProgramacionBasica.Medio.II_Variado.TiposNumerados_I;

import java.util.Scanner;

public class UsoTallas {

//#############################################################################
//# Tipos numerados I - Píldoras Informáticas - Video 48                      #
//#############################################################################

    public static void main(String[] args) {
//        String talla;
//
//        talla = "Pequeña";
//        talla = "Mediana";
//        talla = "Grande";
//        talla = "Azul";
//
//        Talla s = Talla.MINI;
//        Talla m = Talla.MEDIANO;
//        Talla l = Talla.GRANDE;
//        Talla xl = Talla.MUY_GRANDE;
        Scanner entrada = new Scanner(System.in);
        System.out.println("Escribe una talla: MINI, MEDIANO, GRANDE, MUY_GRANDE");
        String entradaDatos = entrada.nextLine().toUpperCase();

        UsoTallasEnum laTalla = UsoTallasEnum.valueOf(UsoTallasEnum.class, entradaDatos);

        System.out.println("Talla= " + laTalla);
        System.out.println("Abreviatura=" + laTalla.getAbreviatura());
    }

    //    enum Talla {MINI, MEDIANO, GRANDE, MUY_GRANDE} // Tipo enumerado
//    enum Talla {
//        MINI("S"), MEDIANO("M"), GRANDE("L"), MUY_GRANDE("XL");
//        private String abreviatura;
//
//        private Talla(String abreviatura) {
//            this.abreviatura = abreviatura;
//        }
//
//        public String getAbreviatura() {
//            return abreviatura;
//        }
//    }
}
