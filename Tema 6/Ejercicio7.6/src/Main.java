import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random r = new Random();
        int fil, col = 3, i, apu, loc, vis;


        for(fil = 1; fil <= 14; fil++){
            if(fil < 10){
                System.out.print("Apuesta " + fil + "-  ");
            }
            else {
                System.out.print("Apuesta " + fil + "- ");
            }

            for(i = 0; i < col; i++){
                apu = r.nextInt(3) + 1;
                switch(apu){
                    case 1:{
                        System.out.print(" 1   |");
                    }
                    break;
                    case 2:{
                        System.out.print("  X  |");
                    }
                    break;
                    case 3:{
                        System.out.print("   2 |");
                    }
                    break;
                }
            }
            System.out.println();
        }
        System.out.println("Pleno al 15:");
        loc = r.nextInt(7);
        vis = r.nextInt(7);
        System.out.println("Local: " + loc + " - Visitante: " + vis);
    }
}