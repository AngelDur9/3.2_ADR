import java.util.Scanner;

public class Contar_numeros {
    public static void main(String[] args) {
        int [] num;
        num = new int[10];
        int dato, contadorpar=0, contadorinpar=0;

        Scanner teclado = new Scanner(System.in);

        for(int i=0;i<num.length;i++){
            System.out.println("Dame un numero: ");
            dato = teclado.nextInt();
            num[i]=dato;
            if (num[i]%2==0){
                contadorpar++;
            } else {
                contadorinpar++;
            }
        }
        System.out.println("Fueron "+contadorpar+" numeros pares.");
        System.out.println("Fueron "+contadorinpar+" numeros impares");
    }
    
}
