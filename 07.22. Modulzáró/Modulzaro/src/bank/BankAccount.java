package bank;

import java.util.List;

public class BankAccount {
    private String accountName;
    private Double balance;
    private final String accountNumber;
    private static BankAccount toTransfer;

    public BankAccount(String accountName, Double balance, String accountNumber) {
        this.accountName = accountName;
        this.balance = balance;
        this.accountNumber = accountNumber;
    }

    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }

    public void setBalance(Double balance) {
        this.balance = balance;
    }

    public String getAccountName() {
        return accountName;
    }

    public Double getBalance() {
        return balance;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void deposit(Double ammountOfMoney) {
        this.balance += ammountOfMoney;
    }

    public void withdraw(Double ammountOfMoney) throws InvalidTransactionException {
        if (ammountOfMoney <= this.balance) {
            this.balance -= ammountOfMoney;
        } else {
            throw new InvalidTransactionException();
        }
    }

    public static boolean isValidAccountNumber(String accountNumber) {
        if (Integer.parseInt(accountNumber) >= 20) {
            for (int i = 0; i < accountNumber.length(); i++) {
                if (accountNumber.charAt(0) % 2 == 0 && accountNumber.charAt(accountNumber.length() - 1) % 2 == 0) {
                    return true;
                } else if (accountNumber.charAt(0) % 2 != 0 && accountNumber.charAt(accountNumber.length() - 1) % 2 != 0) {
                    return true;
                }
            }
        }
        return false;
    }

    public void transfer(String accountNumber, Double ammountOfMoney) throws InvalidTransactionException {
        if (toTransfer.accountNumber.equals(accountNumber) &&
                ammountOfMoney <= this.balance &&
                isValidAccountNumber(toTransfer.accountNumber)) {
            toTransfer.balance += ammountOfMoney;
        }
        throw new InvalidTransactionException();
    }
}
