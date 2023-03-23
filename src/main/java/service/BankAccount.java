package service;

public class BankAccount {
    private double balance;

    public BankAccount() {
        balance = 0;
    }

    public void withDraw(double amount) {
        if (amount > balance) {
            throw new IllegalArgumentException("Insuficient funds");
        }
        this.balance -= amount;
    }

    public void deposit(double amount) {
        if (amount < 0) {
            throw new IllegalArgumentException("Cannot deposit negative amount");
        }
        this.balance += amount;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
}
