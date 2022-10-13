import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random r = new Random();
        int c, p;

        c = r.nextInt(10) + 1;
        p = r.nextInt(4) + 1;

        switch (c){
            case 1:{
                System.out.print("As");
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
                System.out.print("Sota");
            }
            break;
            case 9:{
                System.out.print("Caballo");
            }
            break;
            case 10:{
                System.out.print("Rey");
            }
            break;
        }
        switch (p) {
            case 1: {
                System.out.print(" de Bastos");
            }
            break;
            case 2: {
                System.out.print(" de Oros");
            }
            break;
            case 3: {
                System.out.print(" de Espadas");
            }
            break;
            case 4: {
                System.out.print(" de Copas");
            }
            break;
        }
    }
}