// VstupniOperace/NacteniHodnot.java
package VstupniOperace;

import java.util.Scanner;

public class NacteniHodnot {
    public static double nactiDouble(String zprava) {
        Scanner scanner = new Scanner(System.in);
        System.out.print(zprava);
        return scanner.nextDouble();
    }
}
