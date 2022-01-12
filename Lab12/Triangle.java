package Lab12;

public class Triangle extends GeometricObject{
    private double side1 = 1.0, side2 = 1.0, side3 = 1.0;

  /** Constructor */
  public Triangle() {
  }

  public Triangle(double side1,double side2,double side3){
    this.side1 = side1;
    this.side2 = side2;
    this.side3 = side3;
  }
  public Triangle(double side1,double side2,double side3,String color,boolean filled){
    this.side1 = side1;
    this.side2 = side2;
    this.side3 = side3;
    setColor(color);
    setFilled(filled);
  }
  
  /** Constructor */
  // public Triangle(double side1, double side2, double side3) {
  //  super(color, filled);
  //   this.side1 = side1;
  //   this.side2 = side2;
  //   this.side3 = side3;
  //}
 
  
  public double getSide1() {
    return side1;
  }

  public double getSide2() {
    return side2;
  }
  
  public double getSide3() {
    return side3;
  }
  
  //@Override /** Override method findArea in GeometricObject */
  public double getArea() {
    double s = (side1 + side2 + side3) / 2.0;
    //return s;
    return Math.sqrt(s * ((s - side1) * (s - side2) * (s - side3)));
  }

  //@Override /** Override method findPerimeter in GeometricObject */
  public double getPerimeter() {
    return side1 + side2 + side3;
  }

  //@Override 
  public String toString() {
    // Implement it to return the three sides
    return "Triangle: side1 = " + side1 + " side2 = " + side2 +
      " side3 = " + side3;
  }
 
}
