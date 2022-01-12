package Lab12;

public class Lab1202 {
    public static void main(String[] args) {
        Person person = new Person("Peter","Chiangmai","0188831386","ball@gmail.com");
        Student student = new Student("Susan",1);
        Employee employee = new Employee("Eva");
        Faculty faculty = new Faculty("Frank");
        Staff staff = new Staff("Shane");
        
        System.out.println(person);
        student.setAddress("BKK");
        student.setEmail("susan@gmail.com");
        student.setPhone("081478956");
        System.out.println(student);
        // System.out.println(employee);
        // System.out.println(faculty);
        // System.out.println(staff);
      }
    
}
