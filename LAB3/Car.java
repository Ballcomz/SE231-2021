<<<<<<< HEAD
//package LAB3;
=======

>>>>>>> 15027dae4fe64d3d3b727c7a0a28969d98390638
//Class name
public class Car {
    //Data field
    private String color;
    private int speed;
    private int mileage;

//constructor
public Car(String col){
    color = col;
    speed = 0;
    mileage = 0;

    }
//method for retrive value from object
    public String getColor() {
    return color;
}
public int getSpeed(){
    return speed;
}
public int getMileage(){
    return mileage;
}
//method for assign value to object
public void setSpeed(int sp){
    speed = sp;
}
public void setMileage(int ml){
    mileage = ml;
}
}