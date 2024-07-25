
import java.util.Scanner;

public class mayorMenor {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int [] array;
        array = new int[8];

        int minimo = array[0];
        int maximo = array[0];

        int num;

        for (int i = 0; i < array.length; i++) {
            System.out.println("Dame un numero: ");
            num = teclado.nextInt();
            array[i]=num;
            if (array[i]>maximo){
                maximo = array[i];
            }
            if (array[i]<minimo){
                minimo = array[i];
            }
        }
        System.out.println("El numero mayor es "+maximo+" y el numero menor es "+minimo);
    }
}
