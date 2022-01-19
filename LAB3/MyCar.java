

public class MyCar {
    public static void main(String[] args) {
		//create objects
		Car toyota = new Car("red");
		Car honda = new Car("blue");
		//assign data to toyota object
		toyota.setSpeed(200);
		toyota.setMileage(1345);

		//assign data to honda object
		honda.setSpeed(300);
		honda.setMileage(8987);

		
        //print object
		System.out.println("Toyota color: "+toyota.getColor()+" speed: "+toyota.getSpeed()+" mileage: "+toyota.getMileage() );
		
		System.out.println("Honda color: " +honda.getColor()+ " speed: "+honda.getSpeed() +" mileage: "+honda.getMileage() );
	}

}
