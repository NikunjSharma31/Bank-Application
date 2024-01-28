package Bank;

public class BankApp {
    private int id;
    private String Name;
    private String email;
    private double balance;

    BankApp(int id, String Name, String email, double balance) {
        this.id = id;
        this.Name = Name;
        this.email = email;
        this.balance = balance;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return Name;
    }

    public String getEmail() {
        return email;
    }

    public double getBalance() {
        return balance;
    }

    public void AddMoney(double depositedMoney) {
        this.balance += depositedMoney;
        System.out.println("Your total balance is : " + this.balance);
    }

    public void WithDrawMoney(double WithDrawedMoney) {
        if (balance - WithDrawedMoney > 0) {
            this.balance -= WithDrawedMoney;
            System.out.println("Your balance after withdrawal is : " + this.balance);
        } else {
            System.out.println("Withdrawal Unsuccessful");
        }
    }

}
