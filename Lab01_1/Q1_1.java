package Lab01_1;
import java.util.Scanner;
public class Q1_1 {
	public static void main(String[] args) {
		int Value = 500;
		int number;
		Scanner scan = new Scanner(System.in);
		System.out.print("Input your number :");
		number = scan.nextInt();
		
		if(number >= Value){
			System.out.print("Your value is high enough.");
		}else{
			System.out.print("Your value is too low.");
		}
	}
}
