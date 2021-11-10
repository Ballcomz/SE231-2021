package Lab01_1;

public class Q2_1 {
    public static void main(String[] args) {
        int daily_deposit = 1;
        int anakin_deposit = 0;
        for (int i = 1; i <= 30; i++)
        {
            anakin_deposit = anakin_deposit+daily_deposit;
            System.out.println(" "+anakin_deposit); 
            daily_deposit = 2 * daily_deposit;
        }
    }

}
