
import java.util.Date; // import Date class
public class Lab51 {
    public static void main(String[] args) {
        Date date = new Date();
        
        int count = 1;
        long time = System.currentTimeMillis();
        
        while (count <= 8) {
          date.setTime(time);
          System.out.println(date.toString());   
          count++;
          //time *= 10;
        }
      }    
}
