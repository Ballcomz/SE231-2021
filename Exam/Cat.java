

public class Cat extends pet{
    
    public String speak() {
              return "Meow Meow";
            }
        
            public static void main(String[] args) {
                pet myCat = new pet();
                myCat.setName("kitty");
               System.out.println("My name is " + myCat.getName());
               System.out.println(myCat.speak());
           }
        }
