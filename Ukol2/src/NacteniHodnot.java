import java.util.Scanner;

public class NacteniHodnot {
    private static Scanner scanner = new Scanner(System.in);

    // Metoda pro načtení celého čísla
    public static int nactiCislo(String vyzva) {
        System.out.print(vyzva);
        while (!scanner.hasNextInt()) {
            System.out.println("Neplatný vstup, zadejte celé číslo.");
            scanner.next(); // Vyčistit neplatný vstup
            System.out.print(vyzva);
        }
        return scanner.nextInt();
    }
}
