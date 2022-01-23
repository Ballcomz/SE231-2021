<<<<<<< HEAD
//package Lab5;
=======

>>>>>>> 15027dae4fe64d3d3b727c7a0a28969d98390638
import java.util.Date;
public class Q51 {
  public static void main(String[] args) {
      Date date = new Date();

      int count = 1;
      long time = 10000;

      while (count <=8){
        date.setTime(time);
        System.out.println(date.toString());
        count++;
        time*=10;
      }
  }  
}
