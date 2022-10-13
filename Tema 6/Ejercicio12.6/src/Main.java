public class Main {
    public static void main(String[] args) {
        int linea = 0, i;

        System.out.print("\033[32m");

        for(i = 0; i < 21000; i++) {
            System.out.print((char)(Math.random() * (126 - 32 + 1) + 32));

            linea++;
            if (linea == 60) {
                linea = 0;
                System.out.println();
            }
        }
    }
}