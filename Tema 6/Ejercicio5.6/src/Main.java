import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random r = new Random();
        int n, i, mayor = 0, menor = 200, suma = 0;
        double media;

        for(i = 1; i <= 50; i++){
            n = r.nextInt(100) + 100;
            if(n > mayor){
                mayor = n;
            }
            if(n < menor){
                menor = n;
            }
            System.out.println(i + "- " + n);
            suma = suma + n;
        }
        media = (double) suma / 50;
        System.out.println("Máximo: " + mayor);
        System.out.println("Mínimo: " + menor);
        System.out.println("Media: " + media);
    }
}