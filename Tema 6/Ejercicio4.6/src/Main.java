import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random r = new Random();
        int n, i;

        for(i = 1; i <= 20; i++){
            n = r.nextInt(11);
            System.out.println(i + "- " + n);
        }
    }
}