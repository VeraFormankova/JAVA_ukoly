import java.util.ArrayList;
import java.util.List;

public class HraPosunPoSachovnici {
    private final int nx, ny;
    private int x, y;
    private final List<String> historie;

    public HraPosunPoSachovnici(int nx, int ny) {
        this.nx = nx;
        this.ny = ny;
        this.x = 0;
        this.y = 0;
        this.historie = new ArrayList<>();
        this.historie.add("[0;0]");
    }

    public void posun(SmerPohybu smer) {
        switch (smer) {
            case LEFT:
                if (y > 0) y--;
                break;
            case RIGHT:
                if (y < ny - 1) y++;
                break;
            case UP:
                if (x > 0) x--;
                break;
            case DOWN:
                if (x < nx - 1) x++;
                break;
        }
        historie.add("[" + x + ";" + y + "]");
    }

    public String zobrazAktualniPolohu() {
        return "[" + x + ";" + y + "]";
    }

    public List<String> zobrazHistorii() {
        return new ArrayList<>(historie);
    }
}
