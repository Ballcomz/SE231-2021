

public class Pet2 {
    public Pet2(String name, String species, String color, int age) {
    }

    public class Pet {
        String name;
        String species;
        String color;
        int age;
    
        public Pet(){
        }
    
        public Pet(String name,String species,String color,int age){
            this.name = name;
            this.species = species;
            this.color = color;
            this.age = age;
        }
    
        public void showPetData(){
        System.err.println("show data");; // Missing 2.
        }
    }
}
    
   