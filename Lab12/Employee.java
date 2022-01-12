package Lab12;

public class Employee extends Person {
    protected String office;
    protected int salary;
  
    Employee(String name) {
      super(name, address, phoneNumber, email);
    }
    
    @Override
    public String toString() {
      return "Employee: " + getName();
    }
  
}
