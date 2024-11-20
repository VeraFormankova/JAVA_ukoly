import VstupniOperace.NacteniHodnot;

public class Main {
    public static void main(String[] args) {
        double a = NacteniHodnot.nactiDouble("Zadejte hodnotu a: ");
        double b = NacteniHodnot.nactiDouble("Zadejte hodnotu b: ");
        double c = NacteniHodnot.nactiDouble("Zadejte hodnotu c: ");

        KvadratickaRovnice rovnice = new KvadratickaRovnice(a, b, c);

        System.out.println("Počet kořenů: " + KvadratickaRovniceVypocty.pocetKorenu(rovnice));

        double[] koreny = KvadratickaRovniceVypocty.koreny(rovnice);
        if (koreny.length == 0) {
            System.out.println("Žádné reálné kořeny.");
        } else {
            for (double kořen : koreny) {
                System.out.println("Kořen: " + kořen);
            }
        }

        double x = 1.0;  // Příklad hodnoty x pro výpočet f(x)
        System.out.println("f(" + x + ") = " + KvadratickaRovniceVypocty.f(x, rovnice));
    }
}
