public class CheckingAccount extends Account {
    public CheckingAccount(String name) {
        super(name);
    }

    @Override
    public void withdraw(double fund) {
        if (super.balance - fund <= 0) {
            fund = 0;
            System.out.println("Your account has not enough money.");
            //return fund;
        } else {
            super.balance -= fund;
            //return fund;
        }
    }
 
}
