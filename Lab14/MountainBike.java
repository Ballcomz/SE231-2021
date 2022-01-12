package Lab14;

public class MountainBike extends Bicycle {
    private int gear;
    
    public MountainBike(){
        
    }
    
    public MountainBike(int speed, int gear){
        super(speed);
        this.gear = gear;
    }
    
    public void gearUp(){
        gear += 1;
        if (gear >= 5){
            gear = 5;
        }
    }
    
    public void gearDown(){
        gear -= 1;
        if(gear <= 1){
            gear = 1;
        }
    }
    
    public int getGear(){
        return gear;
    }
    
    public void speedUP(int increment){
        speed += (increment * gear);
        if (speed >= 200){
            speed = 200;
        }
    }
 
}
