import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random r = new Random();
        int i = 1, n;

        n = r.nextInt(101);
        System.out.println(n);

        while(n != 24){
            n = r.nextInt(101);
            if(n % 2 == 0){
                System.out.println(n);
                i++;
            }
        }
        System.out.println("Se han generado " + i + " números.");
    }
}