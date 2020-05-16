package IntroduccionPRGPildorasInformaticas.ProgramacionBasica.Basico.VII_Arrays.Arrays_IV;

public class ArraysBidimensionales {

//#############################################################################
//# Arrays IV - Píldoras Informáticas - Video 26                              #
//#############################################################################

    public static void main(String[] args) {
        int[][] matrix = {
                {10, 15, 18, 19, 21},
                {5, 25, 37, 41, 15},
                {7, 19, 32, 14, 90},
                {85, 2, 7, 40, 27}
        };

        for (int i = 0; i < 4; i++) {
            System.out.println();
            for (int j = 0; j < 5; j++) {
                System.out.print(matrix[i][j] + " ");
            }
        }

        System.out.println("\n\nCon bucles ForEach:");

        for (int[] fila :
                matrix) {
            System.out.println();
            for (int z :
                    fila) {
                System.out.print(z + " ");
            }
        }
    }
}