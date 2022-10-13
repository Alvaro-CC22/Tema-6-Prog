import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random r = new Random();
        int d1, d2, i = 1;

        d1 = r.nextInt(6) + 1;
        d2 = r.nextInt(6) + 1;

        System.out.println("Dado 1: " + d1 + " Dado 2: " + d2);

        while(d1 != d2){
            d1 = r.nextInt(6) + 1;
            d2 = r.nextInt(6) + 1;
            i++;
            System.out.println("Dado 1: " + d1 + " Dado 2: " + d2);
        }
        System.out.println("Ha tardado " + i + " intentos.");
    }
}