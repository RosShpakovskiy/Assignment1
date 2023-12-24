package Shpakovskiy;

public class Point {
    private int x;
    private int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public double distanceTo(Point next) {
        return Math.sqrt(Math.pow(this.x - next.x, 2) + Math.pow(this.y - next.y, 2));
    }

    public String toString() {
        return "(" + x + ", " + y + ")";
    }
}
