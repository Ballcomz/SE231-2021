package Lab14;

import java.util.Random;

public class TestBike {
    public static void main(String[] args) {
        Bicycle b1 = new Bicycle(20);
        Random r = new Random();
        for (int i = 1; i <= 5; i++){
            b1.speedUp(r.nextInt(100));
            System.out.println("Speed after speed up is " + b1.getSpeed());
        }
        
        for (int i = 1; i <= 5; i++){
            b1.applyBrake(r.nextInt(100));
            System.out.println("Speed after speed down is " + b1.getSpeed());
        }
        
        MountainBike m1 = new MountainBike(20,1);
        for (int i = 1; i <= 5; i++){
            m1.speedUp(r.nextInt(100));
            m1.gearUp();
            System.out.println("Speed after speed up is " + m1.getSpeed() + ". Gear is " + m1.getGear());
        }
         for (int i = 1; i <= 5; i++){
            m1.applyBrake(r.nextInt(100));
            m1.gearDown();
            System.out.println("Speed after speed down is " + m1.getSpeed() + ". Gear is " + m1.getGear());
        }
        
    }

}
