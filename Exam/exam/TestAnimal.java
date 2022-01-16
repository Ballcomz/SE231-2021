package exam;

public class TestAnimal {
    public static void main(String[] args) {
        Elephant ele1 = new Elephant(2000, "gray", "banana", "Dumbo", 4);
        Shark sh1 = new Shark(400, "blue", "seal", 80.0);
        

        System.out.println(ele1.toString());
        System.out.println(sh1.toString());
    }
}
