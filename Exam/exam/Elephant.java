package exam;

public class Elephant extends Animal {
    private String name;
    private int age;

    public Elephant(){
       super();
       name ="";
       age = 0;

    }
    public Elephant(double weight,String color,String food,String name, int age){
        super(weight, color, food);
        this.name = name;
        this.age = age;
    }
    public void setName(String n){
        this.name = n;
    }

    public void setAge(int age){
        this.age = age;
    }

    public String toString(){
        return super.toString()+" name: "+this.name+" age"+this.age+" year is elephant";
    }
}
