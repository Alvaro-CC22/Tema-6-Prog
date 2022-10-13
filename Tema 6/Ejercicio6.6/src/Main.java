import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Random r = new Random();
        Scanner sc = new Scanner(System.in);
        int n, i, n2;
        n = r.nextInt(101);

        System.out.println("Intenta adivinar el número que estoy pensando (Tienes 5 oportunidades): ");
        n2 = sc.nextInt();

        if(n2 == n){
            System.out.println("Felicidades, has acertado.");

        }
        else{
            if(n2 > n){
                System.out.println("El número que pienso es menor");
            }
            else{
                if(n2 < n) {
                    System.out.println("El número que pienso es mayor");
                }
            }
            for(i = 4; i > 0; i--){

                System.out.println("No has acertado, intentalo de nuevo (Te quedan " + i + " oportunidades): ");
                n2 = sc.nextInt();

                if (n2 == n){
                    System.out.println("Felicidades, has acertado.");
                    break;
                }
                else {
                    if (n2 > n) {
                        System.out.println("El número que pienso es menor");
                    } else {
                        System.out.println("El número que pienso es mayor");
                    }
                }
            }
            if(i == 0){
                System.out.println("Lo siento, no has podido acertar el número.");
            }
        }
    }
}