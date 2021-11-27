package Lab2_1;

public class MyCar {
    public static void main(String[] args) {
        Car toyota = new Car("red");
		Car honda = new Car("blue");
		
		toyota.setSpeed(200);
		toyota.setMileage(1345);
		
		honda.setSpeed(300);
		honda.setMileage(8987);
		
		System.out.println(
				"Toyota color: "+ toyota.getColor() + 
				" speed: " + toyota.getSpeed() + 
				" mileage: " + toyota.getMileage());
		
		System.out.println(
			    "Honda color: "+ honda.getColor() + 
				" speed: " + honda.getSpeed() + 
				" mileage: " + honda.getMileage());
	}

    }

