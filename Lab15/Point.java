public class Point {
    private double x;
    private double y;

    public Point(double nx, double ny) {
        this.x = nx;
        this.y = ny;

    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;

    }

    public boolean equal(Point p) {
        if ((this.x == p.x) && (this.y == p.y)) {
            return true;
        } else {
            return false;
        }
    }

    public void printInfo() {
        System.out.println("(" + x + ", " + y + ")");

    }

}
