package PreSchool.Library;
import java.util.Random;
import java.util.Scanner;

public class GuessNum {
    public static void main(String[] args) {
        
        Random num = new Random();
        Scanner input = new Scanner(System.in);
        int rand = 0 + num.nextInt(100);
        int guess = 0;
        while(guess<100){
            System.out.print("Enter guess number.. ");
            guess = input.nextInt();

            if (guess == rand){
                System.out.println("You win!! answer is "+rand);
                break;
            }
            if (guess <rand){
                System.out.println("Your number to low. Try again...");
            }
            if (guess>rand && guess<100 ){
                System.out.println("Your number is to high. Try again...");
            }
            if (guess > 99)
            System.out.println("You lose answer is "+rand);


        }
    }
    
}
