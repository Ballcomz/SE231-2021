

public class Dog extends Pet2{ // Missing 3
    String size;
    boolean shortHair;

    public Dog(String name,String species,String color,int age){
        super(name,species,color,age);

    }

    public void dogRun(){
        System.out.println("run"); // Missing 4
    }

    public void dogBark(){
        System.out.println(size+" bark Box Box!!");
    }

    public void dogHair() {
       System.out.println("hair");;  // Missing 5
    }
   
}