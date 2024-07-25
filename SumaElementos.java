
import java.util.Scanner;

public class SumaElementos {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int [] numero;
        numero = new int[5];

        int suma=0, num;

        for (int i = 0; i < numero.length; i++) {
            System.out.println("Dame un numero: ");
            num = teclado.nextInt();
            numero[i]=num;
            suma=suma+numero[i];
        }
        System.out.println("La suma de los datos ingresados es: "+suma);
    }
}
