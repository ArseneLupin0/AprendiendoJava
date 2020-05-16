package IntroduccionPRGPildorasInformaticas.ProgramacionBasica.Basico.VII_Arrays.Arrays_I;

public class UsoArrays {

//#############################################################################
//# Arrays I - Píldoras Informáticas - Video 23                               #
//#############################################################################

    public static void main(String[] args) {
        int[] array = new int[5];

        array[0] = 5;
        array[1] = 38;
        array[2] = -15;
        array[3] = 92;
        array[4] = 71;

//        System.out.println(array[0]);
//        System.out.println(array[1]);
//        System.out.println(array[2]); // No es eficaz!!
//        System.out.println(array[3]);
//        System.out.println(array[4]);

        for (int i = 0; i < array.length; i++) {
            System.out.println("Valor del índice " + i + " = " + array[i]);
        }

        System.out.println("\nSegunda matriz:\n");

        int[] array2 = new int[]{5, 38, -15, 92, 71, 95, 85, 65, 25, 14, 78, 85, 65, 12, 45, 78, 78, 95, 23};

        for (int i = 0; i < array2.length; i++) {
            System.out.println("Valor del índice " + i + " = " + array2[i]);
        }
    }
}
