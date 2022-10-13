public class Main {
    public static void main(String[] args) {
        int f, f1 = 0, f2 = 0, f3 = 0;

        for (int i = 0; i < 3; i++) {
            f = (int)(5 * Math.random());

            switch(f) {
                case 0:
                    System.out.print("\uD83C\uDF4B ");
                    break;
                case 1:
                    System.out.print("\uD83D\uDD14 ");
                    break;
                case 2:
                    System.out.print("\uD83C\uDF47 ");
                    break;
                case 3:
                    System.out.print("\uD83C\uDF4A ");
                    break;
                case 4:
                    System.out.print("\uD83D\uDC8E ");
                    break;
                default:
            }

            switch(i) {
                case 0:
                    f1 = f;
                    break;
                case 1:
                    f2 = f;
                    break;
                case 2:
                    f3 = f;
                    break;
                default:
            }
        }

        if ((f1 != f2) && (f2 != f3) && (f1 != f3)) {
            System.out.println("\nLo siento, ha perdido.");
        } else if ((f1 == f2) && (f2 == f3)) {
            System.out.println("\nEnhorabuena, ha ganado 10 monedas.");
        } else {
            System.out.println("\nBien, ha recuperado su moneda.");
        }
    }
}