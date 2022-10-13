import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random r = new Random();
        int bie = 0, not = 0, sob = 0, sus = 0, suf = 0, i, n;

        for(i = 1; i <= 20; i++){
            n = r.nextInt(11);
            if(n < 5){
                System.out.println(i + "- Suspenso: " + n);
                sus++;
            }
            else{
                if(n == 5){
                    System.out.println(i + "- Suficiente: " + n);
                    suf++;
                }
                else{
                    if(n == 6){
                        System.out.println(i + "- Bien: " + n);
                        bie++;
                    }
                    else {
                        if(n > 6 && n < 9){
                            System.out.println(i + "- Notable: " + n);
                            not++;
                        }
                        else{
                            if(n > 8){
                                System.out.println(i + "- Sobresaliente: " + n);
                                sob++;
                            }
                        }
                    }
                }
            }
        }
        System.out.println("Suspensos: " + sus);
        System.out.println("Suficientes: " + suf);
        System.out.println("Bienes: " + bie);
        System.out.println("Notables: " + not);
        System.out.println("Sobresalientes: " + sob);
    }
}