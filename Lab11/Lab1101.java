package Lab11;

import java.util.Random;
import java.util.Scanner;

//User nane generator
public class Lab1101 {
    public static void main (String[] args)
   {
      String first, last, username;
      Scanner scan = new Scanner(System.in);
      Random rand = new Random();

      System.out.print ("Enter your first name: ");
      first = scan.nextLine();
      System.out.print ("Enter your last name: ");
      last = scan.nextLine();

      username = first.charAt(0) + last.substring(0, 5) +
                 (rand.nextInt(90) + 10);

      System.out.println ("Username: " + username);
   }

}
