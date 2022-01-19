
import java.util.Date;

public class Account {
    private String account_no;
    double balance;
    private double interest_rate;
    Date date;

    public Account(String account_no) {
        this.account_no = account_no;
        date = new Date();
    }

    public void deposit(double fund) {
        balance += fund;
    }

    public void withdraw(double fund) {
        balance -= fund;
        //return fund;
    }
    
    public double getBalance(){
        return balance;
    }

}
