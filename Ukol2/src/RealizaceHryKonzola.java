import java.util.Scanner;

public class RealizaceHryKonzola {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Zadejte velikost šachovnice (nx ny):");
        int nx = scanner.nextInt();
        int ny = scanner.nextInt();

        HraPosunPoSachovnici hra = new HraPosunPoSachovnici(nx, ny);

        System.out.println("Hra začíná! Použijte <L>, <R>, <U>, <D> pro pohyb. <K> pro ukončení.");
        while (true) {
            System.out.print("Vaše volba: ");
            String vstup = scanner.next().toUpperCase();

            if (vstup.equals("K")) {
                System.out.println("Hra ukončena.");
                break;
            }

            switch (vstup) {
                case "L":
                    hra.posun(SmerPohybu.LEFT);
                    break;
                case "R":
                    hra.posun(SmerPohybu.RIGHT);
                    break;
                case "U":
                    hra.posun(SmerPohybu.UP);
                    break;
                case "D":
                    hra.posun(SmerPohybu.DOWN);
                    break;
                default:
                    System.out.println("Neplatná volba.");
                    continue;
            }

            System.out.println("Aktuální poloha: " + hra.zobrazAktualniPolohu());
            System.out.println("Historie pohybu: " + hra.zobrazHistorii());
        }

        scanner.close();
    }
}
