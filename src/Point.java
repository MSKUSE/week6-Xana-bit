public class Point {

    protected int xCoord, yCoord;

    // Varsayılan constructor
    public Point() {}

    // x ve y'yi ayrı ayrı alan constructor
    public Point(int x, int y) {
        this.xCoord = x;
        this.yCoord = y;
    }

    // x ve y'yi aynı alan constructor (örneğin Point(5) → (5,5))
    public Point(int xy) {
        this.xCoord = xy;
        this.yCoord = xy;
    }

    // Getter'lar
    public int getX() {
        return xCoord;
    }

    public int getY() {
        return yCoord;
    }

    // Setter'lar
    public void setX(int x) {
        this.xCoord = x;
    }

    public void setY(int y) {
        this.yCoord = y;
    }
}
