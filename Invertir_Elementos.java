
import java.util.Arrays;
import java.util.Scanner;

public class Invertir_Elementos {
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);

        int [] array;
        array = new int[6];
        int datos;
        
        for (int i = 0; i < array.length; i++) {
            System.out.println("Dame un numero: ");
            datos = teclado.nextInt();
            array[i]=datos;
    }
        int [] invertir;
        invertir = new int[array.length];
        for (int x=0;x<array.length; x++){
            invertir[x] = array[array.length -1 -x];
        }
        System.out.println("Arreglo invertido: " + Arrays.toString(invertir));
}
}
