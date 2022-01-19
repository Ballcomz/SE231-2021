

import java.util.ArrayList;
import java.util.Date;

public class Lab16_02  {
    public static void main(String[] args) {
        ArrayList<Object> list = new ArrayList<>();
        list.add(new Loan());
        list.add("ABC");
        list.add(new Date());

        Loan test = new Loan("ball", 1000);
        list.add(test);

        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }

        System.out.println(test.toString());
    }
}

class Loan {

    private String name;
    private double amount;

    public Loan() {
        this.name = "John Doe";
        this.amount = 0.0;
    }

    public Loan(String name, double amount) {
        this.name = name;
        this.amount = amount;
    }

    public double getAmount() {
        return amount;
    }

    public String getName() {
        return name;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public void setName(String name) {
        this.name = name;
    }

    

}
