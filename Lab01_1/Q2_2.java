package Lab01_1;

public class Q2_2 {
    public static void main(String[] args) {
        int daily_deposit = 1;
        int vader_deposit = 0;
        int day_count = 0;
        while (vader_deposit <= 1000000)
        {
            vader_deposit = vader_deposit + daily_deposit;
            System.out.print(" "+vader_deposit); 
            daily_deposit = 2 * daily_deposit;
            day_count = day_count + 1;
        }
        System.out.println("\nNumber of days is "+day_count+" days.");
       }
   
}
