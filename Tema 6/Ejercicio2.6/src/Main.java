import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random r = new Random();
        int c, p;

        c = r.nextInt(13) + 1;
        p = r.nextInt(4) + 1;

        switch (c){
            case 1:{
                System.out.print("A");
            }
            break;
            case 2:{
                System.out.print(c);
            }
            break;
            case 3:{
                System.out.print(c);
            }
            break;
            case 4:{
                System.out.print(c);
            }
            break;
            case 5:{
                System.out.print(c);
            }
            break;
            case 6:{
                System.out.print(c);
            }
            break;
            case 7:{
                System.out.print(c);
            }
            break;
            case 8:{
                System.out.print(c);
            }
            break;
            case 9:{
                System.out.print(c);
            }
            break;
            case 10:{
                System.out.print(c);
            }
            break;
            case 11:{
                System.out.print("J");
            }
            break;
            case 12:{
                System.out.print("Q");
            }
            break;
            case 13:{
                System.out.print("K");
            }
            break;
        }
        switch (p) {
            case 1: {
                System.out.print(" de Picas");
            }
            break;
            case 2: {
                System.out.print(" de Corazones");
            }
            break;
            case 3: {
                System.out.print(" de Diamantes");
            }
            break;
            case 4: {
                System.out.print(" de Tréboles");
            }
            break;
        }
    }
}