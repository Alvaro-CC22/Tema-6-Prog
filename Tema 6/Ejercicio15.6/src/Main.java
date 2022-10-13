import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random r = new Random();
        int notas, i, n;
        String nota = "";
        String primeraNota = "";
        notas = 4 * (r.nextInt(7) + 1);
        for (i = 1; i <= notas; i++) {
            n = r.nextInt(7);
            switch(n) {
                case 0:
                    nota = "do";
                    break;
                case 1:
                    nota = "re";
                    break;
                case 2:
                    nota = "mi";
                    break;
                case 3:
                    nota = "fa";
                    break;
                case 4:
                    nota = "sol";
                    break;
                case 5:
                    nota = "la";
                    break;
                case 6:
                    nota = "si";
                    break;
                default:
            }

            if (i == 1) {
                primeraNota = nota;
            }

            if (i == notas) {
                nota = primeraNota;
            }

            System.out.print(nota + " ");

            if ( i == notas ) {
                System.out.print("||");
            } else if ( i % 4 == 0 ) {
                System.out.print("| ");
            }

        }
    }
}