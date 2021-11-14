package Lab01_2;
import java.util.*;
public class Question1_1{
    public static void main(String[] args) {
        int answer;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter 2 numbers");
        answer = myMax(scan.nextInt(),scan.nextInt());

        System.out.println("Your max value is:"+answer);
    }

    public static int myMax(int x,int y){
        if(x>y)
        return x;
        else
        return y;
    }
    public static int myMin(int x,int y){
        if(x<y)
        return x;
        else
        return y;
    }
}