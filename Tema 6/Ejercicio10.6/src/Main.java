import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Random r = new Random();
        int alt = 10, lon, car, i, j;


        for(i = 0; i < alt; i++){
            lon = r.nextInt(40) + 1;
            System.out.println(lon);
            for(j = 0; j < lon; j++){
                car = r.nextInt(5) + 1;
                switch (car){
                    case 1:{
                        System.out.print("*");
                    }
                    break;
                    case 2:{
                        System.out.print("-");
                    }
                    break;
                    case 3:{
                        System.out.print("=");
                    }
                    break;
                    case 4:{
                        System.out.print(".");
                    }
                    break;
                    case 5:{
                        System.out.print("|");
                    }
                    break;
                }
            }
            System.out.println();
        }
    }
}