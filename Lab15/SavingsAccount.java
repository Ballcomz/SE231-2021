public class SavingsAccount extends Account {
    private final int WITHDRAW_LIMIT = 5;
    private int withdraw_no = 1;

    public SavingAccount(String name) {
        super(name);
    }

    public void withdraw(double fund) {

        if ((super.balance - fund > 0) && (withdraw_no <= WITHDRAW_LIMIT)) {
            super.balance -= fund;
            System.out.println(withdraw_no);
            System.out.println(balance);
            withdraw_no++;
            
        } else {
            System.out.println("Your withdraw can not process.");
            System.out.println("This month you attemp to withdraw " + withdraw_no + " times.");
        }

    }

}
