import java.util.Random;

public class Main {
    public static void main(String[] args) {
        int d1,d2,d3, suma = 0;
        Random r = new Random();

        d1 = r.nextInt(6) + 1;
        d2 = r.nextInt(6) + 1;
        d3 = r.nextInt(6) + 1;

        suma = d1 + d2 + d3;

        System.out.println("Dado 1 = " + d1);
        System.out.println("Dado 2 = " + d2);
        System.out.println("Dado 3 = " + d3);
        System.out.println("Suma = " + suma);
    }
}