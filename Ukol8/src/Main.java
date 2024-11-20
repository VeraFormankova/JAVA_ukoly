public class Main {

    // a) Funkce pro rozdělení jména a příjmení
    public static void parseJmenoPrijmeni1(String input) {
        String[] parts = input.split(" ");  // Rozdělí podle jediné mezery
        String jmeno = parts[0];  // Jméno je první prvek
        String prijmeni = parts[1];  // Příjmení je druhý prvek

        System.out.println("'" + jmeno + "'");
        System.out.println("'" + prijmeni + "'");
    }

    // b) Funkce pro rozdělení jména a příjmení s libovolným počtem mezer
    public static void parseJmenoPrijmeni2(String input) {
        String[] parts = input.trim().split("\\s+");  // Odstraní mezery na začátku a konci a rozdělí podle libovolného počtu mezer
        String jmeno = parts[0];
        String prijmeni = parts[1];

        System.out.println("'" + jmeno + "'");
        System.out.println("'" + prijmeni + "'");
    }

    // c) Funkce vracející jméno a příjmení v poli
    public static String[] parseJmenoPrijmeni2Return(String input) {
        String[] parts = input.trim().split("\\s+");
        return new String[] { "'" + parts[0] + "'", "'" + parts[1] + "'" };  // Vrátí pole s hodnotami v apostrofech
    }

    // d) Funkce pro rozdělení loginů oddělených středníkem
    public static String[] parseLogin(String input) {
        return input.split(";");  // Rozdělí řetězec podle středníku
    }

    // e1) Funkce pro zpracování celých čísel oddělených středníkem
    public static int[] parseCislaInt(String input) {
        String[] parts = input.split(";");  // Rozdělí podle středníku
        int[] result = new int[parts.length];

        for (int i = 0; i < parts.length; i++) {
            result[i] = Integer.parseInt(parts[i]);  // Převod na celé číslo
        }

        return result;
    }

    // e2) Funkce pro zpracování desetinných čísel oddělených středníkem
    public static double[] parseCislaDouble(String input) {
        String[] parts = input.split(";");  // Rozdělí podle středníku
        double[] result = new double[parts.length];

        for (int i = 0; i < parts.length; i++) {
            result[i] = Double.parseDouble(parts[i]);  // Převod na číslo s plovoucí desetinnou čárkou
        }

        return result;
    }

    public static void main(String[] args) {
        // Testování všech funkcí:

        System.out.println("a) Funkce parseJmenoPrijmeni1:");
        parseJmenoPrijmeni1("Jan Novak");

        System.out.println("\nb) Funkce parseJmenoPrijmeni2:");
        parseJmenoPrijmeni2("   Jan   Novak   ");

        System.out.println("\nc) Funkce parseJmenoPrijmeni2 (vrací hodnotu):");
        String[] vysledek = parseJmenoPrijmeni2Return("   Jan   Novak   ");
        System.out.println(vysledek[0]);  // Výstup: 'Jan'
        System.out.println(vysledek[1]);  // Výstup: 'Novak'

        System.out.println("\nd) Funkce parseLogin:");
        String[] loginy = parseLogin("user1;user2;user3");
        for (String login : loginy) {
            System.out.println(login);  // Výstup: user1, user2, user3
        }

        System.out.println("\ne1) Funkce parseCislaInt:");
        int[] cislaInt = parseCislaInt("10;20;30");
        for (int num : cislaInt) {
            System.out.println(num);  // Výstup: 10, 20, 30
        }

        System.out.println("\ne2) Funkce parseCislaDouble:");
        double[] cislaDouble = parseCislaDouble("10.5;20.75;30.25");
        for (double num : cislaDouble) {
            System.out.println(num);  // Výstup: 10.5, 20.75, 30.25
        }
    }
}
