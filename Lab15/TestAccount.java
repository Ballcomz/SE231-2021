public class TestAccount {
    public static void main(String[] args) {
        
        
        SavingAccount sa1 = new SavingAccount("Galileo");
        CheckingAccount ca1 = new CheckingAccount("Albert");
        sa1.deposit(1000000);
        sa1.withdraw(2000000);
        sa1.withdraw(10);
        sa1.withdraw(10);
        sa1.withdraw(10);
        sa1.withdraw(10);
        sa1.withdraw(10);
        sa1.withdraw(10);

        //sa1.withdraw(100);
    
        ca1.deposit(1000000);
        ca1.withdraw(2000000);
        
        
    }

}
