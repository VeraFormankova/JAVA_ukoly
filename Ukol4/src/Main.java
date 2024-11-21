public class Main {
    public static void main(String[] args) {
        // Testování RGB barev
        BarvaRGB barva1 = new BarvaRGB1(100, 150, 200);
        BarvaRGB barva2 = new BarvaRGB2(50, 75, 100);

        System.out.println("Barva1 (průměr): " + barva1.getIntenzita());
        System.out.println("Barva2 (vážený průměr): " + barva2.getIntenzita());

        // Výstup pro hexadecimální formát
        System.out.println("Barva1 (Hex): " + barva1.toHex());
        System.out.println("Barva2 (Hex): " + barva2.toHex());

        // Testování nádrže
        try {
            Nadrz nadrz = new Nadrz(100, TypObsahu.VODA);
            nadrz.plnit(50);
            System.out.println(nadrz.getStav());

            nadrz.odebrat(30);
            System.out.println(nadrz.getStav());

            nadrz.plnit(80); // Vyvolá výjimku
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
    }
}
