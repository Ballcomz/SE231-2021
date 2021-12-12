package Lab9;

public class kennel {
    public static void main(String[] args) {
        Dog pet1 = new Dog("Lucky",4);
        Dog pet2 = new Dog("Milo", 12);
        Dog pet3 = new Dog("Tony", 9);

        System.out.println(pet1.toString());
        System.out.println(pet2.toString());
        System.out.println(pet3.toString());
    }
}
