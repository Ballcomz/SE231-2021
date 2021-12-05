package Lab7;

public class MyPoint {
  private double x;
  private double y;

  public MyPoint() {
  }

  public MyPoint(double x, double y) {
    this.x = x;
    this.y = y;
  }

  public double distance(MyPoint secondPoint) {
    return distance(secondPoint.getX(), secondPoint.getY());
  }

  public double distance(double nx, double ny) {
    return Math.sqrt((this.x - nx) * (this.x - nx) + (this.y - ny)
        * (this.y - ny));
  }

  public static double distance(MyPoint p1, MyPoint p2) {
    return p2.distance(p1);
  }

  public double getX() {
    return x;
  }

  public double getY() {
    return y;
  }

}
