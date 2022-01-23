public class Account1 {
    private int id;
  private String name;
  private double balance;
  private static double annualInterestRate;
  private java.util.Date dateCreated;
  private java.util.ArrayList<Transaction> transactions = new java.util.ArrayList<>();

  public Account1() {
    dateCreated = new java.util.Date();
  }

  public Account1(String name, int id, double balance) {
    this.id = id;
    this.name = name;
    this.balance = balance;
    dateCreated = new java.util.Date();
  }
  
  public int getId() {
    return this.id;
  }

  public double getBalance() {
    return balance;
  }

  public java.util.ArrayList<Transaction> getTransactions() {
    return transactions;
  }

  public String getName() {
    return name;
  }
  
  public static double getAnnualInterestRate() {
    return annualInterestRate;
  }

  public void setId(int id) {
    this.id =id;
  }

  public void setBalance(double balance) {
    this.balance = balance;
  }

  public static void setAnnualInterestRate(double annualInterestRate) {
    Account1.annualInterestRate = annualInterestRate;
  }

  public double getMonthlyInterest() {
    return balance * (annualInterestRate / 1200);
  }

  public java.util.Date getDateCreated() {
    return dateCreated;
  }

  public void withdraw(double amount) {
    balance -= amount;
    transactions.add(new Transaction('W', amount, balance, ""));
  }

  public void deposit(double amount) {
    balance += amount;
    transactions.add(new Transaction('D', amount, balance, ""));
  }

}
