package Lab01_2;
import java.util.*;
public class Question1_2 {
    public static void main(String[] args) {

        double c=40;
        double f=0;
        System.out.println("Celcsius----Fahrenheit");
        while(c<=80){
            f=cToF(c);
            System.out.println(c+"----"+f);
            c=c+5;

        }

        System.out.println("");
    }
    public static int cToF(double c)
    {
        return (int) ((9/5)*c + 32);
    }

}
