import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i = 5, n, min = 0, max = 100, mmi;
        boolean acertado = false;
        while (i > 0) {
            n = (int) (Math.random() * (max - min) + min);
            System.out.println("¿Tu número es " + n + "?");
            System.out.print("El número que estás pensando es 1) mayor 2) menor 3) igual: ");
            mmi = sc.nextInt();
            i--;
            if ((mmi == 1) && (i > 0))
                min = n + 1;

            if ((mmi == 2) && (i > 0))
                max = n - 1;

            if (mmi == 3) {
                acertado = true;
                System.out.println("He acertado.");
                break;
            }
        }

            if (!acertado && i == 0) {
                System.out.println("No he acertado.");
            }

    }
}