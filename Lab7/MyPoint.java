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
      return distance(this, secondPoint);
    }
  
    public static double distance(MyPoint p1, MyPoint p2) {
      return Math.sqrt((p1.x - p2.x) * (p1.x - p2.x) + (p1.y - p2.y)
          * (p1.y - p2.y));
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
