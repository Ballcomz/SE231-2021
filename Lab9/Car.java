package Lab9;

public class Car {
    private String make;
    private String model;
    int year;

    public Car() {
        make = "";
        model = "";
        year = 0;
    }
    
    public String getMak(){
        return make;
    }
    
    public String getModel(){
        return model;
    }
    
    public int getYear(){
        return year;
    }
    
    public void setMake(String m){
        make = m;
    }
    
    public void setModel(String md){
        model = md;
    }
    
    public void setYear(int y){
        year = y;
    }
    
    public String toString(){
        return "\nCar: " + make + " \nModel: " + model + " \nYear: " + year;

    } 
    
    public boolean isAntique(){
        if (year >= 45)
            return true;
        else
            return false;
    }

}
