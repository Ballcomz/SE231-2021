package Lab9;

public class CarTest {
    public static void main(String[] args) {
        Car c1 = new Car();
        c1.setMake("Toyota");
        c1.setModel("Corola");
        c1.setYear(2000);        
        System.out.println(c1.toString());
        
        Car c2 = new Car();
        c2.setMake("Honda");
        c2.setModel("Jazz");
        c2.setYear(2010);        
        System.out.println(c2.toString());
        
    }

}
