package Lab10;

import java.util.Scanner;

public class Lab103 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s;
        int count = 0;
        
        System.out.print("Enter a string : ");
        s = scan.nextLine();
        
        for (int i = 0; i < s.length(); i++)
        {
            if (s.charAt(i) == ' ')
                count++;
        }
        
        System.out.println("The number of words is " + (count +1));
    }

}
