package Lab13;

public class Employee {
    private String name;
    private String position;
    private double salary;
    
    public Employee(){
        
    }
    
    public Employee(String name, String position, double salary){
        this.name = name;
        this.position = position;
        this.salary = salary;
    }
    
    public void setName(String n){
        this.name = n;
    }
    
    public void setPosition(String p){
        this.position = p;
    }
    
    public void setSalary(double s){
        this.salary = s;
    }
    
    public String toString(){
        return "This empolyee " + this.name + ". Posision is " + this.position + " has salary " + this.salary;
    }

}
