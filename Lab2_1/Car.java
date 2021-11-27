package Lab2_1;

public class Car {
    private String color;
    private int speed;
    private int mileage;

    public Car(String col){
        color = col;
        speed = 0;
        mileage = 0;

    }
public void setSpeed(int sp){
    speed = sp;
}
public void setMileage(int ml){
    mileage = ml;
}
public String getColor(){
    return color;
}
public int getSpeed(){
    return speed;
}
public int getMileage(){
    return mileage;
}
}
