// KvadratickaRovniceVypocty.java
public class KvadratickaRovniceVypocty {

    public static double f(double x, KvadratickaRovnice rovnice) {
        return rovnice.getA() * x * x + rovnice.getB() * x + rovnice.getC();
    }

    public static int pocetKorenu(KvadratickaRovnice rovnice) {
        double diskriminant = rovnice.getB() * rovnice.getB() - 4 * rovnice.getA() * rovnice.getC();
        if (diskriminant > 0) {
            return 2;  // Dva reálné kořeny
        } else if (diskriminant == 0) {
            return 1;  // Jeden reálný kořen
        } else {
            return 0;  // Žádný reálný kořen
        }
    }

    public static double[] koreny(KvadratickaRovnice rovnice) {
        double diskriminant = rovnice.getB() * rovnice.getB() - 4 * rovnice.getA() * rovnice.getC();
        if (diskriminant < 0) {
            return new double[0]; // Žádné reálné kořeny
        } else if (diskriminant == 0) {
            double x = -rovnice.getB() / (2 * rovnice.getA());
            return new double[]{x};  // Jeden kořen
        } else {
            double x1 = (-rovnice.getB() + Math.sqrt(diskriminant)) / (2 * rovnice.getA());
            double x2 = (-rovnice.getB() - Math.sqrt(diskriminant)) / (2 * rovnice.getA());
            return new double[]{x1, x2};  // Dva kořeny
        }
    }
}
