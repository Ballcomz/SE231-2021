package Lab14;

public class Bicycle {
    int speed;

    public Bicycle() {
        speed = 0;
    }

    public Bicycle(int speed) {
        this.speed = speed;
    }

    public void speedUp(int increment) {
        speed += increment;
        if (speed >= 99){
            speed = 99;
        }
    }

    public void applyBrake(int decrement) {
        speed -= decrement;
        if (speed <= 0){
            speed = 0;
        }
    }

    public int getSpeed() {
        return speed;
    }


}
