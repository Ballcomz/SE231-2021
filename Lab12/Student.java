package Lab12;

public class Student extends Person {
    public static int FRESHMAN = 1;
    public static int SOPHOMORE = 2;
    public static int JUNIOR = 3;
    public static int SENIOR = 4;
  
    protected int status;
  
    Student(String name,int status) {
      super(name, address, phoneNumber, email);
      this.status = status;
    }
    
    @Override
    public String toString() {
      return "Student: " + getName()+" Status: "+status+" Address: "+getAdd()+" Phone: "+getPhone()+" Email: "+getEmail();
    }
  
}
