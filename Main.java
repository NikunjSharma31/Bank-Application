package Bank;

public class Main {
    public static void main(String[] args) {
        BankApp ob1 = new BankApp(1, "Nikunj", "Nikunj@gmail.com", 100.00);
        ob1.AddMoney(200);
        ob1.WithDrawMoney(100);

        System.out.println("Id of the account holder : " + ob1.getId());
        System.out.println("Account Holder name : " + ob1.getName());
        System.out.println("Email-id of the account holder : " + ob1.getEmail());
        System.out.println("The balance of the account holder : " + ob1.getBalance());

    }
}
