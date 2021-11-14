package Lab01_2;
import java.util.*;
public class Question3 {
    public static void main(String[] args) {
        double[][] m = new double[3][4];
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number: ");
        for(int i = 0; i < m.length; i++)
        {
            m[i][0] = input.nextDouble();
            m[i][1] = input.nextDouble();
            m[i][2] = input.nextDouble();
            m[i][3] = input.nextDouble();
        }
        System.out.println("Sum of the elements at column 0 is " + sumColumn(m, 0));
        System.out.println("Sum of the elements at column 1 is " + sumColumn(m, 1));
        System.out.println("Sum of the elements at column 2 is " + sumColumn(m, 2));
        System.out.println("Sum of the elements at column 3 is " + sumColumn(m, 3));
        
       
    }
    public static double sumColumn(double[][] m, int columnIndex)
    {
        double sum = 0;
        for(int i = 0; i < m.length; i++)
            sum = sum + m[i][columnIndex];
        return sum;
    }

}
