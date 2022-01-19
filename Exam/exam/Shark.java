package exam;

public class Shark extends Animal{
    private double speed;

    public Shark(){
        super();
        speed = 0;
    }
    public Shark(double weight,String color,String food, double speed){
        super(weight, color, food);
        this.speed = speed;
    }

    public void setSpeed(double sp){
        this.speed = sp;
    }

    public String toString(){
        return super.toString()+" Speed: "+this.speed+" km/hr is shark";
    }
}
