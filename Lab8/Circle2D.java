package Lab8;

public class Circle2D {
    private double x;
  private double y;
  private double radius;
  
  public Circle2D() {
    x = 0;
    y = 0;
    radius = 1;
  }
  
  public Circle2D(double x, double y, double radius) {
    this.x = x;
    this.y = y;
    this.radius = radius;
  }
  
  public double getX() {
    return x;
  }

  public void setX(double x) {
    this.x = x;
  }

  public double getY() {
    return y;
  }

  public void setY(double y) {
    this.y = y;
  }
  
  public double getRadius() {
    return radius;
  }

  public void setRadius(double radius) {
    this.radius = radius;
  }
  
  public double getPerimeter() {
    return 2 * radius * Math.PI;
  }
  
  public double getArea() {
    return radius * radius * Math.PI;
  }
  
  private static double distance(double x1, double y1, 
      double x2, double y2) {
    return Math.sqrt((x1 - x2) * (x1 - x2) + (y1 - y2) * (y1 - y2));
  }

}
