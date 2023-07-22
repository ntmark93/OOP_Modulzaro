import bank.BankAccount;

public class Main {
    public static void main(String[] args) {
        BankAccount test = new BankAccount("J",200.0,"1991");
        BankAccount test1 = new BankAccount("J",200.0,"1991");
        System.out.println(BankAccount.isValidAccountNumber("20"));

    }
}