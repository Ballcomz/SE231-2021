package Lab01_2;
import java.util.*;
public class Question2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] data = new int[10];
        int i = 0;
        int sentinel = 0;
        while (sentinel != -999 && i < 10)
        {
            System.out.print("Enter the number: ");
            sentinel = scan.nextInt();
            data[i] = sentinel;
            i++;
        }
        System.out.print("size of this array is " + readData(data));
    }
    public static int readData(int[] x)
    {
        int size = 0, i = 0;
        while (x[i] != -999){
            size++;
            i++;
        }
        return size;
    }

}
