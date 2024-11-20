import java.util.ArrayList;
import java.util.List;
import static java.lang.Math.sqrt;
import static java.lang.Math.pow;
import static java.lang.Math.abs;
import java.util.Random;


public class ToolHistoriePohybu {

    private List<Souradnice> souradnice;
    public double spoctiVzdalenostPole() {

        int size = this.souradnice.size();

        // iterate through all items in list if there is 2 or more coordinates instances
        if (size > 1) {
            double sum_d = 0;
            for (int i = 0; i < size-1; i++) {
                // for each pair calculate the distance on axis
                double x = abs(this.souradnice.get(i).x - this.souradnice.get(i+1).x);
                double y = abs(this.souradnice.get(i).y - this.souradnice.get(i+1).y);

                // calculate the distance with a formula (pythogorean theorem)
                double d = sqrt(pow(x, 2) + pow(y, 2));
                sum_d += d;
            }
            return sum_d;
        }

        return 0.0;
    }

    public String sestavVyslednouCestu() {
        String cesta = "#Move | Coordinates\n";
        
        for (int i = 0; i < this.souradnice.size(); i++) {
            cesta += String.format("%-5d | %s\n", i, this.souradnice.get(i).toString());
        }
        return cesta;
    }

    // Tohle trochu odbocuje od zadani, ale pouziti konstruktoru se mi tady zda lepsi
    public ToolHistoriePohybu(List<Souradnice> souradnice) {
        this.souradnice = souradnice;
    }


    public static void main(String[] args) {
        String output = "";
        Random rand = new Random();
        List<Souradnice> s = new ArrayList<>();

        for (int i = 1; i <= 10; i++) {
            s.add(new Souradnice(rand.nextInt(8), rand.nextInt(8)));
        }

        ToolHistoriePohybu tool = new ToolHistoriePohybu(s);

        output += tool.sestavVyslednouCestu();
        output += String.format("Total distance traveled: %.4f\n", tool.spoctiVzdalenostPole());
        System.out.println(output);
    }
}