package Lab01_1;
import java.util.Scanner;
public class Q1_2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number;
        System.out.println("Welcome to OOP Lab.");
        System.out.println("  1. Menu 1.");
        System.out.println("  2. Menu 2.");
        System.out.println("  3. Menu 3.");
        System.out.println("  4. Menu 4.");
        System.out.println("  5. Bye bye.");
        
        System.out.print("Your input: ");
        
        number = input.nextInt();
        
        switch (number) {
            case 1:
                System.out.println("Welcome to Menu 1.");
                break;
            case 2:
                System.out.println("Welcome to Menu 2.");
                break;
            case 3:
                System.out.println("Welcome to Menu 3.");
                break;
            case 4:
                System.out.println("Welcome to Menu 4.");
                break;
            case 5:
                System.out.println("Bye bye, see you tommorow.");
                break;
            default:
                System.out.println("You select wrong.");
                break;
        }
    }
}

