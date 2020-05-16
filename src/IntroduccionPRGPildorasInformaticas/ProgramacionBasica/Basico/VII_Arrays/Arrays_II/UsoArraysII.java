package IntroduccionPRGPildorasInformaticas.ProgramacionBasica.Basico.VII_Arrays.Arrays_II;

public class UsoArraysII {

//#############################################################################
//# Arrays II - Píldoras Informáticas - Video 24                              #
//#############################################################################

    public static void main(String[] args) {
        int[] matrizAleatorios = new int[150];

        for (int i = 0; i < matrizAleatorios.length; i++) {
            matrizAleatorios[i] = (int) Math.round(Math.random() * 100);
        }

        for (int miMatriz :
                matrizAleatorios) {
            System.out.print(miMatriz + " ");
        }
    }
}
