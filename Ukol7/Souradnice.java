
public class Souradnice {
    public int x;
    public int y;

    public Souradnice(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public String toString() {
        return String.format("[%d, %d]", x, y);
    }
}
